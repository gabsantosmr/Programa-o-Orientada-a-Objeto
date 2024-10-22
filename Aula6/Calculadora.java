package Aula6;

public class Calculadora {
	public double calcularMedia(double[] valor) {
		double soma = 0;
		for (int i = 0; i < valor.length; i++) {
			soma += valor[i];
		}
		return soma / valor.length;
	}
}