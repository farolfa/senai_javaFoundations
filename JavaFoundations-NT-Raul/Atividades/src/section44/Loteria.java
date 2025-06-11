package section44;

import java.util.Random;
import java.util.Scanner;

public class Loteria {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		Random random = new Random();
		System.out.println("informe um numero entre 1 e 10");
		int userInput=input.nextInt();
		int randomInt= random.nextInt(10)+1;
		System.out.println("seu numero: "+userInput);
		System.out.println("o numero vencedor é: "+randomInt);

	}

}
