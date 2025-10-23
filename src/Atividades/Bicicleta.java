package Atividades;

public class Bicicleta {
	private int horas;
    private double valorHora;

    public Bicicleta(int horas, double valorHora) {
        if (horas < 1) {
            fail("Horas deve ser no mínimo 1!");
        }
        if (valorHora <= 0) {
            fail("Valor da hora deve ser maior que zero!");
        }
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public void aluguel() {
        double resposta = horas * valorHora;
        System.out.println("Valor total do aluguel: R$" + resposta);
    }
    
    private void fail(String falha) {
        System.out.println("Erro: " + falha );   
	}
	public static void main (String[] args) {
		Bicicleta b1 = new Bicicleta (4,15);
		b1.aluguel();
		
	}
}

