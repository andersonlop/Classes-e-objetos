package um;

public class Primeiro {

	private static Integer variavel = 1;

	public final static Integer CONSTANTE = 10;


	public static Integer metodostatico() {

		return variavel;
	}

	public void metodoPublico() {

		Integer variavel = 1;

		System.out.println(variavel);
		variavel = 2;
		System.out.println(variavel);
	}
	private void metodoPrivado() {
	}
}
