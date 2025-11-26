package modelo;

public class Conta {
    
    // Atributos da classe
    private int numero;
    private String titular;
    private double saldo;
    
    //Construtor padrão sem argumentos
    public Conta() {
    	this.numero = 0;
    	this.titular = "Sem titular";
    	this.saldo = 0.0;
    }
    
    // Construtor padrão com os argumentos
    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    
    //Métodos GET e SET
    public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
    
    // Método para depositar um valor na conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido. O depósito deve ser maior que zero.");
        }
    }
    
    

	// Método para sacar um valor da conta
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
    
    // Método para transferir valores
    public void transferir(double valor, Conta destino) {
        if (valor > 0 && saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Não foi possível realizar a transferência.");
        }
    }
    
    // Método para imprimir os dados da conta
    public String exibirDados() {
        return String.format("Conta: %d | Titular: %s | Saldo: %.2f", numero, titular, saldo);
    }
}