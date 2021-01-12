package oof.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Choose an operand!");
        System.out.println("Add = Addition, Sub = Subtract, Mul = Multiply, Div = Divide");
        Scanner input =  new Scanner(System.in);
        String userChoice = input.nextLine();
        switch(userChoice.toLowerCase()) {
            case "add":
                System.out.println("Now adding");
                System.out.println("Enter first number.");
                Integer number1 = input.nextInt();

                System.out.println("Enter second number.");
                Integer number2 = input.nextInt();

                Integer sum = Operators.addition(number1, number2);
                System.out.println("The sum of the 2 numbers are" + sum);
                break;
            case "sub":
                System.out.println("Now subtracting");
                System.out.println("Enter first number.");
                Integer number3 = input.nextInt();

                System.out.println("Enter second number.");
                Integer number4 = input.nextInt();

                Integer subtractedSum = Operators.subtract(number3, number4);
                System.out.println("The subtracted sum of the 2 numbers are" + subtractedSum);
                break;
            case "mul":
                System.out.println("Now multiplying");
                System.out.println("Enter first number.");
                Integer number5 = input.nextInt();

                System.out.println("Enter second number.");
                Integer number6 = input.nextInt();

                Integer multipliedSum = Operators.multiply(number5, number6);
                System.out.println("The multiplied sum of the 2 numbers are" + multipliedSum);
                break;
            case "div":
                System.out.println("Now dividing");
                System.out.println("Enter first number.");
                Integer number7 = input.nextInt();

                System.out.println("Enter second number.");
                Integer number8 = input.nextInt();

                Integer dividedSum = Operators.divide(number7, number8);
                System.out.println("The divided sum of the 2 numbers are" + dividedSum);
                break;
        }
    }
}
