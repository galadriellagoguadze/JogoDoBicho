package jogodobicho;
import java.util.Scanner;

public class MainJogoDoBicho {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("O que quer fazer: \n" +
		"A - Pegar bicho \n" +
		"B - Aposta \n" +
		"C - Aposta aleatoria \n" +
		"S - SAIR");
		String acao = sc.nextLine();
		if(acao.equals("S")) {
			break;
		}
		if(acao.equals("A")) {
			System.out.println("Digite o numero: ");
			int id =  sc.nextInt();
			sc.nextLine();
			System.out.println(JogoDoBicho.pegaBicho(id, JogoDoBicho.getCartela()));
		}
		if(acao.equals("B")) {
			 int[] aposta = JogoDoBicho.fazAposta();
			 System.out.println(JogoDoBicho.imprimeAposta(aposta, JogoDoBicho.getCartela()));
			 System.out.println("Aposta feita");
		}
		if(acao.equals("C")) {
			System.out.println(JogoDoBicho.fazApostaAleatoria());
		}
		}
		
		sc.close();
	}
}

