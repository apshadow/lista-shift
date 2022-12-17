package br.com.fiap.shift.testes;

import java.util.HashMap;
import java.util.Map;

import br.com.fiap.shift.beans.Cargo;

public class AppMap {

	public static void main(String[] args) {

		Cargo c1;

		c1 = new Cargo("DBA", "Junior", 3500);

		Cargo c2 = new Cargo("Estagiario", "Pleno", 5500);
		Cargo c3 = new Cargo("Analista", "Junior", 3000);

		Map<String, Cargo> mapaDeCargos = new HashMap<>();

		mapaDeCargos.put("1", c1);
		mapaDeCargos.put("2", c2);
		mapaDeCargos.put("3", c3);

		System.out.println(mapaDeCargos.get("1"));

		System.out.println(mapaDeCargos.keySet());

		mapaDeCargos.values().stream().filter(c -> c.getSalario() > 5000).forEach(System.out::println);

	}

}
