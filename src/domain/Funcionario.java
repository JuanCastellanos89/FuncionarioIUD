package domain;

/**
 *
 * @Juan Castellanos
 */
public class Funcionario {
    int idFuncionario;
    private String identificacion, nombres, apellidos, estadoCivil, sexo, direccion, celular, fechaNacimiento, tipoDocumento;
    
    public Funcionario(int idFuncionario){
        this.idFuncionario = idFuncionario;
    }
    
    public Funcionario(String identificacion, String nombres, String apellidos, String estadoCivil, String sexo,
            String direccion, String celular, String fechaNacimiento, String tipoDocumento){
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.estadoCivil = estadoCivil;
        this.sexo = sexo;
        this.direccion = direccion;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoDocumento = tipoDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    public int getIdFuncionario(){
        return idFuncionario;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "idFuncionario=" + idFuncionario + ", identificacion=" + identificacion + ", nombres=" + nombres + ", apellidos=" + apellidos + ", estadoCivil=" + estadoCivil + ", sexo=" + sexo + ", direccion=" + direccion + ", celular=" + celular + ", fechaNacimiento=" + fechaNacimiento + ", tipoDocumento=" + tipoDocumento + '}';
    }

     

    public Funcionario(int idFuncionario, String identificacion, String nombres, String apellidos, String estadoCivil, String sexo, String direccion, String celular, String fechaNacimiento, String tipoDocumento) {
        this.idFuncionario = idFuncionario;
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.estadoCivil = estadoCivil;
        this.sexo = sexo;
        this.direccion = direccion;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoDocumento = tipoDocumento;
    }
    
    
}
