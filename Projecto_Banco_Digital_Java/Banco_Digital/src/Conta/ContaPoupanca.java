package Conta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String nome, int identidade, String morada, String string, String estadoCivil, String ocupacao,
			String tipo) {
		super(nome, identidade, morada, string, estadoCivil, ocupacao, tipo);
		// TODO Auto-generated constructor stub
	}

	public ContaPoupanca(int numero, String nome, int identidade, String morada, String dataNasc, String estadoCivil,
			String ocupacao, String tipo) {
		super(numero, nome, identidade, morada, dataNasc, estadoCivil, ocupacao, tipo);
	}

}
