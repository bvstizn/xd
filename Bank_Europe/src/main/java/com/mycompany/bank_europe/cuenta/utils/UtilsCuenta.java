/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank_europe.cuenta.utils;


public class UtilsCuenta {
    public static boolean validarNumeroCuenta(String numero) {
        return numero != null && numero.matches("\\d{9}");
    }
}