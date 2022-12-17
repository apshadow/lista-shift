package br.com.fiap.shift.testes;

import java.util.Arrays;
import java.util.TreeSet;

public class AppSet {

	public static void main(String[] args) {

		var cargos = new TreeSet<String>();

		cargos.add("DBA");
		cargos.add("Desenvolvedor");
		cargos.add("Estagiario");

		System.out.println(cargos);
		
		cargos.addAll(Arrays.asList("Analista", "Suporte", "DBA"));

		System.out.println(cargos);

	}

}
