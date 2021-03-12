import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapa {
    // variaveis HashMap
    public static void main(String[] args){
        Map<String, String> map = new TreeMap<>();
        map.put("C", "Carro");
        map.put("M", "Moto");
        map.put("B", "Bicicleta");

        System.out.println(map.get("C"));

        // remover chave map
        map.remove("M");

        System.out.println(map.get("M"));
    }
}
