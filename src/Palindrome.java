public class Palindrome {
    public Boolean ispalindrome(String tab) {
        int i = 0;
        int j = tab.length() - 1;
        while (i < j) {
            if (tab.charAt(i) == tab.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;

    }
}
