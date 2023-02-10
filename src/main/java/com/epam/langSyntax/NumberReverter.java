package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        String numberString = number + "";
        for (int i = numberString.length() - 1; i >= 0; i--) {
            System.out.print(numberString.charAt(i));
        }
    }

}
