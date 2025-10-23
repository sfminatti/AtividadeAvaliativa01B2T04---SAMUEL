package Atividades;

public class Temperatura {
	private double celsius;

    public Temperatura(double celsius) {
        if (celsius < -273.15) {
            fail("Temperatura abaixo do zero absoluto!");
        }
        this.celsius = celsius;
    }

    public double paraFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public double paraKelvin() {
        return celsius + 273.15;
    }

    public void mostrarConversoes() {
        System.out.println("Temperatura em Celsius: " + celsius + "°C");
        System.out.println("Temperatura em Fahrenheit: " + paraFahrenheit() + "°F");
        System.out.println("Temperatura em Kelvin: " + paraKelvin() + "K");
    }
    private void fail(String falha) {
        System.out.println("Erro: " + falha );   
	}
	public static void main (String[] args) {
		Temperatura temper = new Temperatura(25);
        temper.mostrarConversoes();	
	}


}
