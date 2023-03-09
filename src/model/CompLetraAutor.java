package model;

import model.AgrupacionOficial;

import java.util.Comparator;

/**
 * Clase comparadora de agrupaciones por letra
 * @author Javier Gámez Mendoza
 * @version 1.0
 */
public class CompLetraAutor implements Comparator<AgrupacionOficial> {
    /**
     * Función que compara 2 agrupaciones oficiales por letra
     * @param a Primera agrupación a comparar
     * @param a1 Segunda agrupación a comparar
     * @return Retorna un valor entero dependiendo de que agrupación vaya antes
     */
    @Override
    public int compare(AgrupacionOficial a, AgrupacionOficial a1) {
        return a.getAutorLetra().compareTo(a1.getAutorLetra());
    }
}
