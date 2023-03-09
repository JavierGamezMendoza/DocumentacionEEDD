package view;

import java.util.Scanner;

/**
 * Clase con funciónes para básicas
 *
 * @author Javier Gámez Mendoza
 * @version 1.0
 */
public class Util {

    /**
     * Función que escribe por pantalla una cadena de texto
     * @param str Cadena de texto a mostrar
     */
    public static void escribir(String str){
        System.out.println(str);
    }

    /**
     * Función que solicita un entero al usuario
     * @param str Petición a mostrar
     * @return Retorna el valor introducido
     */
    public static int leerInt(String str){
        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        return sc.nextInt();
    }
}
