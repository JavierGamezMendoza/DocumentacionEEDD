package controller;

import model.AgrupacionOficial;

import java.util.Comparator;

public class ComNombre implements Comparator<AgrupacionOficial> {
    @Override
    public int compare(AgrupacionOficial a, AgrupacionOficial a1) {
        return a.getNombre().compareTo(a1.getNombre());
    }
}
