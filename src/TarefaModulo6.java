import java.util.ArrayList;

public class TarefaModulo6 {

    public static void main(String[] args) {

        String[][] presenca = new String[5][5];

        // Título
        presenca[0][0] = "         ";
        presenca[0][1] = "Data 1 ";
        presenca[0][2] = "Data 2 ";
        presenca[0][3] = "....";
        presenca[0][4] = " Data N";

        // aluno 1
        presenca[1][0] = "Aluno 1";
        presenca[1][1] = "presente";
        presenca[1][2] = "ausente ";
        presenca[1][3] = "....";
        presenca[1][4] = "presente";

        // aluno 2
        presenca[2][0] = "Aluno 2";
        presenca[2][1] = "ausente";
        presenca[2][2] = "presente ";
        presenca[2][3] = "....";
        presenca[2][4] = "presente";

        // Espaço
        presenca[3][0] = "........";
        presenca[3][1] = "........";
        presenca[3][2] = "........";
        presenca[3][3] = "....";
        presenca[3][4] = "........";

        // Aluno N
        presenca[4][0] = "Aluno N";
        presenca[4][1] = "presente";
        presenca[4][2] = "presente";
        presenca[4][3] = "....";
        presenca[4][4] = "ausente";

        for(int i=0; i<presenca.length; i++){
            for(int j=0; j<presenca[i].length; j++) {
               System.out.print(presenca[i][j] + " ");
            }
            System.out.println();
        }
    }
}
