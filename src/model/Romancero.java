package model;

/**
 * Clase para los romanceros
 * @author Javier Gámez Mendoza
 * @version 1.0
 */
public class Romancero extends Agrupacion implements Callejera{
    private String tematicaCartelon;

    /**
     * Constructor de los romanceros
     * @param nombre nombre del romancero
     * @param autor autor del romancero
     * @param autorMusica autor de la música del romancero
     * @param autorLetra autor de la letra del romancero
     * @param tipo tipo de romancero
     * @param tematicaCartelon temática del cartelón del romancero
     */
    public Romancero(String nombre, String autor, String autorMusica, String autorLetra, String tipo, String tematicaCartelon) {
        this.setNombre(nombre);
        this.setAutor(autor);
        this.setAutorMusica(autorMusica);
        this.setAutorLetra(autorLetra);
        this.setTipo(tipo);
        this.setTematicaCartelon(tematicaCartelon);
    }

    public String getTematicaCartelon() {
        return tematicaCartelon;
    }

    public void setTematicaCartelon(String tematicaCartelon) {
        this.tematicaCartelon = tematicaCartelon;
    }

    @Override
    public String cantarPresentacion() {
        return "Cantando la presentación del Romancero " + getNombre();
    }
    @Override
    public String hacerTipo() {
        return null;
    }

    @Override
    public String amoAescucha() {
        return "Vamos a esuchar el romancero " + getNombre();
    }

    /**
     * Función que muestra las características del romancero
     * @return Retorna una cadena de texto con las características del romancero
     */
    @Override
    public String toString() {
        return "Romancero{" +
                "tematicaCartelon='" + tematicaCartelon + '\'' +
                '}';
    }
}
