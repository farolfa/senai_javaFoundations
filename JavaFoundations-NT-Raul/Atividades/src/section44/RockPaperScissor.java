package section44;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random= new Random();
		
		System.out.println("−se número = 0: \"pedra\"\r\n"
				+ "−se número = 1: \"papel\"\r\n"
				+ "−se número = 2: \"tesoura\"\nescolha: ");
		int numUser=input.nextInt();
		int bot=random.nextInt(2);
		System.out.println("bot: "+bot);
		
		
	}

}
