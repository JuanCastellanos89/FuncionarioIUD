package Dao;

/**
 *
 * @author Berserk
 */
import datos.Conexion;
import java.sql.*;
import java.util.*;
import domain.Academico;

public class AcademicoDAO {
    private static final String SQL_SELECT ="SELECT nombre_universidad, nivel, titulo, id_funcionario FROM tbl_datos_academicos";
    
    
    public List<Academico> consultar(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Academico academico = null;
        List<Academico> academicos = new ArrayList<>();
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                
                String universidad = rs.getString("nombre_universidad");
                String nivel = rs.getString("nivel");
                String titulo = rs.getString("titulo");
                int idFuncionario = rs.getInt("id_funcionario");

                academico = new Academico(universidad, nivel, titulo, idFuncionario);

                academicos.add(academico);
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
        return academicos;
    }
    
}
