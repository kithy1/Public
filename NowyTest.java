package moje.mybox.median1;

import java.util.Arrays;
import java.util.Scanner;

public class NowyTest {


    private int tableSize() {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj ilość liczb do obliczenia mediany: ");
        while (true) {
            try {
                int size = Integer.parseInt(s.nextLine());
                return size;

            } catch (NumberFormatException e) {
                System.out.println("Nie podano liczby całkowitej. Spróbój jeszcze raz! ");
            }
        }

    }

    public double addNumber() {
        double[] table = new double[tableSize()];

        Scanner scanner = new Scanner(System.in);

        double a;

        System.out.print("Podaj liczby: ");
        while (true)
            try {

                for (int i = 0; i < table.length; i++) {
                    a = Double.parseDouble(scanner.nextLine());
                    table[i] = a;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.print("Nie podano liczby.Spróbuj jeszcze raz wpisać wszystkie liczby! ");
            }

        Arrays.sort(table);
        for (double x : table) {
            System.out.print(x + " ");
        }
        System.out.println();
        if (table.length % 2 == 0) {
            return (table[(table.length / 2) - 1] + table[(table.length / 2)]) / 2;
        } else return table[table.length / 2];
    }
}
