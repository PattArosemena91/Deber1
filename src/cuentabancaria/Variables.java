/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

/**
 *
 * @author ines-pc
 */
public class Variables {

    public static void sumarSaldo(CuentaBancaria cta){
        cta.saldo += 10;
    }
    
    public static void sumarSaldo(int saldo){
        saldo += 10;
    }
    
    
    
    public static void main(String[] args) {
        CuentaBancaria cb1 = new CuentaBancaria();
        CuentaBancaria cb2 = new CuentaBancaria();
        CuentaBancaria cb3 = new CuentaBancaria();
        CuentaBancaria cb4 = new CuentaBancaria();
        CuentaBancaria cb5 = new CuentaBancaria();
        CuentaBancaria cb6 = new CuentaBancaria();
        CuentaBancaria cb7 = new CuentaBancaria();
        CuentaBancaria cb8 = new CuentaBancaria();
        CuentaBancaria cb9 = new CuentaBancaria();
        CuentaBancaria cb10 = new CuentaBancaria();
        
        cb1.nombreTitular = "Ines Arosemena";
        cb1.numeroCuenta = 29824;
        cb1.saldo = 300;
        
        cb2.nombreTitular = "Xavier Anchundia";
        cb2.numeroCuenta = 54678;
        cb2.saldo = 550;
        
        cb3.nombreTitular = "Heavy Thoughts";
        cb3.numeroCuenta = 21349;
        cb3.saldo = 600;
        
        cb4.nombreTitular = "Homero Simpson";
        cb4.numeroCuenta = 78623;
        cb4.saldo = 150;
        
        cb5.nombreTitular = "Daniel Uppercut";
        cb5.numeroCuenta = 50052;
        cb5.saldo = 790;
        
        cb6.nombreTitular = "King Pusha";
        cb6.numeroCuenta = 12786;
        cb6.saldo = 340;
        
        cb7.nombreTitular = "Estefano Nicols";
        cb7.numeroCuenta = 56789;
        cb7.saldo = 270;
        
        cb8.nombreTitular = "Patricia Cardenas";
        cb8.numeroCuenta = 89023;
        cb8.saldo = 890;
        
        cb9.nombreTitular = "Jesus Mena";
        cb9.numeroCuenta = 31324;
        cb9.saldo = 920;
        
        cb10.nombreTitular = "Maria Calderon";
        cb10.numeroCuenta = 24998;
        cb10.saldo = 60;
        
        sumarSaldo(cb1);
        sumarSaldo(cb2);
        sumarSaldo(cb3);
        sumarSaldo(cb3);
        sumarSaldo(cb4);
        sumarSaldo(cb4);
        sumarSaldo(cb5);
        sumarSaldo(cb5);
        sumarSaldo(cb5);
        sumarSaldo(cb6);
        sumarSaldo(cb6);
        sumarSaldo(cb6);
        sumarSaldo(cb7);
        sumarSaldo(cb7);
        sumarSaldo(cb8);
        sumarSaldo(cb9);
        sumarSaldo(cb9);
        sumarSaldo(cb9);
        sumarSaldo(cb10);
        sumarSaldo(cb10);
        
        System.out.println("Dueño de la cuenta: " + cb1.nombreTitular);
        System.out.println("Numero de Cuenta Bancaria " + cb1.numeroCuenta);
        System.out.println("Saldo Disponible " + cb1.saldo);
        
        System.out.println("Dueño de la cuenta: " + cb2.nombreTitular);
        System.out.println("Numero de Cuenta Bancaria " + cb2.numeroCuenta);
        System.out.println("Saldo Disponible " + cb2.saldo);
        
        System.out.println("Dueño de la cuenta: " + cb3.nombreTitular);
        System.out.println("Numero de Cuenta Bancaria " + cb3.numeroCuenta);
        System.out.println("Saldo Disponible " + cb3.saldo);
        
        System.out.println("Dueño de la cuenta: " + cb4.nombreTitular);
        System.out.println("Numero de Cuenta Bancaria " + cb4.numeroCuenta);
        System.out.println("Saldo Disponible " + cb4.saldo);
        
        System.out.println("Dueño de la cuenta: " + cb5.nombreTitular);
        System.out.println("Numero de Cuenta Bancaria " + cb5.numeroCuenta);
        System.out.println("Saldo Disponible " + cb5.saldo);
        
        System.out.println("Dueño de la cuenta: " + cb6.nombreTitular);
        System.out.println("Numero de Cuenta Bancaria " + cb6.numeroCuenta);
        System.out.println("Saldo Disponible " + cb6.saldo);
        
        System.out.println("Dueño de la cuenta: " + cb7.nombreTitular);
        System.out.println("Numero de Cuenta Bancaria " + cb7.numeroCuenta);
        System.out.println("Saldo Disponible " + cb7.saldo);
        
        System.out.println("Dueño de la cuenta: " + cb8.nombreTitular);
        System.out.println("Numero de Cuenta Bancaria " + cb8.numeroCuenta);
        System.out.println("Saldo Disponible " + cb8.saldo);
        
        System.out.println("Dueño de la cuenta: " + cb9.nombreTitular);
        System.out.println("Numero de Cuenta Bancaria " + cb9.numeroCuenta);
        System.out.println("Saldo Disponible " + cb9.saldo);
        
        System.out.println("Dueño de la cuenta: " + cb10.nombreTitular);
        System.out.println("Numero de Cuenta Bancaria " + cb10.numeroCuenta);
        System.out.println("Saldo Disponible " + cb10.saldo);
        
    }
    
}
