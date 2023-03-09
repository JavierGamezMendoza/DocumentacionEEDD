package model;

public class Coro extends AgrupacionOficial{
    private Integer nBandurrias;
    private Integer nGuitarras;

    public Coro(String nombre, String autor, String autorMusica, String autorLetra, String tipo, Integer nBandurrias, Integer nGuitarras, Integer puntos) {
        this.setNombre(nombre);
        this.setAutor(autor);
        this.setAutorMusica(autorMusica);
        this.setAutorLetra(autorLetra);
        this.setTipo(tipo);
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
    public String cantarPresentacion() {
        return null;
    }

    @Override
    public String hacerTipo() {
        return null;
    }
}
