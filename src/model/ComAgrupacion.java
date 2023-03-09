package model;

public interface ComAgrupacion extends Comparable<Agrupacion>{
    @Override
    int compareTo(Agrupacion agrupacion);
}
