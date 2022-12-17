package br.com.fiap.shift.testes;

import javax.swing.JOptionPane;

import br.com.fiap.shift.beans.Cargo;
import br.com.fiap.shift.dao.CargoDao;

public class TesteCargoCamadas {

	public static void main(String[] args) {

		var continuar = 0;

		var opcao = 0;

		do {
			// @formatter:off
 			opcao = Integer.parseInt(
 					JOptionPane.showInputDialog(
							  "Digite a opcao Desejada\n" 
							+ "[1] Consultar Todos os Cargos\n" 
							+ "[2] Consultar Cargo por ID\n"
							+ "[3] Consultar Cargo pelo nome\n" 
							+ "[4] Cadastrar um Cargo"
							)
 						);

			switch (opcao) {
				case 1 -> CargoDao.findAll().forEach(System.out::println);
				case 2 -> System.out.println(CargoDao.findById(Long.parseLong(JOptionPane.showInputDialog("Informe o Id"))));
				case 3 -> CargoDao.findByCargo(JOptionPane.showInputDialog("Cargo")).forEach(System.out::println);
				case 4 -> cadastrar();
			}

			continuar = JOptionPane.showConfirmDialog(null, "Continuar?", "Continua...", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
			// @formatter:on
		} while (continuar == 0);

	}

	private static void cadastrar() {

		var cargo = JOptionPane.showInputDialog("Nome do Cargo");
		var nivel = JOptionPane.showInputDialog("Nível do Cargo");

		double salario = 0;

		do {
			try {
				salario = Double.parseDouble(JOptionPane.showInputDialog("Salário para o Cargo"));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Salário Inválido!\nTente novamente...");
			}
		} while (salario <= 0);

		CargoDao.save(new Cargo(cargo, nivel, salario));

		JOptionPane.showMessageDialog(null, "Cargo salvo com sucesso!!!!");
	}

}
