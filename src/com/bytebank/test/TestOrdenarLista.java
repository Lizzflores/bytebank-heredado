package com.bytebank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.bytebank.modelo.*;

public class TestOrdenarLista {

	public static void main(String[] args) {
		Cuenta cc1 = new CuentaCorriente(24, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNombre("Nico");
		cc1.setTitular(clienteCC1);
		cc1.depositar(333.0);

		Cuenta cc2 = new CuentaCorriente(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNombre("Guilermo");
		cc2.setTitular(clienteCC2);
		cc2.depositar(444.0);

		Cuenta cc3 = new CuentaCorriente(34, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNombre("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.depositar(111.0);

		Cuenta cc4 = new CuentaCorriente(11, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNombre("Ana");
		cc4.setTitular(clienteCC4);
		cc4.depositar(222.0);
		
		List<Cuenta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		System.out.println("Antes de ordenar");
		for (Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}
		
		//Comparator<Cuenta> comparatorNombreTitular = new OrdenadorPorNombreTitular();
		//lista.sort(comparatorNombreTitular);
		//lista.sort(new OrdenadorPorNombreTitular());
		
		
		//Forma antigua
		Collections.sort(lista, new OrdenadorPorNombreTitular());
		System.out.println("Despues de ordenar por nombre titular");
		for (Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}
		
		Collections.sort(lista);
		System.out.println("Despues de ordenar por orden natural ");
		for (Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}
		
		//Ordenar las cuentas
		// Cualquier clase hija de Cuenta
		//Comparator <? extend Cuenta> c
		//lista.sort(c);
		Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta();
		lista.sort(comparator);
		
		System.out.println("Despues de ordenar");
		for (Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}
		
	}
}

class OrdenadorPorNumeroCuenta implements Comparator<Cuenta>{

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		if (o1.getNumero()== o2.getNumero()) {
			return 0;
		}else if(o1.getNumero()> o2.getNumero()) {
			return 1;
		}else {
			return -1;
		}
		//Forma intermedia
		//return o1.getNumero()-o2.getNumero()
		//Forma wrapper
		//return Integer.compare(o1.getNumero(), o2.getNumero());
	}
	
}

class OrdenadorPorNombreTitular implements Comparator<Cuenta>{

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
		
	}
	
}
