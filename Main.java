package moje.mybox.median;

public class Main {
    public static void main(String[] args) {
        Median median = new Median();
        int x = median.listSize();
        System.out.println(median.getMedian(x));
    }
}
