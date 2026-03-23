public class NumberOccurence {

    public int countOccurence(int target ,int ...values) {
        int Count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                Count++;
            }
        }
        return Count;
    }


}
