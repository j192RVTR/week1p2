package com.revature.Class6;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber;
        double secondNumber;
        double result = 0;
        int option;
        firstNumber = getDoubleFromInput(scanner, "Enter First Number");
        secondNumber = getDoubleFromInput(scanner, "Enter Second Number");
        option = getOption(scanner, secondNumber);
        System.out.println("Output");

        switch (option) {
            case 1 -> result = firstNumber + secondNumber;
            case 2 -> result = firstNumber - secondNumber;
            case 3 -> result = firstNumber * secondNumber;
            case 4 -> result = firstNumber / secondNumber;
        }

        if(Double.isInfinite(result)){
            System.out.println("Result: " + "Double data type limit exceeded.");
        }
        else
            System.out.println("Result: " + result);


    }

    public static double getDoubleFromInput(Scanner scanner, String msg){
        boolean flag = false;
        double ret = 0;
        while(!flag) {
            System.out.println(msg);
            if (scanner.hasNextDouble()) {
                ret = scanner.nextDouble();
                flag = true;
            }
            else {
                scanner.nextLine();
                System.out.println("Invalid number input.");
            }
        }
        return ret;
    }

    public static int getOption(Scanner scanner, double dividend){
        int option = 0;
        List<Integer> options = Arrays.asList(1,2,3,4);
        while(!options.contains(option)){
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
            if(option == 4 && dividend == 0){
                System.out.println("Can't Divide By Zero!");
                option = 0;
            }
        }
        return option;
    }
}
