package br.com.fiap.shift.excecoes;

@SuppressWarnings("serial")
public class Excecoes extends Exception {

	public Excecoes(String message) {
		super(message);
	}

	public Excecoes(String message, Exception e) {
		super(message, e);
		this.print();
		e.printStackTrace();
	}

	private void print() {
		System.out.println("=*".repeat(10) + " Tratando o Erro " + "*=".repeat(10));
		System.out.println(getMessage());
		System.out.println("=*".repeat(28));
		System.out.println("PrintStackTrace: ");
	}

}
