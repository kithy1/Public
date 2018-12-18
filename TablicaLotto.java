package day1.homework;

import java.util.Random;
import java.util.Scanner;

public class TablicaLotto {


    public static void main(String[] args) {

        TablicaLotto lotto = new TablicaLotto();
        lotto.losowanie();



    }
    public void losowanie(){
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj ilość liczb, z pośród których losujemy, wartość musi być podana w całkowitych liczbach dodatnich różnych od zera :D ");
        int x = s.nextInt();
        int tablica[] = new int[x];
        System.out.println("podaj ile liczb chcesz wylosować, wartość musi być podana w całkowitych liczbach dodatnich różnych od zera,\nilość liczb musi być mniejsza niż ilość liczb spośród której losujemy :D ");
        int y= s.nextInt();
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = i + 1;

        }
        for (int j = 0; j <y ; j++) {



            Random r = new Random();
            int index = r.nextInt(x-(j+1)) + 0;
            System.out.print(tablica[index]+" ");

            tablica[index] = tablica[x-(j+1)];


        }
    }







}
