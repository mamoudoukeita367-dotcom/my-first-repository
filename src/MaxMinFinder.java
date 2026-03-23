public class MaxMinFinder {

    public int maxi(int x, int y){
        if (x > y) {
            return x;
        }

        return y;
    }

    public int max(int ...values){
        if (values.length == 0){
            return 0;
        }

        int max = 0;

        max = values[0];
        for(int value: values){
            if (value > max){
                max = value;
            }
        }

        return max;
    }

    public int mini(int x, int y){
        if (x < y){
            return x;
        }

        return y;
    }

    public int min(int ...values){
        if (values.length == 0){
            return 0;
        }

        int min = values[0];

        for(int value: values){
            if (value < min){
                min = value;
            }
        }

        return min;
    }
}
