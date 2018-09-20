package Modulo2.Actividad2;

class Cuenta {
    private double balance;

    public Cuenta (double balance){
        this.balance = balance;
    };

    public double getBalance() {
        return this.balance;
    }

    public double deposit(double amount) {
        return this.balance += amount;
    }

    public double withdraw(double amount) {
        return this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Balance{" +
                "balance=" + balance +
                '}';
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1000.00);
        System.out.println(cuenta.getBalance());
        System.out.println(cuenta.deposit(10));
        System.out.println(cuenta.withdraw(5));
    }

}
