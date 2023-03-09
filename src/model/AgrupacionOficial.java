package model;

//Cualquier AgrupacionOficial
// tendrá que implementar obligatoriamente el método caminitoDelFalla() que devolverá
// una cadena diciendo "El/la coro/comparsa/chirigota/cuarteto XXXXX va caminito del Falla"
// según corresponda, siendo XXXXX el nombre de la agrupación.

public class AgrupacionOficial extends Agrupacion{

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    private Integer puntos;

    @Override
    public String cantarPresentacion() {
        return null;
    }

    @Override
    public String hacerTipo() {
        return null;
    }
}
