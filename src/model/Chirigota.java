package model;

public class Chirigota extends AgrupacionOficial implements Callejera{
    private Integer nCuples;

    public Chirigota(String nombre, String autor, String autorMusica, String autorLetra, String tipo, Integer nCuples, Integer puntos) {
        this.setNombre(nombre);
        this.setAutor(autor);
        this.setAutorMusica(autorMusica);
        this.setAutorLetra(autorLetra);
        this.setTipo(tipo);
        this.setnCuples(nCuples);
        this.setPuntos(puntos);
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
    public String hacerTipo() {
        return null;
    }

    @Override
    public String amoAescucha() {
        return null;
    }
}


