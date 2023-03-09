package model;

public class Coro extends AgrupacionOficial{
    private Integer nBandurrias;
    private Integer nGuitarras;

    public Coro(String nombre, String autor, String autorMusica, String autorLetra, String tipo, Integer nBandurrias, Integer nGuitarras, Integer pts) {
        super(nombre, autor, autorMusica, autorLetra, tipo, pts);
        this.setnBandurrias(nBandurrias);
        this.setnGuitarras(nGuitarras);
    }


    public Integer getnBandurrias() {
        return nBandurrias;
    }

    public void setnBandurrias(Integer nBandurrias) {
        this.nBandurrias = nBandurrias;
    }

    public Integer getnGuitarras() {
        return nGuitarras;
    }

    public void setnGuitarras(Integer nGuitarras) {
        this.nGuitarras = nGuitarras;
    }

    @Override
    public String caminitoDelFalla() {
        return null;
    }

    @Override
    public String cantarPresentacion() {
        return "Cantando la presentacion de " + getNombre();
    }

    @Override
    public String toString() {
        return "Coro{" +
                "nBandurrias=" + nBandurrias +
                ", nGuitarras=" + nGuitarras +
                '}';
    }

    @Override
    public String hacerTipo() {
        return null;
    }
}
