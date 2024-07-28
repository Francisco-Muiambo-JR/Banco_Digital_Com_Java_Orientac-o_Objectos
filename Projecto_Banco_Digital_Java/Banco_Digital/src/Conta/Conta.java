package Conta;

import java.util.Objects;
import java.util.Random;

import Cliente.Cliente;

public abstract class Conta implements ContaInterface {
	private String tipo;
	private static final int Agencia_Padrao = 1793;
	private int numero;
	private int Agencia;
	protected double saldo;
	// private static int SEQUENCIAL;
	private Cliente cliente;
	private Random randon = new Random();

	public Conta(String nome, int identidade, String morada, String dataNasc, String estadoCivil, String ocupacao,
			String tipo) {
		this.numero = randon.nextInt(100);
		this.Agencia = Conta.Agencia_Padrao;
		this.tipo = tipo;
		cliente = new Cliente(nome, identidade, morada, dataNasc, estadoCivil, ocupacao);
	}

	public Conta(int numero, String nome, int identidade, String morada, String dataNasc, String estadoCivil,
			String ocupacao, String tipo) {
		this.tipo = tipo;
		this.numero = numero;
		Agencia = Conta.Agencia_Padrao;
		this.cliente = new Cliente(nome, identidade, morada, dataNasc, estadoCivil, ocupacao);
		;
	}

	public String getTipo() {
		return tipo;
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo += valor;

	}

	@Override
	public void levantar(double valor) {
		// TODO Auto-generated method stub
		if (valor <= saldo) {
			saldo -= valor;
			System.out.println("Valor retirado");
		} else {
			System.out.println("Saldo insuficiente");
		}

	}

	public boolean levant(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	@Override
	public void transferir(ContaInterface conta, double valor) {
		// TODO Auto-generated method stub

		if (levant(valor)) {
			conta.depositar(valor);
			System.out.println("Valor transferido com sucesso");
		} else {
			System.out.println("Transferencia não realizada");
		}

	}

	@Override
	public void ImprimirExtracto() {
		System.out.println("Saldo da Conta n: " + numero);
		System.out.println("O seu saldo é " + saldo);
		System.out.println("Dados do cliente ");
		System.out.println(cliente);

	}

	public static int getAgenciaPadrao() {
		return Agencia_Padrao;
	}

	public int getNumero() {
		return numero;
	}

	public int getAgencia() {
		return Agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cliente, numero, randon);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Conta)) {
			return false;
		}
		Conta other = (Conta) obj;
		return Objects.equals(cliente, other.cliente) && numero == other.numero && Objects.equals(randon, other.randon);
	}

	@Override
	public String toString() {
		return "Conta " + tipo + " " + "[numero= " + numero + ", Agencia= " + Agencia + ", saldo= " + saldo + ", "
				+ cliente;
	}

}
