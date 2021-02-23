

public class Colecoes4 {
    public static void main(String[] args){
        //Como de declarar e adicionar os itens
        int[] valores = new int[4];

        valores[0] = 10;
        valores[1] = 15;
        valores[2] = 20;
        valores[3] = 25;

        for(int i = 0;  i< valores.length; i++){
            System.out.println(valores[i]);
        }

        System.out.println("========== Invertendo a lista ======================");

        // como inverter os valores

        int[] valoresReverso = new int[valores.length];
        int posicaoMaxima = valores.length -1;
        for(int i = posicaoMaxima; i>= 0; i--){
            //System.out.println(valores[i]);
            valoresReverso[posicaoMaxima -i] = valores[i];
        }
        for(int i = 0;  i< valoresReverso.length; i++){
            System.out.println(valoresReverso[i]);
        }

    }
}
