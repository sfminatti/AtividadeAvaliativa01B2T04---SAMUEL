package Atividades;

public class Contabancaria {
	private String titular;
    private double saldo;
    
    public static void main(String[] args) {
    	Contabancaria contaum = new Contabancaria("Samuel", 500);
    	contaum.exibirsaldo();
    	contaum.depositar(250);
    	contaum.sacar(600);
    	contaum.exibirsaldo();
    }
    private void fail(String falha) {
        System.out.println("Erro: " + falha );
    }
    public Contabancaria(String titular, double saldoInicial) {
        if (titular == null || titular.isEmpty()) {
        	fail("Titular não pode ficar vazio");
        	this.titular= ("desconhecido");
        }
        if (saldoInicial < 0) {
            fail("Saldo inicial não pode ser menor do que zero");
        }
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido!");
        }
        
    }
    
    public void exibirsaldo() {
    		System.out.println("O seu saldo atual e de : R$" + saldo);
    	}
 
    
    
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Valor do saque inválido ou acima do saldo disponível!");
        }
        
    }
    
    
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
