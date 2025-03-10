package repeticao;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		
		//Login e Senha
		// Desafio - Implemente uma lógica que permita apenas 5 tentativas para o usuario
		
		
		Scanner sc = new Scanner(System.in);
		
		String loginSalvo = "admin";
		String senhaSalva = "admin";

		String login = "";
		String senha = "";
		
		int tentativas = 0;
		int maxTentativas = 5;
		
		while ((tentativas < maxTentativas) && (!login.equals(loginSalvo) || !senha.equals(senhaSalva))) {
			System.out.print("Informe seu login: ");
			login = sc.nextLine();
			
			System.out.print("Informe sua senha: ");
			senha = sc.nextLine();
			
			tentativas++;
		}
		
		if (tentativas >= maxTentativas) {
			System.out.println("Login e senha incorretos");
		}
		else {
			System.out.println("Acesso Liberado");
		}
		sc.close();
		
		
	}

}
