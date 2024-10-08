package Aula3;

public class Main {

	public static void main(String[] args) {

		ContaBancaria conta1 = new ContaBancaria();
		conta1.setNome("Gabriel");
		conta1.setIdade(19);
		conta1.setNumero(54594-9);
		conta1.setSaldo(1000);
		conta1.setTipo("Corrente");
		
		ContaBancaria conta2 = new ContaBancaria();
		conta2.setNome("Daniel");
		conta2.setIdade(21);
		conta2.setNumero(43985-2);
		conta2.setSaldo(2);
		conta2.setTipo("Poupança");
	}

}
