public class SumTarget {
    public  void thesumtarget(int target, int ...tab) {
        int sum = 0;
        int star = 0;

        for (int end = 0; end < tab.length; end++) {
            sum += tab[end];
            if (sum > target && star <= end) {
                sum -= tab[star];
                star++;
            }
            if (sum < target) {
                sum++;
            }
            if (sum == target) {
                System.out.println("la somme cible est trouve sumCible=" + sum);
            }
        }
    }

}
