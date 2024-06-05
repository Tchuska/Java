package basico;

public class Logicos {

	public static void main(String[] args) {
		int idade=18;
		boolean temCarteira = true;
		// &&and ||or !not
		if(idade >=18 && temCarteira== true) {
			System.out.println("Pode dirigir");
		}else{
			System.out.println("Não pode dirigir");
		}
	}

}
