package com.mycompany.bank_europe.cuenta;

import com.mycompany.bank_europe.cuenta.CuentaCorriente;
import com.mycompany.bank_europe.cuenta.CuentaAhorro;
import com.mycompany.bank_europe.cuenta.CuentaDigital;
import com.mycompany.bank_europe.cuenta.utils.UtilsCuenta;
import com.mycompany.bank_europe.cuenta.cliente.Cliente;

public class Bank_Europe {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan Pérez", "11.111.111-1", "Av. Siempre Viva 123");

        String numeroCuenta = "123456789";
        if (!UtilsCuenta.validarNumeroCuenta(numeroCuenta)) {
            System.out.println("Número de cuenta inválido.");
            return;
        }

        CuentaCorriente cc = new CuentaCorriente(numeroCuenta, 1500000, cliente1);
        CuentaAhorro ca = new CuentaAhorro("987654321", 1200000, cliente1);
        CuentaDigital cd = new CuentaDigital("192837465", 500000, cliente1);

        cc.mostrarInformacionCliente();
        System.out.println("-----------------");
        ca.mostrarInformacionCliente();
        System.out.println("-----------------");
        cd.mostrarInformacionCliente();
    }
}