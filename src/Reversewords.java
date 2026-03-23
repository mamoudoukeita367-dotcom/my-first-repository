import java.util.Arrays;

public class Reversewords {
    public  void reverse(String tab) {
        String[] word = tab.split(" ");
        StringBuilder result = new StringBuilder();
        System.out.print("the string reverse :");
        for (int i = word.length - 1; i >= 0; i--) {
            System.out.print((word[i]) + " ");
        }
        System.out.println();
    }
}
