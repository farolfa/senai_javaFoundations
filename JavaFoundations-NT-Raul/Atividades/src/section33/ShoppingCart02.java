package section33;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;

        // Declare and initialize numeric fields: price, tax, quantity.   
        double preco=1200;
        double imposto=.12;
        int quant=1;
        // Declare and assign a calculated totalPrice
        double precoTotal=((preco*quant)*imposto)+preco;
        // Modify message to include quantity 
        
        System.out.println(message+ " R$:"+precoTotal);
        
        // Print another message with the total cost
        
    }    
}
