import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Variavel8 {

    public static void main(String[] args){

        //regex para verificar a formatação correta do texto

        String regex = "\\b([0-9]{3})\\.([0-9]{3})\\.([0-9]{3})\\-([0-9]{2})";

        String cpf = "111.111.111-00";

        Pattern patter = Pattern.compile(regex); // para compilar o regex
        Matcher match = patter.matcher(cpf); // para descobrir se o cpf esta disponível ou não no texto

        System.out.println(match.find());


    }
}
