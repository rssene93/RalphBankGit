package aplicativo;

import modelo.Conta;

public class Aplication {

	public static void main(String[] args) {
		//Primeira conta
		Conta conta1 = new Conta();
		
		//Segunda conta
		Conta conta2 = new Conta();
		
		//DEPOSITANDO VALOR A CONTA
		conta1.depositar(100);
		System.out.println(conta1.exibirDados());
		System.out.println();
		
		//SACANDO VALOR DA CONTA
		conta1.sacar(50);
		System.out.println(conta1.exibirDados());
		System.out.println();
		
		//TRANSFERINDO VALOR ENTRE CONTAS
		conta1.transferir(10, conta2);
		System.out.println(conta1.exibirDados());
		System.out.println(conta2.exibirDados());
	}

}