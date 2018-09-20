//Crea un BinaryArry , este BinaryArray es la representación privada de una matriz de variables booleanas.
//Por ejemplo la representación del BinaryArray "FTTF" sería una matriz de longitud cuatro que almacenaria
//(false, true, true false) en los índices 0,1,2,3 de la matriz, respectivamente.
//La clase BinaryArray tiene la siguiente funcionalidad:
//    Un constructor de un único parámetro que contiene un objeto String.
//    Metodos accesorios get/set para acceder a una variable en un índice concreto o modificarla.

package Modulo2.Actividad1;

import java.util.Scanner;

class BinaryArray {
    String boolstr;

    public String getBoolstr() {
        return boolstr;
    }

    public static void setBoolstr(String boolstr) {
        boolstr = boolstr;
    }

    public BinaryArray () {
        getBoolstr();
    }
}

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Introduce array: ");
        Scanner scanner = new Scanner(System.in);
        String arr = scanner.nextLine();
        BinaryArray.setBoolstr(arr);
        boolean[] boolchar = new boolean[4];
        //String str = new BinaryArray().getBoolstr();
        char[] strchar = arr.toCharArray();
        for (int i = 0; i<strchar.length; i++) {
            if (strchar[i] == 'T') {
                boolchar[i] = true;
            } else {
                boolchar[i] = false;
            }
        }
        for (int i = 0; i < boolchar.length; i++) {
            System.out.println(boolchar[i]);
        }
    }
}


//    boolean[] boolres = new boolean[boolstr.length()];
//    String BinaryArray () {
//        char[] boolchar = boolstr.toCharArray();
//        int longi = boolchar.length;
//        for (int i = 0; i < longi; i++) {
//            switch (boolchar[i]) {
//                case 'T':
//boolres[i] = true;
//                    break;
//               case 'F':
//                    boolres[i] = false;
//                   break;
//                default:
//                    break;
//            };
//        }
//        return boolres.toString();
//    }