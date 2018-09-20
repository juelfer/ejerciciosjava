package Modulo1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        double t;
        float h;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la altura: ");
        h = scanner.nextFloat();
        t = Math.sqrt((2*h)/9.8);
        System.out.println("Tardará en caer " + t +" segundos");
    }
}
