package br.com.fiap.shift.beans;

/**
 * Esta é a classe Cargo
 * 
 * @author Francis
 * @since 1.0
 *
 */
public class Cargo implements Comparable<Cargo> {

	private Long id;

	private String cargo;

	private String nivel;

	private double salario;

	public Cargo(Long id, String cargo, String nivel, double salario) {
		super();
		this.id = id;
		this.cargo = cargo;
		this.nivel = nivel;
		this.salario = salario;
	}

	public Cargo(String cargo, String nivel, double salario) {
		super();
		this.cargo = cargo;
		this.nivel = nivel;
		this.salario = salario;
	}

	public Cargo() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public int compareTo(Cargo o) {
		// Estou comparando salários.
		return (int) (this.getSalario() - o.getSalario());
	}

	@Override
	public String toString() {
		return "Cargo [id=" + id + ", cargo=" + cargo + ", nivel=" + nivel + ", salario=" + salario + "]";
	}

}
