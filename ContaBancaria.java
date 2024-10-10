package Aula4;

public class ContaBancaria {
	//nome do cliente
		String nome;
		//Idade do cliente
		int idade;
		//número da conta
		long numero;
		//saldo da conta
		double saldo;
		//tipo da conta pode ser corrente ou poupança
		String tipo;
		
		//void: se tem retorno, se retorna algum valor
		//entre os parênteses, colocar parâmetro
		
		public void Deposito(double valorDeposito) {
			saldo += valorDeposito;
		}
		
		//se não colocar double, tem que colocar return: para retornar o valor
		
		public double Saque(double valorSaque) {
			saldo -= valorSaque;
			return saldo;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public long getNumero() {
			return numero;
		}

		public void setNumero(long numero) {
			this.numero = numero;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		
		
}
