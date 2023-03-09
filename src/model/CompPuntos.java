package model;
import model.AgrupacionOficial;
import java.util.Comparator;

public class CompPuntos implements Comparator<AgrupacionOficial> {
    @Override
    public int compare(AgrupacionOficial a, AgrupacionOficial a1) {
        return a.getPuntos().compareTo(a1.getPuntos());
    }
}
