package Banco;

import java.util.Scanner;

import Conta.Conta;
import Conta.ContaCorrente;
import Conta.ContaPoupanca;

public class TransacoesConta {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Banco banco = new Banco();

		// criacão da conta
		System.out.println("Seja Bem vindo!");
		System.out.println();

		// Criacao das Contas
		ContaCorrente conta1 = new ContaCorrente("Albertina", 123456789, "Bairro 3", "01/01/1990", "Casada",
				"Professora", "Corrente");

		ContaPoupanca conta2 = new ContaPoupanca("Joao", 321654987, "Bairro 5", "12/05/1999", "Solteiro", "Estagiário",
				"Poupanca");
		ContaCorrente conta3 = new ContaCorrente("José", 456987356, "Bairro 6", "01/12/2000", "Solteiro",
				"Contabilísta", "Corrente");
		ContaCorrente conta4 = new ContaCorrente("Mandes", 123456789, "Bairro 9", "11/01/2002", "Solteiro", "Gestor",
				"Corrente");
		ContaCorrente conta5 = new ContaCorrente(11, "Javier", 123466789, "Bairro 9", "11/01/2006", "Solteiro",
				"Estudante", "Corrente");

		// adicionar Contas
		banco.adicionarContaCorrente(conta1);
		banco.adicionarContaPoupanca(conta2);
		banco.adicionarContaCorrente(conta3);
		banco.adicionarContaCorrente(conta4);
		banco.adicionarContaCorrente(conta5);

		// Depósitos
		conta1.depositar(250000);
		conta2.depositar(120000);
		conta3.depositar(50000);
		conta4.depositar(1200000);

		// listagem de contas
		// banco.listarContaCorrente();
		// banco.listarContaCorrente();

		ContaCorrente contaPrincipal = new ContaCorrente(19, "Francisco", 197328564, "Mali", "22/03/2002", "Solteiro",
				"Estudante", "Corrente");
		banco.adicionarContaCorrente(contaPrincipal);
		contaPrincipal.depositar(10000000);

		System.out.println("Dados da Conta Principal: ");
		System.out.println(contaPrincipal);
		System.out.println();
		System.out.println("Escolha uma das opcoes: ");
		System.out.println("1. Criacão de uma nova conta");
		System.out.println("2. Depósito");
		System.out.println("3. Levantamento");
		System.out.println("4. Transferencia");
		System.out.println("5. Imprimir extrato");
		int opcao = input.nextInt();
		double valor;
		String nome, morada, DataNasc, EstadoCivil, Ocupacão;
		int identidade;
		switch (opcao) {
		case 1:
			System.out.println("Insira o tipo de conta a criar: Corrente ou Poupanca? ");
			System.out.println("1.Corrente   2. Poupanca");
			int tipoConta = input.nextInt();
			switch (tipoConta) {

			case 1:
				System.out.println();
				System.out.println("Para a criacão da Conta siga as seguintes instrucoes: ");
				System.out.print("Insira o seu nome: ");
				nome = input.nextLine();
				input.nextLine();
				System.out.print("Insira a identidade: ");
				identidade = input.nextInt();
				System.out.print("Insira a morada: ");
				morada = input.next();
				System.out.print("Insira a data de nascimento: ");
				DataNasc = input.next();
				System.out.print("Insira o estado civil: ");
				EstadoCivil = input.next();
				System.out.print("Insira a ocupacão: ");
				Ocupacão = input.next();
				ContaCorrente contaC = new ContaCorrente(nome, identidade, morada, DataNasc, EstadoCivil, Ocupacão,
						"Corrente");
				banco.adicionarContaCorrente(contaC);
				System.out.println("Conta Corrente Criada");
				break;

			case 2:
				System.out.print("Insira o seu nome: ");
				nome = input.nextLine();
				input.nextLine();
				System.out.print("Insira a identidade: ");
				identidade = input.nextInt();
				System.out.print("Insira a morada: ");
				morada = input.next();
				System.out.print("Insira a data de nascimento: ");
				DataNasc = input.next();
				System.out.print("Insira o estado civil: ");
				EstadoCivil = input.next();
				System.out.print("Insira a ocupacão: ");
				Ocupacão = input.next();
				ContaPoupanca contaP = new ContaPoupanca(nome, identidade, morada, DataNasc, EstadoCivil, Ocupacão,
						"Poupanca");
				banco.adicionarContaPoupanca(contaP);
				System.out.println("Conta Poupaca Criada");
				break;

			default:
				System.out.println("Tipo de Conta inválida");
				break;

			}
			break;

		case 2:
			System.out.println("Insira o valor a depositar: ");
			valor = input.nextDouble();
			contaPrincipal.depositar(valor);
			System.out.println(contaPrincipal);
			break;

		case 3:
			System.out.println("Insira o valor a levantar: ");
			valor = input.nextDouble();
			contaPrincipal.levantar(valor);
			System.out.println(contaPrincipal);
			break;

		case 4:
			System.out.println("Insira o valor a transferir: ");

			valor = input.nextDouble();
			System.out.print("Insira o tipo de conta: ");
			String tipo = input.next();
			System.out.print("Insira número de conta: ");
			int nConta = input.nextInt();
			Conta conta = banco.ConsultaConta(tipo, nConta);

			contaPrincipal.transferir(conta5, valor);
			break;

		case 5:
			contaPrincipal.ImprimirExtracto();
		}

		System.out.println();
		banco.listarContaCorrente();

		System.out.println();
		banco.listarContaPoupanca();
		input.close();
	}

}
