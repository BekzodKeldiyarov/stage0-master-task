package com.epam.loops;

import java.util.Scanner;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " x " + numberTableToPrint + " = " + (numberTableToPrint * (i + 1)));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.printTable(num);
    }
}
