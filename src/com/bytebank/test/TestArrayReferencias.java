package com.bytebank.test;

import com.bytebank.modelo.CuentaCorriente;
//importo
import com.bytebank.modelo.CuentaAhorros;


public class TestArrayReferencias {

    public static void main(String[] args) {

        // alterando el tipo
        Object[] cuentas = new Object[5];
        CuentaCorriente cc1 = new CuentaCorriente(22, 11);
        cuentas[0] = cc1;

        // crea instancia de CuentaAhorro
        CuentaAhorros ca2 = new CuentaAhorros(22, 22);
        cuentas[1] = ca2;    

        System.out.println(cuentas[1].getNumero()  );

        // alterou o tipo, realizando o cast
        CuentaCorriente ref = (CuentaCorriente) cuentas[0];
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());
    }
}