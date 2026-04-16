package jota.developer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Object> values = new ArrayList<>();

        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            String value = sc.nextLine();

            if (value.equals("True") || value.equals("False")) {
                values.add(Boolean.valueOf(value));
            } else {
                try {
                    values.add(Integer.valueOf(value));
                } catch (NumberFormatException e1) {
                    try {
                        values.add(Float.valueOf(value));
                    } finally {
                    }
                }
            }
        }
        for (Object variavel : values) {
            if (variavel instanceof Integer) {
                System.out.println("int: " + variavel);
            } else if (variavel instanceof Float) {
                System.out.println("float: " + variavel);
            } else {
                int valorBool = (boolean) variavel ? 1 : 0;
                System.out.println("bool: " + variavel + " (int=" + valorBool + ")");
            }
        }

        float sum = 0f;
        for (Object variavel : values) {
            if (variavel instanceof Integer || variavel instanceof Float) {
                float value = ((Number) variavel).floatValue();
                sum += value;
            }
        }
        System.out.printf(String.format("SOMA: %.2f", sum));
    }
}
