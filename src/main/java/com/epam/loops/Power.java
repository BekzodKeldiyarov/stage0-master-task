package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int result = numberToPrint;
        for (int i = 0; i < Math.abs(power - 1); i++) {
            if (power < 0) {
                result = result / numberToPrint;
            } else {
                result = result * numberToPrint;
            }
        }
        if (power == 0) {
            result = 1;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Power().printPower(2, 10);
    }

}
