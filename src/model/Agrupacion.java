


package model;

public abstract class Agrupacion {
    private String nombre;
    private String autor;
    private String autorMusica;
    private String autorLetra;
    private String tipo;



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


    public abstract String cantarPresentacion();

    public abstract String hacerTipo();
}

