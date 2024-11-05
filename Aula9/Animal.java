package Aula9;

public class Animal {
	
	private String nome;
	protected String classe;
	
	public void imprime() {
		System.out.println(nome);
		System.out.println(classe);
	}

	public String getNome() {
		return nome;
	}
	
	public void falar() {
		System.out.println("O animal está falando");
	}
	
}