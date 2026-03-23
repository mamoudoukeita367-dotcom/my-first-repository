import java.util.Arrays;

public class Anagrame {
    public boolean isanagram(String str1,String str2){
        if(str1.length() != str2.length()){ return false ;}
        char [] carac1 = str1.toLowerCase().toCharArray();
        char [] carac2 = str2.toLowerCase().toCharArray();
        Arrays.sort(carac1);
        Arrays.sort(carac2);


        return Arrays.equals(carac1,carac2);

    }
}
