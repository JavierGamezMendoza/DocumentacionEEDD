//Por tanto, es necesario implementar también la clase Integrante,
// que simplemente almacenará el numeroParticipante (único, autoasignado y no modificable),
// nombre, edad (sólo mayor de edad) y localidad del participante.

package model;

public class Integrante {
    private static Integer nParticipante;
    private String nombre;
    private Integer edad;
    private String localidad;


    public Integrante(String nombre, Integer edad, String localidad) {
        setNombre(nombre);
        setEdad(edad);
        setLocalidad(localidad);
        setnParticipante(nParticipante + 1);
        nParticipante += 1;
    }

    public static Integer getnParticipante() {
        return nParticipante;
    }

    public static void setnParticipante(Integer nParticipante) {
        Integrante.nParticipante = nParticipante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
}
