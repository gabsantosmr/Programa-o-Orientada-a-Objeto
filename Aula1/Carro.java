package Aula1;

public class Carro {

	double velocidade;
	final double VelocidadeMaxima = 300;

	public void acelerar() {
		if (velocidade < VelocidadeMaxima) {
			velocidade++;
		}
	}

	public void frear() {
		if (velocidade > 0) {
			velocidade--;
		}
	}

}