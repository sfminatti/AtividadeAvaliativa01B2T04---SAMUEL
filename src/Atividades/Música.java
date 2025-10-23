package Atividades;

public class Música {
	
	 private String titulo;
	    private int duracao;

	    public Música(String titulo, int duracao) {
	        if (titulo == null || titulo.isEmpty()) {
	          fail("O título não pode ser nulo nem vazio!");
	        }
	        if (duracao <= 0) {
	            fail("A duração não pode ser zero nem negativa!");
	        }
	        this.titulo = titulo;
	        this.duracao = duracao;
	    }

	    public void ajustarMusica() {
	        System.out.printf("Título: %s | Duração: %d:%02d\n", titulo, duracao / 60, duracao % 60);
	    }

	    public int getDuracao() {
	        return duracao;
	    }

	    public String getTitulo() {
	        return titulo;
	    }
		private void fail(String falha) {
	        System.out.println("Erro: " + falha );   
		}
		public static void main (String[] args) {
			Música M1 = new Música("Elevate",220);
			Música M2 = new Música("Rivers of Babylon",255);	
			M1.ajustarMusica();
			M2.ajustarMusica();
			M1.getDuracao();
			M2.getDuracao();
		}
	}

