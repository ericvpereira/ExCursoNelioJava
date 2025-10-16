package entities;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public Conta(int numero, String titular, double depositoInicial) {
        this.numero = numero;
        this.titular = titular;
        depositar(depositoInicial);
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double quantia) {
        if (quantia > 0) {
            saldo += quantia;
        }
    }

    public void sacar(double quantia) {
        if (quantia > 0 && quantia <= saldo) {
            saldo -= quantia;
        }
    }

    public String toString() {
        return "Conta " 
               + numero 
               + ", Titular: " 
               + titular
               + ", Saldo: $ "
               + String.format("%.2f", saldo);  
    }
}
