package filmes;

public class Principal {
    public static void main(String[] args) {

        Filme homemAranha = new Filme();
        homemAranha.titulo = "Homem-Aranha: Um Novo Dia";
        homemAranha.genero = "Ação/Aventura";
        homemAranha.anoLancamento = 2026;
        homemAranha.duracao = 145;
        homemAranha.valoIngresso = 45;
        homemAranha.qtdIngresso = 5;

        Filme maskara = new Filme();
        maskara.titulo = "O Máskara";
        maskara.genero = "Comédia";
        maskara.anoLancamento = 1994;
        maskara.duracao = 101;
        maskara.valoIngresso = 45;
        maskara.qtdIngresso = 5;

        System.out.println(maskara.toString());
        System.out.println(homemAranha.toString());




    }
}
