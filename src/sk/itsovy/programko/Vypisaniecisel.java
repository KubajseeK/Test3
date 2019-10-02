package sk.itsovy.programko;

public class Vypisaniecisel {
    public static void main(String[] args) {
        int count = 0;
        for (int i=100; i<=999; i++) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;
            if (a == b && a != c|| a == c && a!= b  ||b == c && a != b) {
                count += 1;
                System.out.println(i);
            }

        }
        System.out.println("Count is: " + count);
    }
}
