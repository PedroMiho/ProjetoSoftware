import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do Produto: ");
        String produto1 = sc.nextLine();
        System.out.print("Digite a quantidade do Produto: ");
        int quantidade = sc.nextInt();
        System.out.print("Digite o preço do Produto: ");
        double preco = sc.nextDouble();

        double precoFinal = preco * quantidade;

        System.out.println("Produto: " + produto1
                + " Quantidade: " + quantidade +
                "Preco: " + preco +
                "Preco Final: " + precoFinal
        );

        System.out.print("Digite o nome do Produto: ");
        String produto2 = sc.nextLine();
        System.out.print("Digite a quantidade do Produto: ");
        int quantidade2 = sc.nextInt();
        System.out.print("Digite o preço do Produto: ");
        double preco2 = sc.nextDouble();

        double precoFinal2 = preco * quantidade;

        System.out.println("Produto: " + produto2
                + " Quantidade: " + quantidade2 +
                "Preco: " + preco2 +
                "Preco Final: " + precoFinal2
        );






    }
}
