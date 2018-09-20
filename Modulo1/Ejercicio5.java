package Modulo1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el radio: ");
        float radio = scanner.nextFloat();
        System.out.print("Introduce la altura: ");
        float altura = scanner.nextFloat();
        volumencono(radio, altura);
    }

    public static void volumencono(float radio, float altura) {
        double volumen = ((Math.PI*Math.pow(radio,2)*altura)/3);
        System.out.println("El volumen del cono es de " + volumen);
    }
}
