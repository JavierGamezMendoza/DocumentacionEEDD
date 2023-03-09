package model;

/**
 * Clase comparsa
 * @author Javier Gámez Mendoza
 * @version 1.0
 */
public class Comparsa extends AgrupacionOficial implements Callejera{
    private String empresaAtrezzo;

    /**
     * Constructor de la clase comparsa
     * @param nombre Nombre de la comparsa
     * @param autor Autor de la comparsa
     * @param autorMusica Autor de la música de la comparsa
     * @param autorLetra Autor de la letra de la comparsa
     * @param tipo Tipo de comparsa
     * @param empresaAtrezzo Empresa de atrezzo de la comparsa
     * @param pts Puntos de la comparsa
     */
    public Comparsa(String nombre, String autor, String autorMusica, String autorLetra, String tipo, String empresaAtrezzo, Integer pts) {
        super(nombre, autor, autorMusica, autorLetra, tipo, pts);
        this.setEmpresaAtrezzo(empresaAtrezzo);
    }

    public String getEmpresaAtrezzo() {
        return empresaAtrezzo;
    }

    public void setEmpresaAtrezzo(String empresaAtrezzo) {
        this.empresaAtrezzo = empresaAtrezzo;
    }

    /**
     * Funcion que anuncia que una comparsa va caminito del falla
     * @return Retorna una cadena de texto que anuncia que una comparsa va caminito del falla
     */
    @Override
    public String caminitoDelFalla() {
        return "La comparsa " + getNombre() + " va caminito del falla";
    }

    /**
     * Función que canta la presentación de una comparsa
     * @return Retorna una cadena de texto con la presentación de una comparsa
     */
    @Override
    public String cantarPresentacion() {
        return null;
    }

    @Override
    public String hacerTipo() {
        return null;
    }


    /**
     * Funcion que anuncia la actuación de una comparsa
     * @return Retorna una cadena de texto con el anuncio de la actuación de una comparsa
     */
    @Override
    public String amoAescucha() {
        return "Vamos a esuchar la comparsa " + getNombre();
    }
}
