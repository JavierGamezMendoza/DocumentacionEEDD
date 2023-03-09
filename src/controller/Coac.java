//boolean inscribir_agrupacion(Agrupacion agrupacion): Inscribe la agrupación en el concurso,
// añadiéndola a un array de elementos de tipo AgrupacionOficial. Devolverá true si lo añadió
// o false en caso contrario.
//boolean eliminar_agrupacion(Agrupacion agrupacion): Elimina a la agrupación en el concurso,
// eliminándola del array. Devolverá true si lo eliminó o false en caso contrario.
//void ordenar_por_puntos(): Ordena el array por los puntos obtenidos sólo válido para las
// agrupaciones oficiales.
//void ordenar_por_nombre(): Ordena el array por el nombre de la agrupación.
//void ordenar_por_autor(): Ordena el array por el autor de la agrupación
//void ordenar_por_autor_musica_letra(): Ordena el array por el autor de la agrupación.
//Otros que consideres oportunas, como asignarPuntos(), ver agrupacionesConcurso(), etc.
package controller;
import model.*;

import java.util.Arrays;

public class Coac {

    private Integrante[] integrantes = new Integrante[10];
    private Agrupacion[] agrupaciones = new Agrupacion[10];
    private AgrupacionOficial[] agrupacionesOficiales = new AgrupacionOficial[10];

    public Coac(int i, int i1) {
        setAgrupaciones(new Agrupacion[i]);
        setIntegrantes(new Integrante[i1]);
    }

    public boolean insertarIntegrante(Integrante i ){
        for (Integrante integrante : integrantes){
            if (integrante == null){
                integrante = i;
                return true;
            }
        }
        return false;
    }


    public boolean eliminarIntegrante(String nombre){
        for (Integrante integrante : integrantes){
            if (integrante.getNombre().equals(nombre)){
                integrante = null;
                return true;
            }
        }
        return false;
    }

    public boolean inscribir_agrupacion(Agrupacion agr){
        for (Agrupacion agrupacion : agrupaciones){
            if (agrupacion == null){
                agrupacion = agr;
                return true;
            }
        }
        return false;
    }
    public boolean eliminar_agrupacion(String nombre){
        for (Agrupacion agrupacion : agrupaciones){
            if (agrupacion.getNombre() == nombre){
                agrupacion = null;
                return true;
            }
        }
        return false;
    }
    public Integrante[] getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(Integrante[] integrantes) {
        this.integrantes = integrantes;
    }

    public Agrupacion[] getAgrupaciones() {
        return agrupaciones;
    }

    public void setAgrupaciones(Agrupacion[] agrupaciones) {
        this.agrupaciones = agrupaciones;
    }

    public AgrupacionOficial[] getAgrupacionesOficiales() {
        return agrupacionesOficiales;
    }

    public void setAgrupacionesOficiales(AgrupacionOficial[] agrupacionesOficiales) {
        this.agrupacionesOficiales = agrupacionesOficiales;
    }
}
