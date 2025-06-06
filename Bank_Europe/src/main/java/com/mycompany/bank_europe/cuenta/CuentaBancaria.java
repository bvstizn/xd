package com.mycompany.bank_europe.cuenta;

import com.mycompany.bank_europe.cuenta.cliente.Cliente;

public abstract class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private Cliente cliente;

    public CuentaBancaria(String numeroCuenta, double saldo, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    // Sobrecarga: constructor sin cliente
    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.cliente = null;
    }

    public String getNumeroCuenta() { return numeroCuenta; }
    public void setNumeroCuenta(String numeroCuenta) { this.numeroCuenta = numeroCuenta; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public void depositar(double monto) {
        if (monto > 0) this.saldo += monto;
    }

    public boolean girar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }

    // Método abstracto
    public abstract double calcularInteres();
}