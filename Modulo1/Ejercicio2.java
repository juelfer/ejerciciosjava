package Modulo1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Introduce el número: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(romanos(num));
    }

    public static String romanos(Integer num) {

        if (num > 3999) {
            return "Quo vadis? ¡Ningún dios permite un número tan alto!";
        }
        int millares = num / 1000;
        int centenas = (num % 1000) / 100;
        int decenas = (num % 100) / 10;
        int unidades = (num % 10);

        String quantitas = millarum(millares) + centenum(centenas) + decenum(decenas) + unidadum(unidades);
        return quantitas;
    }

    public static String unidadum(int unidades) {
        String numerus = "";
        switch (unidades) {
            case 1:
                numerus = "I";
                break;
            case 2:
                numerus = "II";
                break;
            case 3:
                numerus = "III";
                break;
            case 4:
                numerus = "IV";
                break;
            case 5:
                numerus = "V";
                break;
            case 6:
                numerus = "VI";
                break;
            case 7:
                numerus = "VII";
                break;
            case 8:
                numerus = "VIII";
                break;
            case 9:
                numerus = "IX";
                break;
            case 0:
                break;
        }
        return numerus;
    }

    public static String decenum(int decenas) {
        String numerus = "";
        if (decenas < 1) {
            return numerus;
        }

        switch (decenas) {
            case 1:
                numerus = "X";
                break;
            case 2:
                numerus = "XX";
                break;
            case 3:
                numerus = "XXX";
                break;
            case 4:
                numerus = "XL";
                break;
            case 5:
                numerus = "L";
                break;
            case 6:
                numerus = "LX";
                break;
            case 7:
                numerus = "LXX";
                break;
            case 8:
                numerus = "LXXX";
                break;
            case 9:
                numerus = "XC";
                break;
            case 0:
                break;
        }
        return numerus;
    }

    public static String centenum (int centenas) {
        String numerus ="";
        switch (centenas) {
            case 1: numerus = "C";
                break;
            case 2: numerus = "CC";
                break;
            case 3: numerus = "CCC";
                break;
            case 4: numerus = "CD";
                break;
            case 5: numerus = "D";
                break;
            case 6: numerus = "DC";
                break;
            case 7: numerus = "DCC";
                break;
            case 8: numerus = "DCCC";
                break;
            case 9: numerus = "CM";
                break;
            case 0: break;
        }
        return numerus;
    }

    public static String millarum (int millares) {
        String numerus = "";
        switch (millares) {
            case 1: numerus = "M";
                break;
            case 2: numerus = "MM";
                break;
            case 3: numerus = "MMM";
                    break;
        }
        return numerus;
    }
}
