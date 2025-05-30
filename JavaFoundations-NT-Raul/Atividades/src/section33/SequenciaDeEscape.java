package section33;

public class SequenciaDeEscape {

	public static void main(String[] args) {
		System.out.println("o gato fez \"miau!\" \f para mim");
		System.out.println("Esta é a primeira linha. \nEsta é a segunda linha.");
		System.out.print(false||true);
		System.out.println("metodo imprimir linha");
		System.out.print("metodo imprimir");
		
		System.out.println("Esta é a primeira linha."
				+ "Esta ainda é a primeira linha."
				+ "É apenas uma linha muito longa "
				+ "e eu não posso ver isso tudo no NetBeans."
				+ "\n" + "Esta é a segunda linha."
				+ "\n" + "Esta é a terceira linha.");
	}

}
