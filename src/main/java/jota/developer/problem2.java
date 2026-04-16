package jota.developer;

import java.util.Locale;
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.nextLine();
        int b = sc.nextInt();
        sc.nextLine();
        int c = sc.nextInt();

        String resultReal = (b == 0) ? "INDEFINIDO" : String.format("%.4f", (double) a / b / c);
        String resultInt = (b == 0) ? "INDEFINIDO" : String.valueOf(a / b / c);

        int calcFirst = a + b * c;
        int calcSecond = a * b + b * c;

        String calcFirstSignal;
        if (calcFirst > 0) {
            calcFirstSignal = "POSITIVO";
        } else if (calcFirst < 0) {
            calcFirstSignal = "NEGATIVO";
        } else {
            calcFirstSignal = "ZERO";
        }

        System.out.println(calcFirst);
        System.out.println(calcSecond);
        System.out.println("INTEIRO: " + resultInt);
        System.out.println("REAL: " + resultReal);
        System.out.println(calcFirstSignal);
    }
}
