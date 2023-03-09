package model;

public class Chirigota extends AgrupacionOficial implements Callejera{
    private Integer nCuples;

    public Chirigota(String nombre, String autor, String autorMusica, String autorLetra, String tipo, Integer nCuples, Integer pts) {
        super(nombre, autor, autorMusica, autorLetra, tipo, pts);
        this.setnCuples(nCuples);
    }

    public Integer getnCuples() {
        return nCuples;
    }

    public void setnCuples(Integer nCuples) {
        this.nCuples = nCuples;
    }


    @Override
    public String cantarPresentacion() {
        return "Cantando la presentación de la Chirigota " + getNombre();
    }

    @Override
    public String caminitoDelFalla() {
        return "Chirigota " + getNombre() + " caminito del Falla";
    }

    @Override
    public String hacerTipo() {
        return "Amo a escuchar la chirigota " + getNombre();
    }

    @Override
    public String amoAescucha() {
        return "Chirigota " + this + ", cuples=" + getnCuples();
    }
}


