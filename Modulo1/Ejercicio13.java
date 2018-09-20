package Modulo1;

class Quiniela {
    public static String pronostico () {
        String pronostico;
        double apuesta = (Math.random() * 3);
        if (apuesta < 1) {
            pronostico = "1";
        } else {
            if (apuesta > 1.0 && apuesta < 2.0) {
                pronostico = "X";
            } else {
                pronostico = "2";
            }
        }
        return pronostico;
    }
}

public class Ejercicio13 {
    public static void main(String[] args) {
       String [][] quiniela = new String [15][3];

       for (int i = 0; i<14; i++) {
           for (int j = 0; j<3; j++) {
                quiniela[i][j]=Quiniela.pronostico();
            }
           System.out.println("Partido "+(i+1)+": " + quiniela[i][0] + " " + quiniela[i][1] + " " + quiniela[i][2]);
       }
        System.out.println("\nPleno al quince: " + Quiniela.pronostico() );
   }
}
