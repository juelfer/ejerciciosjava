package Modulo1;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número: ");
        num = scanner.nextInt();
        String numstr = Integer.toString(num);
        char[] reverso = new char [numstr.length()];
        int n = numstr.length();

        for (int i = 0; i < n; i++) {
            reverso[(n-1)-i] = numstr.charAt(i);
        }

        String numreves = String.copyValueOf(reverso);

        System.out.println(numreves);
    }
}
