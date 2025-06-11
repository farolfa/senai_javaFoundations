package section43;

public class IndexOf {

	public static void main(String[] args) {
		String phoneNum="123-321-342-244";
		int idx1=phoneNum.indexOf('-');
		System.out.println("indice do primeiro hifen: "+idx1);//3
		int idx2 = phoneNum.indexOf('-',idx1+1);
		System.out.println("indice do segundo hifen: "+idx2);//7
	}

}
