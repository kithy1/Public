package moje.mybox.median;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Median {

    public int listSize() {
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


    public double  getMedian(int x){
        List<Double> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        double a;

        System.out.print("Podaj liczby: ");
        for (int i = 0; i < x; i++) {


            while (true)
                try {
                    a = Double.parseDouble(scanner.nextLine());
                    list.add(a);

                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Nie podano liczby.Spróbuj jeszcze raz wpisać wszystkie liczby! ");
                }
        }
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        System.out.println();
        if (list.size() % 2 == 0) {
            return ((list.get(list.size()/2)-1) + list.get(list.size() / 2)) / 2;
        } else return list.get(list.size() / 2);
    }

}
