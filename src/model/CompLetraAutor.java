package model;

import model.AgrupacionOficial;

import java.util.Comparator;

public class CompLetraAutor implements Comparator<AgrupacionOficial> {
    @Override
    public int compare(AgrupacionOficial a, AgrupacionOficial a1) {
        return a.getAutorLetra().compareTo(a1.getAutorLetra());
    }
}
