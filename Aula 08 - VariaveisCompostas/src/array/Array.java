package array;

import java.util.ArrayList;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		
		//Tipos Primitivos - int, double, char
		//Objetos - String, Integer, Double

		List <String> listaNomes = new ArrayList<>();
		
		//Adicionando itens
		listaNomes.add("Pedro");
		listaNomes.add("Gustavo");
		listaNomes.add("João");
		listaNomes.add("Vitor");
		listaNomes.add("Thamirys");
		
		
		
		//Remover um item da lista pelo valor
		listaNomes.remove("Pedro");
		
		//Remover um item da lista pela posição
		listaNomes.remove(3);
		
		//Adicionando em um posição desejada
		listaNomes.add(2, "William");

		//Verifica o tamanho da lista
		System.out.println(listaNomes.size());
		
		//Percorrer a Array e o Vetores
		for (String nome : listaNomes) {
			System.out.println(nome);
		}
		

	}

}
