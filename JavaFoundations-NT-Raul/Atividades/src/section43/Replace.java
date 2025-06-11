package section43;

public class Replace {

	public static void main(String[] args) {

		String str="Usando a String replace para substituir \"\r\n"
				+ "+ \"caractere" ;
		String newString=str.replace("r", "R");
		System.out.println(newString);
		System.out.println();
		
		String replace=str.replaceFirst("re", "RE");
		System.out.println(replace);
		
	}

}
