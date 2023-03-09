package model;

public class Romancero extends Agrupacion implements Callejera{
    private String tematicaCartelon;

    public Romancero(String nombre, String autor, String autorMusica, String autorLetra, String tipo, String tematicaCartelon) {
        this.setNombre(nombre);
        this.setAutor(autor);
        this.setAutorMusica(autorMusica);
        this.setAutorLetra(autorLetra);
        this.setTipo(tipo);
        this.setTematicaCartelon(tematicaCartelon);
    }

    public String getTematicaCartelon() {
        return tematicaCartelon;
    }

    public void setTematicaCartelon(String tematicaCartelon) {
        this.tematicaCartelon = tematicaCartelon;
    }

    @Override
    public String cantarPresentacion() {
        return null;
    }

    @Override
    public String hacerTipo() {
        return null;
    }

    @Override
    public String amoAescucha() {
        return null;
    }
}
