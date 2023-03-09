package model;


/**
 * Clase para Agrupaciones oficiales
 * @author Javier Gámez Mendoza
 * @version 1.0
 */
public abstract class AgrupacionOficial extends Agrupacion{
    private final Integer MAX = 10;
    private Integer pts;
    private Integrante[] integrantes;
    private Integer iIntegrantes = 0;

    /**
     * Constructor para Agrupaciones oficiales
     * @param nombre Nombre de la agrupación oficial
     * @param autor Autor de la agrupación oficial
     * @param autorMusica Autor de la música de la agrupación oficial
     * @param autorLetra Autor de la letra de la agrupación oficial
     * @param tipo Tipo de agrupación oficial
     * @param pts Puntos de la agrupación oficial
     */
    public AgrupacionOficial(String nombre, String autor, String autorMusica, String autorLetra, String tipo, Integer pts) {
        super(nombre, autor, autorMusica, autorLetra, tipo);
        integrantes = new Integrante[MAX];
        setPuntos(pts);
    }

    public Integer getPuntos() {
        return puntos;
    }
    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public Integer getMAX() {
        return MAX;
    }

    public Integer getPts() {
        return pts;
    }

    public void setPts(Integer pts) {
        this.pts = pts;
    }

    public Integrante[] getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(Integrante[] integrantes) {
        this.integrantes = integrantes;
    }

    public Integer getiIntegrantes() {
        return iIntegrantes;
    }

    public void setiIntegrantes(Integer iIntegrantes) {
        this.iIntegrantes = iIntegrantes;
    }

    private Integer puntos;

    /**
     * Funcion que anuncia que una agrupación va caminito del falla
     * @return Retorna una cadena de texto anunciando que la agrupación va caminito del falla
     */
    public abstract String caminitoDelFalla();

    /**
     * Funcion que canta la presentación de una agrupación
     * @return Retorna una cadena de texto con la presentación de la agrupación
     */
    public abstract String cantarPresentacion();

}
