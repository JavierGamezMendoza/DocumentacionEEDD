


package model;


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

    public Integer compareTo(Agrupacion a){
        return this.getNombre().compareTo(a.getNombre());
    }

    public abstract String cantarPresentacion();

    public abstract String hacerTipo();
}

