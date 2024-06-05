package objetos;

public class Classes {

	public static void main(String[] args) {
		Pessoa eu = new Pessoa(); //acessando variáveis de outra classe (Pessoa)
		System.out.println(eu.nome);
		
		eu.nome = "Henrique";
		System.out.println (eu.nome);
	}

}
