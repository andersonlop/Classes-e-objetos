public class Variavel {

    public static void main(String[] args){
        // declaração de variáveis e cópia de endereço de memória.
        // variável tipo primitivo
        int valor1 = 12;

        int valor2 = valor1;

        System.out.println(valor1);
        System.out.println(valor2);
        valor2 = 20;
        System.out.println(valor1);
        System.out.println(valor2);
    }
}
