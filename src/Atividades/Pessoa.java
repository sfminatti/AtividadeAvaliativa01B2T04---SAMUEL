package Atividades;

public class Pessoa {
	private double peso;
    private double altura;
    private String nome;

    public Pessoa(double peso, double altura, String nome) {
        if (nome == null || nome.isEmpty()) {
            fail("O nome não pode ser nulo nem vazio!");
        }
        if (altura <= 0) {
            fail("A altura deve ser maior que zero!");
        }
        if (peso <= 0) {
            fail("O peso deve ser maior que zero!");
        }
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public double calculaIMC() {
        return peso / (altura * altura);
    }

    public void classificacaoIMC() {
        double imc = calculaIMC();
        System.out.println("" + nome + " , seu IMC é Classificação: "+ imc);
        
        if (imc <= 18.5) System.out.println("Magreza");
        else if (imc <= 24.9) System.out.println("Normal");
        else if (imc <= 29.9) System.out.println("Sobrepeso");
        else if (imc <= 39.9) System.out.println("Obesidade II");
        else System.out.println("Obesidade Grave");
    }
	private void fail(String falha) {
        System.out.println("Erro: " + falha );   
	}
	public static void main (String[] args) {
		Pessoa p1 = new Pessoa (68,1.67,"Samuel");
		p1.classificacaoIMC();
		
	}

}
