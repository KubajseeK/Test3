package sk.itsovy.programko;

import java.time.LocalDate;
import java.time.Period;

//LocalDate function is usable with time related programs.
// Classes are "java.time.
// Usage: LocalDate -variableName- = -LocalDate.-

public class ageCalc {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1994, 9, 12);
        int years = Period.between(birthDate, today).getYears();
        System.out.println(years);
    }
}
