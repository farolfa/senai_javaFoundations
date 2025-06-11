package section43;

import java.util.Scanner;

public class NameMaker {
    
    public static void main(String args[]){
        String firstName,middleName,lastName,fullName;
        Scanner input=new Scanner(System.in);
        System.out.println("first name: ");
        firstName=input.next();
        System.out.println("middle name: ");
        middleName=input.next();
        System.out.println("last name: ");
        lastName=input.next();
        fullName=firstName+" ".concat(middleName)+" ".concat(lastName);
        System.out.println(fullName);
    }
    
}
