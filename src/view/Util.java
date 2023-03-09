package view;

import java.util.Scanner;

public class Util {

    public static void escribir(String str){
        System.out.println(str);
    }

    public static int leerInt(String str){
        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        return sc.nextInt();
    }
}
