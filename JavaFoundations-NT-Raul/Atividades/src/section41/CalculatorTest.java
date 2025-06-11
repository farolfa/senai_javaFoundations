package section41;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc =new Calculator();
		calc.quantRateio=6;
		calc.valorRateio=30+15;
		System.out.println(calc.findTotal(10,"p1")+
		calc.findTotal(12,"p2")+calc.findTotal(9, "p3")+
		calc.findTotal(8,"p4")+calc.findTotal(7, "p5")+
		calc.findTotal(11, "p7")
		);
		
	}

}
