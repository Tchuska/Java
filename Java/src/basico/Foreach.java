package basico;

public class Foreach {

	public static void main(String[] args) {
		/*String[] nomes = {"Carlos", "Miguel", "Gabriela"};
		for(String nome : nomes) {
			System.out.println(nome);
		}*/
		int[] numero = {1,5,10};
		int soma=0;
		for(int n : numero) {
			soma  += n;
		}
		System.out.println(soma);
	}

}
