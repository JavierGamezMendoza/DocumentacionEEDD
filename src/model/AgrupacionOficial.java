package model;

public abstract class AgrupacionOficial extends Agrupacion{
    private final Integer MAX = 10;
    private Integer pts;
    private Integrante[] integrantes;
    private Integer iIntegrantes = 0;

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


    public abstract String caminitoDelFalla();

    public abstract String cantarPresentacion();

    @Override
    public String hacerTipo() {
        return null;
    }
}
