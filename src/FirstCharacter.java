public class FirstCharacter {
    public void  isfirstcharac(String str) {
        int[] count = new int[256];
        int i;
        for (char c : str.toCharArray()) {
            count[c-'a']++;
        }
        for (char c : str.toCharArray()) {

            if (count[c-'a'] == 1) {
                //return c; // pour afficher le code unique du caractere
                System.out.print(c +"\t"); // pour afficher toutes les caracteres unique .
            }

        }
        System.out.println();

    }
}
