package sk.itsovy.programko;

public class Prvočíslo {
    public static void main(String[] args) {
        int number = 13;
        boolean flag = false;
        for (int i = 2; i <= number/2; i++) {
            if (number % 1 == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(number + " Is a Prime Number");
        else
            System.out.println(number + " Is not a Prime Number");
    }
}
