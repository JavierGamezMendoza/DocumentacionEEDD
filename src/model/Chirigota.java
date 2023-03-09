package model;

/**
 * Clase para las chirigotas
 * @author Javier Gámez Mendoza
 * @version 1.0
 */
public class Chirigota extends AgrupacionOficial implements Callejera{
    private Integer nCuples;

    /**
     * Constructor de las chirigotas
     * @param nombre Nombre de la chirigota
     * @param autor Autor de la chirigota
     * @param autorMusica Autor de la música de la chirigota
     * @param autorLetra Auto de la letra de la chirigota
     * @param tipo Tipo de chirigota
     * @param nCuples Número de Cuples de la chirigota
     * @param pts Número de puntos de la chirigota
     */
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


    /**
     * Función que presenta una chirigota
     * @return Retorna una cadena de texto con la presentación de la chirigota
     */
    @Override
    public String cantarPresentacion() {
        return "Cantando la presentación de la Chirigota " + getNombre();
    }

    @Override
    public String hacerTipo() {
        return null;
    }

    /**
     * Función que anuncia que una chirigota va caminito del falla
     * @return Retorna una cadena de texto que anuncia que una chirigota va caminito del falla
     */
    @Override
    public String caminitoDelFalla() {
        return "Chirigota " + getNombre() + " caminito del Falla";
    }

    /**
     * Funcion que presenta la actuación de una chirigota
     * @return Retorna una cadena de texto con el anuncio de la chirigota
     */
    @Override
    public String amoAescucha() {
        return "Amo a escuchar la chirigota " + getNombre();
    }
}


