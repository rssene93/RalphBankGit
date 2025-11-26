package modelo;

public class Conta {
    
    // Atributos da classe
    private int numero;
    private String titular;
    private double saldo;
    
    // Construtor inicializando os atributos
    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
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
        return "Conta: " + numero + 
               " | Titular: " + titular + 
               " | Saldo: " + saldo;
    }
}