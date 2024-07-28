package Cliente;

import java.util.Objects;

public class Cliente {
	private String nome;
	private int identidade;
	private String Morada;
	private String dataNasc;
	private String EstadoCivil;
	private String Ocupacao;

	public Cliente(String nome, int identidade, String morada, String dataNasc, String estadoCivil, String ocupacao) {
		this.nome = nome;
		this.identidade = identidade;
		Morada = morada;
		this.dataNasc = dataNasc;
		EstadoCivil = estadoCivil;
		Ocupacao = ocupacao;
	}

	@Override
	public String toString() {
		return "Cliente: " + nome + ", identidade= " + identidade + ", Morada= " + Morada + ", dataNasc= " + dataNasc
				+ ", EstadoCivil = " + EstadoCivil + ", Ocupacao =" + Ocupacao + "]";
	}

	public String getNome() {
		return nome;
	}

	public int getIdentidade() {
		return identidade;
	}

	public String getMorada() {
		return Morada;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public String getEstadoCivil() {
		return EstadoCivil;
	}

	public String getOcupacao() {
		return Ocupacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(identidade);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Cliente cliente)) {
			return false;
		}
		return getIdentidade() == cliente.getIdentidade();
	}

}
