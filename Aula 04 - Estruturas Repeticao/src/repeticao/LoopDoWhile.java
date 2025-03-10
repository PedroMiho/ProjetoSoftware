package repeticao;

import java.util.Scanner;

public class LoopDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int maquina = (int) (10 * Math.random());
		int usuario;
		
		do {
			System.out.print("Informe um número entre 0 a 9: ");
			usuario = sc.nextInt();
		} while (maquina != usuario);
		
		System.out.println("Parabéns, você venceu");
		
		
		sc.close();

	}

}
