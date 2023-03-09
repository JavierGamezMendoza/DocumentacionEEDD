


package model;

/**
 * Clase abstracta para las agrupaciones
 *
 * @author Javier Gámez Mendoza
 * @Version 1.0
 */
public abstract class Agrupacion {
    private String nombre;
    private String autor;
    private String autorMusica;
    private String autorLetra;
    private String tipo;
    private Integer agrupacionesTotal;
    private static Integer i = 1;

    public Agrupacion(){
        setAgrupacionesTotal(i++);
    }

    /**
     * Constructor para las agrupaciones
     * @param nombre Nombre de la agrupación
     * @param autor Autor de la agrupación
     * @param autorMusica Autor de la música tocasda
     * @param autorLetra Autor de la letra cantada
     * @param tipo Tipo de agrupación
     */
    public Agrupacion(String nombre, String autor, String autorMusica, String autorLetra, String tipo) {
        setAgrupacionesTotal(i++);
        setNombre(nombre);
        setAutor(autor);
        setAutorMusica(autorMusica);
        setAutorLetra(autorLetra);
        setTipo(tipo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutorMusica() {
        return autorMusica;
    }

    public void setAutorMusica(String autorMusica) {
        this.autorMusica = autorMusica;
    }

    public String getAutorLetra() {
        return autorLetra;
    }

    public void setAutorLetra(String autorLetra) {
        this.autorLetra = autorLetra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getAgrupacionesTotal() {
        return agrupacionesTotal;
    }

    public void setAgrupacionesTotal(Integer agrupacionesTotal) {
        this.agrupacionesTotal = agrupacionesTotal;
    }

    /**
     * Metodo para mostrar las características de una agrupación en formato texto
     * @return Retorna las características de la agrupación en una cadena de texto
     */
    @Override
    public String toString() {
        return "Agrupacion{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autorMusica='" + autorMusica + '\'' +
                ", autorLetra='" + autorLetra + '\'' +
                ", tipo='" + tipo + '\'' +
                ", agrupacionesTotal=" + agrupacionesTotal +
                '}';
    }

    /**
     * Comparador de Agrupaciones por nomrbe
     * @param a Agrupacion a comparar
     * @return Retorna un entero dependiendo de que agrupación vaya primero
     */
    public Integer compareTo(Agrupacion a){
        return this.getNombre().compareTo(a.getNombre());
    }

    public abstract String cantarPresentacion();

    public abstract String hacerTipo();
}

