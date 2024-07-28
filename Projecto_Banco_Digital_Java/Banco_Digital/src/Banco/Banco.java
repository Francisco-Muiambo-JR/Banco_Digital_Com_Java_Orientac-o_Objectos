package Banco;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Conta.Conta;

public class Banco {
	private static String nome = "Banco ABS";
	private Set<Conta> listaContaCorrente;
	private List<Conta> listaContaPoupanca;

	public Banco() {
		this.listaContaCorrente = new HashSet<>();
		this.listaContaPoupanca = new ArrayList<>();
	}

	public void adicionarContaPoupanca(Conta conta) {
		listaContaPoupanca.add(conta);
	}

	public void adicionarContaCorrente(Conta conta) {
		listaContaCorrente.add(conta);
	}

	public void deletarContaCorrente(int numero) {

		Conta contaRemover = null;
		for (Conta c : listaContaCorrente) {
			if (c.getNumero() == numero) {
				contaRemover = c;
				System.out.println("Conta encontrada");
				ConsultaConta(c.getTipo(), c.getNumero());
				break;
			}
		}

		boolean a = listaContaCorrente.remove(contaRemover);
		if (a) {
			System.out.println("Conta Removida");
		}
	}

	public void deletarContaPoupanca(int numero) {
		ConsultaConta(nome, numero);
		Conta contaRemover = null;
		for (Conta c : listaContaPoupanca) {
			if (c.getNumero() == numero) {
				contaRemover = c;
				System.out.println("Conta encontrada");
				ConsultaConta(c.getTipo(), c.getNumero());
				break;
			}
		}

		boolean a = listaContaPoupanca.remove(contaRemover);
		if (a) {
			System.out.println("Conta Removida");
		}
	}

	public Conta ConsultaConta(String tipo, int numero) {
		Conta conta = null;
		if (tipo.equals("Corrente")) {

			for (Conta c : listaContaCorrente) {
				if (c.getNumero() == numero) {
					conta = c;
					System.out.println("Conta : " + c.getNumero());
					System.out.println(c.getCliente());
					break;
				}
			}
		} else if (tipo.equals("Poupanca")) {
			for (Conta c : listaContaPoupanca) {
				if (c.getNumero() == numero) {
					conta = c;
					System.out.println("Conta : " + c.getNumero());
					System.out.println(c.getCliente());
					break;
				}
			}
		}
		return conta;
	}

	public void listarContaCorrente() {
		System.out.println("Lista da Conta Corrente");
		for (Conta c : listaContaCorrente) {
			System.out.println(c);
		}
	}

	public void listarContaPoupanca() {
		System.out.println("Lista da Conta Poupanca");
		for (Conta c : listaContaPoupanca) {
			System.out.println(c);
		}
	}

}
