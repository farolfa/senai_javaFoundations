package section35;

import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        //Find and print the sum of three integers entered by the user
        System.out.println("escreva o primeiro numero: ");
        int number1= input.nextInt();
        System.out.println("escreva o segundo numero: ");
        int number2= input.nextInt();
        System.out.println("escreva o terceiro numero: ");
        int number3= input.nextInt();
        int soma=number1+number2+number3;
        //Remember to close the Scanner
        System.out.println("resultado da soma : "+soma);
        input.close();
        
    }
}
