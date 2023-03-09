package model;

/**
 * Clase para los coros
 * @author Javier Gamez Mendoza
 * @version 1.0
 */
public class Coro extends AgrupacionOficial{
    private Integer nBandurrias;
    private Integer nGuitarras;

    /**
     * Constructor de los coros
     * @param nombre Nombre del coro
     * @param autor Autor del coro
     * @param autorMusica Autor de la musica del coro
     * @param autorLetra Autor de la letra del coro
     * @param tipo Tipo de coro
     * @param nBandurrias Número de bandurrias del coro
     * @param nGuitarras Número de guitarras del coro
     * @param pts Puntos del coro
     */
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

    /**
     * Función que anuncia que un coro va caminito del falla
     * @return Retorna una cadena de texto que anuncia que un coro va caminito del falla
     */
    @Override
    public String caminitoDelFalla() {
        return "El coro " + getNombre() + " va caminito del falla";
    }

    /**
     * Función que canta la presentación de un coro
     * @return Retorna una cadena de texto con la presentación de un coro
     */
    @Override
    public String cantarPresentacion() {
        return "Cantando la presentacion de " + getNombre();
    }


    /**
     * Función que muestra las características de un coro
     * @return Devuelve una cadena de texto con las características del coro
     */
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
