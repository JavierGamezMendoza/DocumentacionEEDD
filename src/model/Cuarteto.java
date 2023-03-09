package model;

public class Cuarteto extends AgrupacionOficial implements Callejera{
    private Integer nMiembros;


    public Cuarteto(String nombre, String autor, String autorMusica, String autorLetra, String tipo, Integer pts, Integer nMiembros) {
        super(nombre, autor, autorMusica, autorLetra, tipo, pts);
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
        return "Cantando la presentación del cuarteto de nombre" + super.getNombre();
    }
    @Override
    public String hacerTipo() {
        return "El cuarteto " + getNombre() + " va de " + getTipo();
    }

    @Override
    public String caminitoDelFalla() {
        return "El cuarteto " + getNombre() + " va caminito del Falla";
    }

    @Override
    public String amoAescucha() {
        return "Amo a escuchá la Chirigota " + getNombre();
    }

    @Override
    public String toString() {
        return "Cuarteto{" +
                "nMiembros=" + nMiembros +
                '}';
    }
}
