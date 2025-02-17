package Variaveis;
import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String nome;
		System.out.println("Digite seu nome: ");
		nome = sc.next(); // Armazenar valores do tipo texto
		System.out.println(nome);
		
		System.out.println("Digite a sua idade: ");
		int idade = sc.nextInt(); // Armazenar valores do tipo inteiro
		
		System.out.println("Digite seu peso: ");
		double peso = sc.nextDouble(); // Armazenar valores do tipo flutuante (Decimal)
		
		System.out.println("A sua idade é de " + idade + " anos");
		System.out.println("O seu peso é de " + peso + " kg");
		
		sc.close();
	}

}
