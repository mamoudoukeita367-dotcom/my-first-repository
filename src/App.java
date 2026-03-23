public class App {

    public static void main(String[] args) {
        MaxMinFinder finder = new MaxMinFinder();

        int min = finder.min(1, 3, 4, 5, 6, 98, 0);
        System.out.println("La valeur minimal est: " + min);

        int max = finder.max(1, 34, 56, 3, 7, 100, 598);
        System.out.println("la valeur maximal est : " + max);

    }
}
