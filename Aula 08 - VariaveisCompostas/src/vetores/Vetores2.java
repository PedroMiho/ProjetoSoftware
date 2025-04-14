package vetores;

import java.util.Scanner;

public class Vetores2 {

	public static void main(String[] args) {
		
		//Criando vetores
		double [] notasAlunos = new double [3];
		Scanner sc = new Scanner(System.in);
		
		//Atribuir valores, laço for
		
		for(int i = 0; i < notasAlunos.length; i++) {
			System.out.println("Informe uma nota entre 0 a 10");
			double nota = sc.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				notasAlunos[i] = nota;				
			}
			else {
				i--;
				System.out.println("Nota inválida");
			}
			
		}
		
		for (double notas : notasAlunos) {
			System.out.println(notas);
		}
		
		sc.close();

	}

}
