package section43;
public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Steve Smith";
        int spaceIdx=custName.indexOf(" ");
        String firstName=custName.substring(0,spaceIdx);
        System.out.println(firstName);
    }

    
}
