package sk.itsovy.programko;

import java.lang.ArithmeticException;

public class delenieDC {
    public static void main(String[] args) {
        int a = 30;
        int b = 2;
        if (b == 0){
            System.out.println("Division by 0 is not possible");
        }
        if (a >=10 && a<=99) {
            System.out.println(a/b);
        }else {
            System.out.println("Not a 2 digit number");
        }
    }
}
