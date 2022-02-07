package com.revature.Class6;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = 0;
        double secondNumber = 0;
        double result = 0;
        int option = 0;
        boolean flag = false;
        while(!flag) {
            System.out.println("Enter First Number");
            if (scanner.hasNextDouble()) {
                firstNumber = scanner.nextDouble();
                flag = true;
            }
            else {
                scanner.nextLine();
                System.out.println("Invalid number input.");
            }
        }
        flag = false;
        while(!flag) {
            System.out.println("Enter Second Number");
            if (scanner.hasNextDouble()) {
                secondNumber = scanner.nextDouble();
                flag = true;
            }
            else {
                scanner.nextLine();
                System.out.println("Invalid number input.");
            }
        }

        while(!Arrays.asList(1, 2, 3, 4).contains(option)){
            System.out.println("""
                    Select Option:
                    1 - Add
                    2 - Subtract
                    3 - Multiple
                    4 - Divide
                    """);
            if(scanner.hasNextInt())
                option = scanner.nextInt();
            if(!Arrays.asList(1, 2, 3, 4).contains(option))
                System.out.println("That wasn't a valid input!");
            if(option == 4 && secondNumber == 0){
                option = 0;
                System.out.println("Can't divide when second number is 0.");
            }
        }

        System.out.println("Output");
        switch (option) {
            case 1 -> result = firstNumber + secondNumber;
            case 2 -> result = firstNumber - secondNumber;
            case 3 -> result = firstNumber * secondNumber;
            case 4 -> result = firstNumber / secondNumber;
        }
        System.out.println("Result: " + result);


    }
}
