package model;

/**
 * Clase comparadora de agrupaciones
 * @author Javier Gámez Mendoza
 * @version 1.0
 */
public interface ComAgrupacion extends Comparable<Agrupacion>{
    @Override
    int compareTo(Agrupacion agrupacion);
}
