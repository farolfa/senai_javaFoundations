package section44;

import java.util.Random;

public class RandomLimit {

	public static void main(String[] args) {
		Random random=new Random();
		int randomNumLimite= random.nextInt(40)-20;
		System.out.println(randomNumLimite);

	}

}
