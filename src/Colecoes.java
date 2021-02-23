import java.util.ArrayList;

// Vetores e coleções
public class Colecoes {
    public static void main(String[] args){
        // criação de lista
        ArrayList<String> colecao = new ArrayList<>();
        colecao.add("Carro"); // posição 0
        colecao.add("Moto");  // posição 1
        colecao.add("Barco"); // posição 2
        colecao.add("Carro"); // posição 3

        System.out.println(colecao.get(0)); // get uma forma de pegar a variavel da ArrayList
        System.out.println(colecao.get(2));

        for (String veiculo: colecao){  // forit em java
            System.out.println(veiculo);
        }

        colecao.remove(0); // remove item do indice.

        for (int i = 0; i < colecao.size(); i++){
            System.out.println((colecao.get(i)));

        }
    }
}
