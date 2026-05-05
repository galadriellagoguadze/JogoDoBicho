package jogodobicho;
import java.util.Random;
import java.util.Scanner;
public class JogoDoBicho {
	private static Scanner sc = new Scanner(System.in);
	// todos os atributos tem que ser privados
	private final static String[] cartela = {"Avestruz", "Aguia", "Burro", "Borboleta",
			"Cachorro", "Cabra", "Carneiro", "Camelo", "Cobra", "Coelho", "Cavalo",
			"Elefante", "Galo", "Gato", "Jacare", "Leao", "Macaco", "Porco", "Pavão", "Peru",
			"Touro", "Tigre", "Urso", "Veado", "Vaca"};
	
	public static String[] getCartela() {
		return cartela;
	}
	
	public static String pegaBicho(int id, String[] cartela) {
		if(id < 1 || id > 25) {
			return "Numero fora da faixa [1-25]";
		}
		return cartela[id-1];
	
	}
	
	public static int[] fazAposta() {
	    int[] aposta = new int[5];
	    System.out.print("Digite a aposta: ");
	    for (int i = 0; i < aposta.length; i++) {
	        aposta[i] = sc.nextInt();
	    }
	    return aposta;
	}
	
	public static String fazApostaAleatoria() {
		System.out.println("Quantos números gostaria de sortear?");
		int quantidade = sc.nextInt();
	    sc.nextLine(); 
		int[] aux = new int[quantidade];
		Random r = new Random();
		for(int i=0; i < aux.length; i++) {
			aux[i] = 1 + r.nextInt(25);
		}
		return imprimeAposta(aux, cartela);
	}
	
	public static String imprimeAposta(int[] aposta, String[] cartela) {
		String retorno = "";
		for(int i:aposta) {
			retorno += cartela[i-1] + " ";
		}
		return retorno.trim();
	}
}

