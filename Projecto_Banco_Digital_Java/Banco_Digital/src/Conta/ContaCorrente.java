package Conta;

public class ContaCorrente extends Conta {

	public ContaCorrente(String nome, int identidade, String morada, String dataNasc, String estadoCivil,
			String ocupacao, String tipo) {
		super(nome, identidade, morada, dataNasc, estadoCivil, ocupacao, tipo);
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(int numero, String nome, int identidade, String morada, String dataNasc, String estadoCivil,
			String ocupacao, String tipo) {
		super(numero, nome, identidade, morada, dataNasc, estadoCivil, ocupacao, tipo);
	}

}
