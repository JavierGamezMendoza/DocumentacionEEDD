package model;

public class Cuarteto extends AgrupacionOficial implements Callejera{
    private Integer nMiembros;


    public Cuarteto(String nombre, String autor, String autorMusica, String autorLetra, String tipo, Integer puntos, Integer nMiembros) {
        this.setNombre(nombre);
        this.setAutor(autor);
        this.setAutorMusica(autorMusica);
        this.setAutorLetra(autorLetra);
        this.setTipo(tipo);
        this.setnMiembros(nMiembros);
    }

    public Integer getnMiembros() {
        return nMiembros;
    }

    public void setnMiembros(Integer nMiembros) {
        this.nMiembros = nMiembros;
    }

    @Override
    public String cantarPresentacion() {
        return null;
    }

    @Override
    public String hacerTipo() {
        return null;
    }

    @Override
    public String amoAescucha() {
        return null;
    }
}
