package Modulo1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad en kb: ");
        int numkb = scanner.nextInt();
        System.out.println("El equivalente son "+ convertirMB(numkb)+ " MB");
    }

    public static float convertirMB(int kb) {
        float numMB = kb/(1024*8);
        return numMB;
    }
}

