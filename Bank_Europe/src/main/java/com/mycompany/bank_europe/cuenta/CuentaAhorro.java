package com.mycompany.bank_europe.cuenta;

import com.mycompany.bank_europe.cuenta.cliente.Cliente;
import com.mycompany.bank_europe.cuenta.cliente.InfoCliente;

public class CuentaAhorro extends CuentaBancaria implements InfoCliente {

    private double tasaInteres = 0.02; // 2% anual, ejemplo

    public CuentaAhorro(String numeroCuenta, double saldo, Cliente cliente) {
        super(numeroCuenta, saldo, cliente);
    }

    @Override
    public double calcularInteres() {
        return getSaldo() * tasaInteres;
    }

    @Override
    public void mostrarInformacionCliente() {
        if (getCliente() != null) {
            getCliente().mostrarInformacionCliente();
        }
        System.out.println("Tipo de Cuenta: Ahorro");
        System.out.println("Número de Cuenta: " + getNumeroCuenta());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Interés generado: " + calcularInteres());
    }
}