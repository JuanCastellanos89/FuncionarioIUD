package domain;

/**
 *
 * @author Berserk
 */

public class Academico extends Funcionario {
    private String universidad, nivel, titulo;

    public Academico(int idFuncionario) {
        super(idFuncionario);
    }

    public Academico(String universidad, String nivel, String titulo, int idFuncionario) {
        super(idFuncionario);
        this.universidad = universidad;
        this.nivel = nivel;
        this.titulo = titulo;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Academico {" + "universidad=" + universidad + ", nivel=" + nivel + ", titulo=" + titulo + ", id= " + idFuncionario + '}';
    }      
}
