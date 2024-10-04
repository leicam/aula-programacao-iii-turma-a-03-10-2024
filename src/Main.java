import builders.SanduicheBuilder;
import entidades.Sanduiche;
import entidades.SanduicheRefatorado;

public class Main {
    public static void main(String[] args) {
        System.out.println("Executa Legado");
        executarLegado();

        System.out.println("Executa Refatorado");
        executarRefatorado();
    }

    private static void executarRefatorado(){
        SanduicheRefatorado xBurger = new SanduicheBuilder()
                .setPao("Forma")
                .setCarne("Hamburger")
                .build();

        SanduicheRefatorado xFrango = new SanduicheBuilder()
                .setPao("Leite")
                .setCarne("Frango")
                .setSalada("Alface")
                .build();

        SanduicheRefatorado xPicanha = new SanduicheBuilder()
                .setPao("Hamburger")
                .setCarne("Picanha")
                .setSalada("Alface")
                .setTemMolho(true)
                .build();

        System.out.println(xBurger.toString());
        System.out.println(xFrango.toString());
        System.out.println(xPicanha.toString());
    }

    private static void executarLegado(){
        Sanduiche xBurger = new Sanduiche("Forma",
                "Hamburguer");
        Sanduiche xFrango = new Sanduiche("Leite",
                "Frango",
                "Alface");
        Sanduiche xPicanha = new Sanduiche("Hamburger",
                "Picanha",
                "Alface",
                true);

        System.out.println(xBurger.toString());
        System.out.println(xFrango.toString());
        System.out.println(xPicanha.toString());
    }
}