public class Variavel {

    public static void main(String[] args){
        // declaração de variáveis e cópia de endereço de memória.
        // variável tipo primitivo

        // Integer valor1 = Integer.valueOf(12); --> com o java 8 isso não se usa mais.
        // int valor1 = 12;
        Integer valor1 = 12; // variaveis do tipo haper
        int valor2 = valor1;

        System.out.println(valor1);
        System.out.println(valor2);
        valor2 = 20;
        System.out.println(valor1);
        System.out.println(valor2);
    }
}
