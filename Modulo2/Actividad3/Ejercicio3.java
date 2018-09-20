//Implemente una clase, Polynomial, para representar polinomios de una sola variable y escriba un programa de pruebas.
//La funcionlidad de la clsase Polynomial es la siguiente:

//-Proporciona al menos tres constructores: un constructor de cero parámetros que hace que el polinomio sea cero,
//un constructor que crea una copia independiente separada de un polinomio existente y un constructor que crea un polinomio
//basado en una especificación String.
//-Crea el método negate que devuelve el negado del polinomio que se proporciona como parámetro.
//-Crea los métodos add, substrac y multiply que devuelven un nuevo poliniomio que es igual a la suma, diferencia o producto,
//respectivamente, de este polinonio y de otro polinimio. Ninguno de estos métodos modifican ninguno de los polinomios
//originales.
//-equals y toString, el primero comprueba que el polinomio pasado por parámetro es el creado y toString haga la representación
//en forma de cadena de caracteres tenga el mejor formato posible.
//-El polinonio está representado por dos campos, de tal manera que el primer campo degree representa el grado: x^2+2x+1 es
//de grado 2, 3x+5 es de grado 1 y 4 es de cardo 0 y cero es automáticamente el grado 0 y el segundo campo coeff reprenemta
//los coeficientes (coeff[i] respresenta el coeficiones de x^i)

package Modulo2.Actividad3;

import java.util.ArrayList;

class Polynomial {
    int degree;
    ArrayList<Integer> coeff;


    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public ArrayList<Integer> getCoeff()
    {
        return coeff;
    }

    public void setCoeff(ArrayList<Integer> coeff) {
        this.coeff = coeff;
    }

    public Polynomial () {
        setDegree(0);
        coeff.add(0);
    }

    public Polynomial (Polynomial p){
        Polynomial res = new Polynomial ();
        res = p;
    }

    public Polynomial (int d, ArrayList<Integer> c) {
        Polynomial res = new Polynomial();
        setDegree(d);
        setCoeff(c);
    }

    public Polynomial Negate (Polynomial p) {
        Polynomial res = new Polynomial();
        for (int i = 0; i < p.coeff.size(); i++) {
            res.coeff.add(i,p.coeff.get(i)*(-1));
        }
        return res;
    }

}

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> c = new ArrayList<>();
        c.add(3);
        c.add(1);
        c.add(2);
        Polynomial p = new Polynomial(2, c);
        Polynomial negp = new Polynomial().Negate(p);
        System.out.println(p);
        System.out.println(negp);
    }
}
