package com.company;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("As a fan of math,");
        System.out.println("I want to model a calculator which accepts add, subtract, multiply, divide, cancel, and exit as commands, So that I can do basic mathematics");
        System.out.println("Commands look like so");
        String command = "";
        int result = 0;
        boolean run = true;
        while (run){
            command = input.next();
            switch (command){
                case "add" :
                    result = add(result);
                    print(result);
                    break;
                case "subtract" :
                    result = subtract(result);
                    print(result);
                    break;
                case "multiply" :
                    result = multiply(result);
                    print(result);
                    break;
                case "divide" :
                    result = divide(result);
                    print(result);
                    break;
                case "cancel" :
                    result = reset();
                    print(result);
                    break;
                case "exit" :
                    run = false;
                    break;
                default:
                    print(result);
                    break;
            }
        }
    }

    static int add(int result){
        int num = input.nextInt();
        return result += num;
    }

    static int subtract(int result){
        int num = input.nextInt();
        return result -= num;
    }

    static int multiply(int result){
        int num = input.nextInt();
        return result *= num;
    }

    static int divide(int result){
        int num = input.nextInt();
        if (num == 0){
            return reset();
        }
        return result /= num;
    }

    static int reset(){
        return 0;
    }

    static void print(int result){
        System.out.printf("%d.0\n", result);
    }

}
