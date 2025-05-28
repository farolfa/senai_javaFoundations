package section31;

public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
    	final int COLETA = 3;
    	double dailyAverage;
    	double monthlyAverage;
    	double monthlyProfit;
    	//segunda
    	dailyAverage =100; 
    	//terça 
    	dailyAverage += 121;
    	//quarta 
    	dailyAverage += 117;
    	
    	dailyAverage /= COLETA; 
    	monthlyAverage = dailyAverage*30;
    	monthlyProfit=monthlyAverage*0.18;
    	
    	
    	
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
