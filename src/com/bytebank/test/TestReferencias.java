package com.bytebank.test;

import com.bytebank.modelo.Funcionario;
import com.bytebank.modelo.Gerente;

public class TestReferencias {

	public static void main(String[] args) {
		//El elemento mas generico puede ser adaptado al elemento mas especifico
		Funcionario funcionario= new Gerente();
		funcionario.setNombre("Diego");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		//System.out.println(gerente.iniciarSesion("_ddd"));
		gerente.iniciarSesion("_ddd");
	}
}
