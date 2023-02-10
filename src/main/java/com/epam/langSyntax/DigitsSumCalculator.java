package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        String s = number + "";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum = sum + Character.getNumericValue(s.charAt(i));
        }
        System.out.println(sum);
    }

}
