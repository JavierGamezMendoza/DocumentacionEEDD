package model;

public class Comparsa extends AgrupacionOficial implements Callejera{
    private String empresaAtrezzo;

    public Comparsa(String nombre, String autor, String autorMusica, String autorLetra, String tipo, String empresaAtrezzo, Integer puntos) {
        this.setNombre(nombre);
        this.setAutor(autor);
        this.setAutorMusica(autorMusica);
        this.setAutorLetra(autorLetra);
        this.setTipo(tipo);
        this.setEmpresaAtrezzo(empresaAtrezzo);
    }

    public String getEmpresaAtrezzo() {
        return empresaAtrezzo;
    }

    public void setEmpresaAtrezzo(String empresaAtrezzo) {
        this.empresaAtrezzo = empresaAtrezzo;
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
