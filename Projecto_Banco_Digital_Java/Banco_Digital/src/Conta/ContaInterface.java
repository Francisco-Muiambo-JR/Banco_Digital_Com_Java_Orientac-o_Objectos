package Conta;

public interface ContaInterface {

	void depositar(double valor);

	void levantar(double valor);

	void ImprimirExtracto();

	void transferir(ContaInterface contaDestino, double valor);

}
