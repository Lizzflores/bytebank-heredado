package com.bytebank.test;

import com.bytebank.modelo.*;

public class Test {

    public static void main(String[] args) {

        Object cc = new CuentaCorriente(22, 33);
        Object cp = new CuentaCorriente(33, 22);

        System.out.println(cc);
        System.out.println(cp);
    }
}