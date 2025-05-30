package section34;

public class Cast2 {
	public static void main(String[] args) {
		short myShort;
		byte toShort =(byte)128;
		myShort = (short)toShort;
		System.out.println(myShort);
		
		short shortToByte=128;
		byte bite = (byte)shortToByte;
		
		byte um27=127;
		System.out.println(um27+1);
		
		int n1=45;
		int n2=47;
		byte bites= (byte)(n1+n2);
		System.out.println(bites);
		
	}
}
