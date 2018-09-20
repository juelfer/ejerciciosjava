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

       //quiniela [0][0] = "Real Sociedad"; quiniela [0][1] = "Barcelona";
       //quiniela [1][0] = "Valencia"; quiniela [1][1]="Betis";
       //quiniela [2][0] = "Athletic de Bilbao"; quiniela [2][1]="Real Madrid";
       //quiniela [3][0] = "Leganés"; quiniela [3][1]="Villarreal";
       //quiniela [4][0] = "Espanyol"; quiniela [4][1]="Levante";
       //quiniela [5][0] = "Valladolid"; quiniela [5][1]="Alavés";
       //quiniela [6][0] = "Sevilla"; quiniela [6][1]="Getafe";
       //quiniela [7][0] = "Alcorcón"; quiniela [7][1]="Deportivo";
       //quiniela [8][0] = "Elche"; quiniela [8][1]="Mallorca";
       //quiniela [9][0] = "Lugo"; quiniela [9][1]="Oviedo";
       //quiniela [10][0] = "Almería"; quiniela [10][1]="Zaragoza";
       //quiniela [11][0] = "Extremadura"; quiniela [11][1]="Las Palmas";
       //quiniela [12][0] = "Granada"; quiniela [12][1]="Rayo Majadahonda";
       //quiniela [13][0] = "Sporting de Gijón"; quiniela [13][1]="Numancia";
       //quiniela [14][0] = "Atlético de Madrid"; quiniela [14][1]="Eibar";

       for (int i = 0; i<14; i++) {
           for (int j = 0; j<3; j++) {
                quiniela[i][j]=Quiniela.pronostico();
            }
           System.out.println("Partido "+(i+1)+": " + quiniela[i][0] + " " + quiniela[i][1] + " " + quiniela[i][2]);
       }
        System.out.println("\nPleno al quince: " + Quiniela.pronostico() );
   }
}
