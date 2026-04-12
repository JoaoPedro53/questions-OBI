package jota.developer;

import java.util.Locale;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entry = new Scanner(System.in);

        String valueString = entry.nextLine();
        double valueDouble = Double.parseDouble(valueString);
        int valueInt = (int) valueDouble;
        float valueFloat = (float) valueDouble;

        System.out.println(valueInt);
        System.out.printf("%.2f%n", valueDouble);
        System.out.printf("%.2f%n", valueFloat);
        System.out.printf("%.6f%n", Math.abs((valueDouble - valueFloat)));
    }
}
