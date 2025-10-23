package Atividades;

public class ContaLuz {
	 private double valorKwh;
	    private double consumoKwh;

	    public ContaLuz(double valorKwh, double consumoKwh) {
	        if (valorKwh <= 0) {
	            fail("Valor KWh deve ser maior que zero!");
	        }
	        if (consumoKwh <= 0) {
	            fail("Consumo deve ser maior que zero!");
	        }
	        this.valorKwh = valorKwh;
	        this.consumoKwh = consumoKwh;
	    }

	    public void calcularValorTotal() {
	        double resposta = valorKwh * consumoKwh;
	        System.out.println("Valor total da conta de luz: R$" + resposta);
	    }
	    
	    private void fail(String falha) {
	        System.out.println("Erro: " + falha );   
		}
		public static void main (String[] args) {
			ContaLuz c1 = new ContaLuz (100.5,2.4);
			c1.calcularValorTotal();
			
		}
}

