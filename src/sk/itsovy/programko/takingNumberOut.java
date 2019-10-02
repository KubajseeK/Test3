package sk.itsovy.programko;

public class takingNumberOut {
    public static void main(String[] args) {
        int i;
        for (i = 999; i >= 100; i--) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;
            if (a + b + c == 9){
                System.out.println(i);
            }
        }




    }
}
