package br.com.fiap.shift.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import br.com.fiap.shift.beans.Cargo;

public final class CargoDao {

	// Não deixar que seja criado um objeto do tipo CargoDao
	/** Don't let anyone instantiate this class */
	private CargoDao() {
	}

	private static List<Cargo> lista = new Vector<>();

	static {
		Cargo c1 = new Cargo("DBA", "Junior", 3500);
		Cargo c2 = new Cargo("Estagiario", "Pleno", 5500);
		Cargo c3 = new Cargo("Analista", "Junior", 3000);
		Cargo c4 = new Cargo("Analista", "Pleno", 13000);

		CargoDao.save(c1);
		CargoDao.save(c2);
		CargoDao.save(c3);
		CargoDao.save(c4);
	}

	public static void save(Cargo cargo) {
		if (cargo.getId() == null)
			cargo.setId((long) (lista.size() + 1));
		lista.add(cargo);
	}

	public static List<Cargo> findAll() {
		return lista;
	}

	public static Cargo findById(Long id) {
		// return cargos.stream().filter(c
		// ->c.getId().equals(id)).findFirst().orElse(null);
		for (Cargo c : lista) {
			if (c.getId().equals(id)) {
				return c;
			}
		}
		return null;
	}

	public static List<Cargo> findByCargo(String cargo) {
		List<Cargo> retorno = new ArrayList<>();
		for (Cargo c : lista) {
			if (c.getCargo().equalsIgnoreCase(cargo)) {
				retorno.add(c);
			}
		}
		return retorno;
	}

}
