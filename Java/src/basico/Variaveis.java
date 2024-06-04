package basico;

public class Variaveis {

	public static void main(String[] args) {
		// Tipo nome = conteudo;
		String nome = "Matheus"; //tipo texto
		int idade = 25; //tipo inteiro
		double altura = 1.80; //tipo não inteiro
		char sexo = 'M'; //armazena um caractere e entre aspas simples
		boolean casado = false; //só armazena true ou false
		
		System.out.println("Meu nome é: "+nome+" e minha idade é: "+idade);
		System.out.println(nome + idade);
		
		nome += " Alexandre"; // junta os nomes (+=)
		
		System.out.println(nome + idade);
	}

}
