import java.util.Arrays;

public class CountVowelLetters {
    public  void vowel(char ...tab) {
        int count = 0;
        Character[] toto = {' '};
        int k = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 'e' || tab[i] == 'i' || tab[i] == 'u' || tab[i] == 'o' || tab[i] == 'a' || tab[i] == 'y') {
                count++;

            }
        }
        System.out.println("Il ya " + count + " voyelles dans le tableau ");
        System.out.println(Arrays.toString(toto));
    }

}
