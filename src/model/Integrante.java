//Por tanto, es necesario implementar también la clase Integrante,
// que simplemente almacenará el numeroParticipante (único, autoasignado y no modificable),
// nombre, edad (sólo mayor de edad) y localidad del participante.

package model;

/**
 * Clase para los integrantes
 * @author Javier Gámez Mendoza
 * @version 1.0
 */
public class Integrante {
    private static Integer nParticipante;
    private String nombre;
    private Integer edad;
    private String localidad;


    /**
     * Constructor de los integrantes
     * @param nombre Nombre de los integrantes
     * @param edad Edad de los integrantes
     * @param localidad Localidad de los integrantes
     */
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
        if (edad >= 18) {
            this.edad = edad;
        }
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * Función que muestra las características de los integrantes
     * @return Retorna una cadena de texto con las características de los integrantes
     */
    @Override
    public String toString() {
        return "Integrante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
