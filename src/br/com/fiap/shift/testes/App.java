package br.com.fiap.shift.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.fiap.shift.beans.Cargo;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class App {

	public static void main(String[] args) {

		Cargo c1 = new Cargo("DBA", "Junior", 3500);
		Cargo c2 = new Cargo("Estagiario", "Pleno", 5500);
		Cargo c3 = new Cargo("Analista", "Junior", 3000);

		c3.setCargo("Analista de Sistemas");
		
		c3.setSalario(15000);

		List<Cargo> cargos = new ArrayList<>();

		cargos.add(c1);
		cargos.add(c2);
		cargos.add(c3);

		Collections.sort(cargos);

		System.out.println(cargos);
		
	}

	@SuppressWarnings("unused")
	private static void numeros() {
		List numeros = new ArrayList();
		numeros.add(9);
		numeros.add(5);
		numeros.add(1);
		numeros.add(2);
		numeros.add(8);
		numeros.add(6);
		numeros.add(6);
		numeros.add(0);

		System.out.println(numeros);

		Collections.sort(numeros);
		Collections.reverse(numeros);

		System.out.println(numeros);
	}

	@SuppressWarnings("unused")
	private static void listarCargos() {
		List cargos = new ArrayList();

		cargos.add("Programador");
		cargos.add("DBA");
		cargos.add("Analista de Sistemas");

		System.out.println(cargos);

		Collections.sort(cargos);

		System.out.println(cargos);
	}

}
