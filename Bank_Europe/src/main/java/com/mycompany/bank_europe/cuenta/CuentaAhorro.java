/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank_europe.cuenta;

import com.bankeurope.cliente.InfoCliente;

public class CuentaAhorro extends CuentaBancaria implements InfoCliente {

    private double tasaInteres = 0.02; // 2% anual ejemplo

    public CuentaAhorros(String numeroCuenta, double saldo, com.bankeurope.cliente.Cliente cliente) {
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
        System.out.println("Tipo de Cuenta: Ahorros");
        System.out.println("Número de Cuenta: " + getNumeroCuenta());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Interés generado: " + calcularInteres());
    }
}