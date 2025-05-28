package section31;

public class OperadoresAcrescimo {

	public static void main(String[] args) {
		
		int id = 6;
		System.out.println(id);
		int newId= ++id;
		System.out.println(newId);
		
		
		int id2 = 6;
		System.out.println(id2);
		int newId2= id2--;
		System.out.println(newId2);
		
		 int count=15;
		 int a, b, c, d;
		 a = count++;
		 b = count;
		 c = ++count;
		 d = count;
		 System.out.println(a + ", " + b + ", " + c + ", " + d);
	}

}
