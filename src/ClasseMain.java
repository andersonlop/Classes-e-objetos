import um.Carro;

public class ClasseMain{

    public static void main(String... args){
        Carro carro = new Carro(4);
        carro.setCor(carro.PRETA);

        carro.imprimeValores();
    }
}
