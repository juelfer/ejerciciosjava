package Modulo1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner fecha = new Scanner(System.in);
        System.out.print("Introduce el año: ");
        int anyo = fecha.nextInt();
        System.out.print(bisiesto(anyo));
    }

    public static boolean bisiesto (Integer anyo) {
        if (anyo%4 == 0 && anyo%100 != 0) {
            return false;
        }
        else return true;
    }
}
