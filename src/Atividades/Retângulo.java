package Atividades;

public class Retângulo {
	private int altura;
    private int base;

    public Retângulo(int altura, int base) {
        if (altura <= 0) {
            fail("A altura não pode ser zero nem negativa!");
        }
        if (base <= 0) {
            fail("A base não pode ser zero nem negativa!");
        }
        this.altura = altura;
        this.base = base;
    }

    public void area() {
        int area = base * altura;
        System.out.println("Área do retângulo: " + area);
    }

    public void perimetro() {
        int perimetro = 2 * (base + altura);
        System.out.println("Perímetro do retângulo: " + perimetro);
    }

    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }
    private void fail(String falha) {
        System.out.println("Erro: " + falha );   
	}
	public static void main (String[] args) {
		Retângulo ret = new Retângulo(15,10);
		System.out.println("Sua área é: ");
		ret.area();
		System.out.println("Seu perimeto é: ");
		ret.perimetro();
	}
}


