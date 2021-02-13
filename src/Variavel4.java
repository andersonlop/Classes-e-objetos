import java.util.Locale;

public class Variavel4 {
    public static void main(String[] args){

        // metodos de objetos string

        // charAt
        String texto = "Mentorama - Java - Curso";
        String testo1 = "Mentorama JAVA";

        System.out.println(texto.charAt(0));

        System.out.println(texto.compareTo(testo1));
        System.out.println(texto.compareToIgnoreCase(testo1));

        System.out.println(texto.equals(testo1)); // comparando que é diferente da de baixo, texto é diferente de texto1, por estar JAVA.
        System.out.println(texto.equalsIgnoreCase(testo1));// comparando ignorando o maíusculo, então as palavras são iguais

        System.out.println(texto.startsWith("Men")); // comparação de inicia com a palavra "Men".
        System.out.println(testo1.endsWith("Java")); // comparação se finaliza com "java". apresenta falso, pois esta maiusculo na variável.
        System.out.println(testo1.endsWith("JAVA")); // comparação se finaliza com "java".

        String[] textos = texto.split("-"); // retorna um array de textos. Quebrando o texto com o caracter "-".
        for(String t: textos){
          //  System.out.println(t);
          //  System.out.println(t.toLowerCase()); // deixa tudo minusculo.
          //  System.out.println(t.toUpperCase()); // deixa tudo maiusculo
              System.out.println("." + t.trim() + "."); // tira os espaços
        }

        System.out.println(texto.isEmpty());// mostra se a variavel esta vazia ou não.

        String vazia = "";
        System.out.println(vazia.isEmpty());// mostra se a variavel esta vazia ou não.

        System.out.println(texto.substring(1, 3)); // Retira um pedaço do texto para manipular.
    }
}

