package controller;

import model.AgrupacionOficial;

import java.util.Comparator;

public class ComAutor implements Comparator<AgrupacionOficial> {
    @Override
    public int compare(AgrupacionOficial a, AgrupacionOficial a1) {
        return a.getAutor().compareTo(a1.getNombre());
    }
}
