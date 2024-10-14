package Aula4;

public class Main {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria();
		conta1.setNome("Gabriel");
		conta1.setIdade(19);
		conta1.setNumero(1);
		//se não colocar valor, recebe 0 automaticamente
		conta1.setTipo("Corrente");
		
		System.out.println(conta1.getNome());
		System.out.println(conta1.getIdade());
		System.out.println(conta1.getNumero());
		System.out.println(conta1.getSaldo());
		System.out.println(conta1.getTipo());
		
		ContaBancaria conta2 = new ContaBancaria();
		conta2.setNome("Daniel");
		conta2.setIdade(21);
		conta2.setNumero(2);
		conta2.Deposito(40);
		conta2.setTipo("Poupança");
		
		System.out.println(conta2.getNome());
		System.out.println(conta2.getIdade());
		System.out.println(conta2.getNumero());
		System.out.println(conta2.getSaldo());
		System.out.println(conta2.getTipo());
		
		
		
	}

}
