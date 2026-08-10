import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Filme filme = new Filme("Homem Aranha", "Ação",
                "Dan Slott", 115, 35, 50);

        System.out.println(filme.toString());

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite a quantidade de ingressos desejados: ");
        int ingressos = sc.nextInt();
        sc.nextLine();

        System.out.println("Olá, " + nome + ", a sua compra ficou no valor de R$ "
                + filme.compraIngresso(ingressos));

        filme.decrementaIngresso(ingressos);

        System.out.println(filme.toString());


        sc.close();
    }
}
