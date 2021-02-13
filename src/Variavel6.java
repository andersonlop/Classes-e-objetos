import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.SimpleFormatter;

public class Variavel6 {

    public static void main(String[] args){

       // Metodo Calendar
       Calendar data = Calendar.getInstance();

       System.out.println(data.getTime());

       data.add(Calendar.MONTH,1 ); // adicionando um mês para frente da data atual.
       System.out.println(data.getTime());

       data.add(Calendar.DAY_OF_MONTH, 5); // adicionando 5 dias para frente do dia atual.
       System.out.println(data.getTime());

       data.add(Calendar.DAY_OF_MONTH, -5); // subtraindo 5 dias para frente do dia atual.
       System.out.println(data.getTime());

       data.set(Calendar.MONTH, Calendar.AUGUST); // setando a data para agosto.
       System.out.println(data.getTime());

       // formatando dada

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(sdf.format(data.getTime()));



    }
}
