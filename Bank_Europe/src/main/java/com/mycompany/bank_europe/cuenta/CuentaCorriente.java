package com.mycompany.bank_europe.cuenta;

import com.mycompany.bank_europe.cuenta.cliente.Cliente;
import com.mycompany.bank_europe.cuenta.cliente.InfoCliente;

public class CuentaCorriente extends CuentaBancaria implements InfoCliente {

    public CuentaCorriente(String numeroCuenta, double saldo, Cliente cliente) {
        super(numeroCuenta, saldo, cliente);
    }

    @Override
    public double calcularInteres() {
        // Ejemplo: las cuentas corrientes no generan interés
        return 0;
    }

    @Override
    public void mostrarInformacionCliente() {
        if (getCliente() != null) {
            getCliente().mostrarInformacionCliente();
        }
        System.out.println("Tipo de Cuenta: Corriente");
        System.out.println("Número de Cuenta: " + getNumeroCuenta());
        System.out.println("Saldo: " + getSaldo());
    }
}