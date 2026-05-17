package Excecao;

public class ControleExcecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int numero = Integer.parseInt("10");
			int numeros[] = new int[10];
			numeros[10] = 100;
			System.out.println("Numero = " + numero);
		} catch (NumberFormatException e) {
			System.out.println("Numero Inválido!!!");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Elemento inexistente no array...");
		}
	}

}
