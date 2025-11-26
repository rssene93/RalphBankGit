package modelo;

public class Conta {
	
	//Atributos da classe
	private int numero;
	private String titular;
	private double saldo;
	
	//Construtor inicializando os atributos
	public Conta(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	//Método para imprimir os dados da conta.
	public String exibirDados() {
		return "Conta: " + numero + "Títular conta: " + titular + "Saldo conta: " + saldo;
	}
}