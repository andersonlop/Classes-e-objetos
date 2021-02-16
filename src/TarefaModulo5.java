public class TarefaModulo5 {
    public static void main (String[] args){
        Integer ref = new Integer(105);

        System.out.println(ref.toString());

        Float fNum = new Float("15.28");
        System.out.println(fNum);

        Double dNum = new Double("1604.4");
        System.out.println(dNum);

        Character ccar = new Character('T');
        System.out.println(ccar);

        String Car = ("Germano");
        System.out.println(Car);

        System.out.println(Car + " Comprou " + ref + " Caixa de Leite por R$ " + dNum + " a R$ " + fNum + " por caixa." );
    }
}
