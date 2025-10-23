package Atividades;


public class Filme{
	public static void main (String[] args) {
		Filme f1 = new Filme("Vingadores", 10);
        f1.exibir();
        Filme f2 = new Filme("Eternos", 5);
        f2.exibir();
	}
	private String nome;
    private int nota;
    
    private void fail(String falha) {
        System.out.println("Erro: " + falha );
    }

    public Filme(String nome, int nota) {
        if (nome == null || nome.isEmpty()) {
            fail("O nome não pode ser nulo nem em branco!");
            this.nome="incorreto";
        }else {
        	this.nome=nome;
        }
        if (nota < 0 || nota > 5) {
           fail("A nota deve estar entre 0 e 5!");

        }
        this.nota = nota;
    }

    public Filme() {}

    public void digitarNome(String nome2) {
        if (nome2 != null && !nome2.isEmpty()) {
            nome = nome2;
        } else {
            System.out.println("Nome inválido!");
        }
    }

    public void digitarNota(int nota2) {
        if (nota2 >= 0 && nota2 <= 5) {
            nota = nota2;
        } else {
            System.out.println("Nota inválida!");
        }
    }

    public void exibir() {
        System.out.println("Filme: " + nome + " | Nota: " + nota + " ⭐");
    }

    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }
}

