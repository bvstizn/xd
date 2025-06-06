/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank_europe.movimientos;


import java.util.Date;

public class Movimiento {
    private Date fecha;
    private String tipo; // "DEPOSITO" o "GIRO"
    private double monto;

    public Movimiento(Date fecha, String tipo, double monto) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.monto = monto;
    }

    public Date getFecha() { return fecha; }
    public String getTipo() { return tipo; }
    public double getMonto() { return monto; }
}