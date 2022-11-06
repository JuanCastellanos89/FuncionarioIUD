package Dao;

/**
 *
 * @author Juan Castellanos
 */
import datos.Conexion;
import domain.Funcionario;
import java.util.ArrayList;
import java.sql.*;

public class FuncionarioDAO {

    private static final String SQL_SELECT = "SELECT id_persona, identificacion, nombres, apellidos, estado_civil, sexo, direccion, celular, fecha_nacimiento, tipo_documento FROM tbl_datos_personales";
    private static final String SQL_INSERT = "INSERT INTO tbl_datos_personales (identificacion, nombres, apellidos, estado_civil, sexo, direccion, celular, fecha_nacimiento, tipo_documento) VALUES (?,?,?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE tbl_datos_personales SET identificacion = ?, nombres = ?, apellidos = ?, estado_civil = ?, sexo = ?, direccion = ?, celular = ?, fecha_nacimiento = ?, tipo_documento = ? WHERE id_persona = ?";
    private static final String SQL_DELETE = "DELETE FROM tbl_datos_personales WHERE id_persona = ?";

    public ArrayList<Funcionario> consultar() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Funcionario funcionario = null;
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idFuncionario = rs.getInt("id_persona");
                String identificacion = rs.getString("identificacion");
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String estadoCivil = rs.getString("estado_civil");
                String sexo = rs.getString("sexo");
                String direccion = rs.getString("direccion");
                String celular = rs.getString("celular");
                String fechaNacimiento = rs.getString("fecha_nacimiento");
                String tipoDocumento = rs.getString("tipo_documento");

                funcionario = new Funcionario(idFuncionario, identificacion, nombres, apellidos, estadoCivil, sexo, direccion, celular, fechaNacimiento, tipoDocumento);

                funcionarios.add(funcionario);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return funcionarios;
    }

    public int insertar(Funcionario funcionario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, funcionario.getIdentificacion());
            stmt.setString(2, funcionario.getNombres());
            stmt.setString(3, funcionario.getApellidos());
            stmt.setString(4, funcionario.getEstadoCivil());
            stmt.setString(5, funcionario.getSexo());
            stmt.setString(6, funcionario.getDireccion());
            stmt.setString(7, funcionario.getCelular());
            stmt.setString(8, funcionario.getFechaNacimiento());
            stmt.setString(9, funcionario.getTipoDocumento());
            registros = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int modificar(Funcionario funcionario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, funcionario.getIdentificacion());
            stmt.setString(2, funcionario.getNombres());
            stmt.setString(3, funcionario.getApellidos());
            stmt.setString(4, funcionario.getEstadoCivil());
            stmt.setString(5, funcionario.getSexo());
            stmt.setString(6, funcionario.getDireccion());
            stmt.setString(7, funcionario.getCelular());
            stmt.setString(8, funcionario.getFechaNacimiento());
            stmt.setString(9, funcionario.getTipoDocumento());
            stmt.setInt(10, funcionario.getIdFuncionario());
            
            registros = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int eliminar(Funcionario funcionario) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, funcionario.getIdFuncionario());
            registros = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return registros;
    }
}
