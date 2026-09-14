import entidades.Animal;
import entidades.Cachorro;
import entidades.Gato;
import entidades.Peixe;

public class Main {

    public static void main(String[] args) {

        //Cachorro
        Cachorro marley = new Cachorro("Marley", 5, 30, "Labrador");
        //Gato
        Gato garfield = new Gato("Garfield", "Laranja", 15, 5);
        //Peixe
        Peixe nemo =  new Peixe("Nemo", 5, 20, "Peixe-Palhaço");

        System.out.println("Cachorro:\n" + marley);
        System.out.println("Gato:\n" + garfield);
        System.out.println("Peixe:\n" + nemo);


    }

}
