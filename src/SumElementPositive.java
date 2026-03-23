public class SumElementPositive {
    public static int sumPositive(int ... ArrayElement) {
        int sum = 0;
        for (int i = 0; i < ArrayElement.length; i++) {
            if (ArrayElement[i] > 0) {
                sum += ArrayElement[i];
            }
        }
        return sum;
    }


}
