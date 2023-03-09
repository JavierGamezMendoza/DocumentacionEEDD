package controller;
import model.AgrupacionOficial;
import java.util.Comparator;

public class ComPuntos implements Comparator<AgrupacionOficial> {
    @Override
    public int compare(AgrupacionOficial a, AgrupacionOficial a1) {
        return a.getPuntos().compareTo(a1.getPuntos());
    }
}
