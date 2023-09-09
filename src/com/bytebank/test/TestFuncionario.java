package com.bytebank.test;

import com.bytebank.modelo.Funcionario;
import com.bytebank.modelo.Contador;

public class TestFuncionario {
 
	public static void main(String[] args) {
		Funcionario diego = new Contador();
		diego.setDocumento("Diego");
		diego.setDocumento("123123");
		diego.setSalario(2000);
		diego.setTipo(0);
	
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
	}
}
