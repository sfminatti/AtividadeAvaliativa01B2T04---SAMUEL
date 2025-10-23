package Atividades;

public class Funcionario {
    private double salario;
    private String nome;
    
    public static void main (String[] args) {
    	Funcionario clt = new Funcionario("Samuel", 2000);
    	System.out.println("Antes de receber um aumento seu salário era");
    	clt.exibir();
    	clt.aumentarSalario(5);
    	System.out.println("Depois do aumento seu salario ficou com o valor de ");
    	clt.exibir();
    }
    
    private void fail(String falha) {
        System.out.println("Erro: " + falha );   
    }
    

    public Funcionario(String nome, double salario) {
        if (nome == null || nome.isEmpty()) {
            fail("Nome precisa existir para funcionário!");
            this.nome="Desconhecido";
        }
        if (salario <= 0) {
           fail("Salário deve ser maior que zero!");
        }
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem) {
        if (porcentagem > 0) {
            salario += salario * (porcentagem / 100);
        } else {
            System.out.println("O aumento não pode ser negativo nem zero!");
        }
    }

    public void exibir() {
        System.out.println("Nome: " + nome + " | Salário: R$" + salario);
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}