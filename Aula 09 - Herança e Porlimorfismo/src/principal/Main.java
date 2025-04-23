package principal;

import entidades.Carro;
import entidades.Moto;

public class Main {

	public static void main(String[] args) {
		
	    Carro civic = new Carro("Honda", "Civic", 2024, 400, true);
	    System.out.println(civic.toString());
	    System.out.println("O valor do aluguel desse carro foi de R$ " + civic.calcularAluguel(5));
	    System.out.println();
	    
	    Moto hayabusa = new Moto("Suzuki", "Hayabusa", 2024, 200, 1000);
	    System.out.println(hayabusa.toString());
	}

}
