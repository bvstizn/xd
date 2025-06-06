/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bank_europe.cuenta;

import com.bankeurope.cliente.Cliente;
import com.bankeurope.cuenta.CuentaCorriente;
import com.bankeurope.cuenta.CuentaAhorros;
import com.bankeurope.cuenta.CuentaDigital;
import com.bankeurope.cuenta.utilidades.UtilCuenta;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan Pérez", "11.111.111-1", "Av. Siempre Viva 123");

        String numeroCuenta = "123456789";
        if (!UtilCuenta.validarNumeroCuenta(numeroCuenta)) {
            System.out.println("Número de cuenta inválido.");
            return;
        }

        CuentaCorriente cc = new CuentaCorriente(numeroCuenta, 1500000, cliente1);
        CuentaAhorros ca = new CuentaAhorros("987654321", 1200000, cliente1);
        CuentaDigital cd = new CuentaDigital("192837465", 500000, cliente1);

        cc.mostrarInformacionCliente();
        System.out.println("-----------------");
        ca.mostrarInformacionCliente();
        System.out.println("-----------------");
        cd.mostrarInformacionCliente();
    }
}