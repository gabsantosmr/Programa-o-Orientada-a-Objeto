package Aula5;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int numero = 10;
		int[] valores = {10, 20};
		
		metodo1(numero);
		metodo2 (valores);
		
		System.out.println(numero);
		System.out.println(Arrays.toString(valores));

	}
	
	public static void metodo1(int numero) {
		numero = 50;
	}
	
	public static void metodo2(int[] numeros) {
		numeros[0] = 50;
		numeros[1] = 100;
	}

}
