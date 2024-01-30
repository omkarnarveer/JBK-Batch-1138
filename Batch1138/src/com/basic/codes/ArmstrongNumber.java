package com.basic.codes;

public class ArmstrongNumber {

    static boolean isArmstrongNumber(int number) {
        
    	int originalNumber = number;
        int power = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, power);
            number /= 10;
        }

        return originalNumber == sum;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(9474));
    }
}