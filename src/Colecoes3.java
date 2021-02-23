import java.util.HashSet;
import java.util.Set;

public class Colecoes3 {
    public static void main(String[] args){
        // classe HashSet
       Set<String> colecao = new HashSet<>(); // forma rápida de trazer sem repetições
        colecao.add("Carro"); // posição 0
        colecao.add("Moto");  // posição 1
        colecao.add("Barco"); // posição 2
        System.out.println(colecao.add("Carro")); // posição 3

        for (String veiculo: colecao){  // forit em java
            System.out.println(veiculo);
        }

    }
}
