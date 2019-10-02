package sk.itsovy.programko;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Scanner;
import java.lang.NumberFormatException;

public class IBANcalc {
    public static void main(String[] args) {
        //String bban = 1231231230/7500;
        //int prefix = 000000;
       // int accNumber = 1231231230;
       // int bankCode = 7500;

        Scanner country = new Scanner(System.in);
        System.out.println("Enter your Country ID:");
        String countryID = country.nextLine();

        Scanner prefixx = new Scanner(System.in);
        System.out.println("Enter Bank number prefix:");
        String prefix = prefixx.nextLine();

        Scanner accNumber = new Scanner(System.in);
        System.out.println("Enter account Number:");
        String acc = accNumber.nextLine();

        Scanner bankCode = new Scanner(System.in);
        System.out.println("Enter your Bank Code Please:");
        String Code = bankCode.nextLine();
        country.close();
        prefixx.close();
        accNumber.close();
        bankCode.close();
        String controlNumber = "00";

        String IBAN = (countryID + controlNumber + " " + Code + " " + prefix + " " + acc);
        System.out.println(IBAN);






    }

}
