package Atividades;

public class Produto {
	private int quantidade;
    private String nome;

    public Produto(int quantidade, String nome) {
        if (quantidade <= 0) {
            fail("Quantidade deve ser maior que zero!");
        }
        if (nome == null || nome.isEmpty()) {
            fail("Nome não pode ser vazio!");
        }
        this.quantidade = quantidade;
        this.nome = nome;
    }

    public void adicionarEstoque(int qtd) {
        if (qtd > 0) {
            quantidade += qtd;
            System.out.println("Produto: " + nome + " | Total depois da adição: " + quantidade);
        } else {
            System.out.println("Valor de adição inválido!");
        }
    }

    public void removerEstoque(int qtd) {
        if (qtd > 0 && qtd <= quantidade) {
            quantidade -= qtd;
            System.out.println("Produto: " + nome + " | Total depois da remoção: " + quantidade);
        } else {
            System.out.println("Valor de remoção inválido!");
        }
    }
    private void fail(String falha) {
        System.out.println("Erro: " + falha );   
	}
	public static void main (String[] args) {
		Produto p1 = new Produto (5,"arroz");
		p1.adicionarEstoque(6);
		p1.removerEstoque(6);

		
	}
}


