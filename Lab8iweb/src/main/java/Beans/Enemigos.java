package Beans;

public class Enemigos {

    private String nombre;
    private int clase;
    private int ataque;
    private int experienciaxDerrota;
    private String objetoDejado;
    private float probDejarObjeto;
    private String genero;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getClase() {
        return clase;
    }

    public void setClase(int clase) {
        this.clase = clase;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getExperienciaxDerrota() {
        return experienciaxDerrota;
    }

    public void setExperienciaxDerrota(int experienciaxDerrota) {
        this.experienciaxDerrota = experienciaxDerrota;
    }

    public String getObjetoDejado() {
        return objetoDejado;
    }

    public void setObjetoDejado(String objetoDejado) {
        this.objetoDejado = objetoDejado;
    }

    public float getProbDejarObjeto() {
        return probDejarObjeto;
    }

    public void setProbDejarObjeto(float probDejarObjeto) {
        this.probDejarObjeto = probDejarObjeto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
