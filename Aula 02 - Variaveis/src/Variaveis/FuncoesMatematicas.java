package Variaveis;

public class FuncoesMatematicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Operadores Aritmeticos
		// + -> Adição
		// - -> Subtração
		// / -> Divisão
		// * -> Multiplicação
		// % -> Módulo
		
		
		//Operador Potência
		double potencia = Math.pow(2, 3);
		System.out.println(potencia);
		
		//Operador Raiz Quadrada
		double raizQuadrada = Math.sqrt(16);
		System.out.println(raizQuadrada);
	
		//Número aleatório
		double numeroAleatorio = Math.random();
		System.out.printf("%.1f %n",numeroAleatorio); //Limita o número de casas decimais e o %n quebra linha
		System.out.println("Finalizado");
		
	}

}
