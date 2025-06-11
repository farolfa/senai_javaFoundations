package section41;

public class Calculator {
	public static double imposto=0.05;
	public static double gorjeta = .15;
	public static double originalPrice=10;
	public static double valorRateio;
	public static double quantRateio;
	
	public double findTotal(double price, String name){
		originalPrice=price;
		String nome=name;
		
		double total1=(originalPrice+(valorRateio/quantRateio))*(1+imposto+gorjeta);
		System.out.println("pessoa1 = "+ total1);
		originalPrice=13;
		return total1;
		
	}
}
