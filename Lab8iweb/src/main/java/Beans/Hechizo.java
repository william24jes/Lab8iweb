package Beans;

public class Hechizo {
    private int idHechizo;
    private String nombre;
    private int potenciaDeHechizo;
    private int precisionDeHechizo;
    private int nivelAprendizaje;
    private String hechizoBase;
    private String elemento;

    public int getIdHechizo() {
        return idHechizo;
    }

    public void setIdHechizo(int idHechizo) {
        this.idHechizo = idHechizo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPotenciaDeHechizo() {
        return potenciaDeHechizo;
    }

    public void setPotenciaDeHechizo(int portenciaDeHechizo) {
        this.potenciaDeHechizo = portenciaDeHechizo;
    }

    public int getPrecisionDeHechizo() {
        return precisionDeHechizo;
    }

    public void setPrecisionDeHechizo(int precisionDeHechizo) {
        this.precisionDeHechizo = precisionDeHechizo;
    }

    public int getNivelAprendizaje() {
        return nivelAprendizaje;
    }

    public void setNivelAprendizaje(int nivelAprendizaje) {
        this.nivelAprendizaje = nivelAprendizaje;
    }

    public String getHechizoBase() {
        return hechizoBase;
    }

    public void setHechizoBase(String hechizoBase) {
        this.hechizoBase = hechizoBase;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }
}
