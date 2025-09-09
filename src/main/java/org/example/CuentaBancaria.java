package org.example;

public class CuentaBancaria {
    private double saldo;
    public CuentaBancaria() {
        this.saldo = 0;
    }
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("El monto debe ser mayor que 0.");
        }
    }
    public void retirar(double monto) {
        if (monto > 0) {
            if (monto <= saldo) {
                saldo -= monto;
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("El monto debe ser mayor que 0.");
        }
    }
    public double getSaldo() {
        return saldo;
    }
}