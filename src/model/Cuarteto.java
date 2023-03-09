package model;

/**
 * Clase para los cuartetos
 * @author Javier Gámez Mendoza
 * @version 1.0
 */
public class Cuarteto extends AgrupacionOficial implements Callejera{
    private Integer nMiembros;


    /**
     * Constructor de los cuartetos
     * @param nombre Nombre del cuarteto
     * @param autor Autor del cuarteto
     * @param autorMusica Autor de la música del cuarteto
     * @param autorLetra Autor de la letra del cuarteto
     * @param tipo Tipo de cuarteto
     * @param pts Puntos del cuarteto
     * @param nMiembros Número de miembros del cuarteto
     */
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

    /**
     * Función que presenta a un cuarteto
     * @return Retorna una cadena de texto con la presentación de un cuarteto
     */
    @Override
    public String cantarPresentacion() {
        return "Cantando la presentación del cuarteto de nombre" + super.getNombre();
    }

    /**
     * Función que anuncia el tipo del cuarteto
     * @return Retorna una cadena de texto con el tipo del cuarteto
     */
    @Override
    public String hacerTipo() {
        return "El cuarteto " + getNombre() + " va de " + getTipo();
    }

    /**
     * Función que anuncia que un cuarteto va caminito del falla
     * @return Retorna una cadena de texto anunciando que un cuarteto va caminito del falla
     */
    @Override
    public String caminitoDelFalla() {
        return "El cuarteto " + getNombre() + " va caminito del Falla";
    }

    /**
     * Función que anuncia la actuación de un cuarteto
     * @return Retorna una cadena de texto que anuncia la actuación de un cuarteto
     */
    @Override
    public String amoAescucha() {
        return "Amo a escuchá la Chirigota " + getNombre();
    }

    /**
     * Función que muestra las características de un cuarteto
     * @return Retorna una cadena de texto con las características del cuarteto
     */
    @Override
    public String toString() {
        return "Cuarteto{" +
                "nMiembros=" + nMiembros +
                '}';
    }
}
