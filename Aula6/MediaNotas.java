package Aula6;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Calculadora calculadora = new Calculadora();
		int tamanho = entrada.nextInt();
		double[] valores = new double[tamanho];
		
		
		for (int i = 0; i < valores.length; i++) {
			valores[i] = entrada.nextDouble();
		}
		entrada.close();
		
		double media = calculadora.calcularMedia(valores);
		
		System.out.println(media);
	}

}