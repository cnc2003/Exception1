package Exception1;

import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
//        if (number2 != 0) 
//            System.out.println(number1 + "/" + number2 + " = " + (number1/number2) );
//        else
//            System.out.println("Divisor can't be zero");
        try{
            System.out.println(number1 + "/" + number2 + " = " + (number1/number2) );
        }
        catch(ArithmeticException ex){
            System.out.println("Exception: Divisor can't be zero");
        }
    }
}
