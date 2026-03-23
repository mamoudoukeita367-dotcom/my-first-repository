import java.util.Arrays;

public class RemoveDuplicate {
 public static int [] deleteDuplic(int ...tab){
     Arrays.sort(tab);
     int [] temp = new int[tab.length];
     int k=0;
     temp[k]=tab[0];

     if (tab.length==0){
        return new int[0];
     }

     for(int i=1;i<tab.length;i++){

         if(tab[i-1] != tab[i]){
             k++;
             temp[k]=tab[i];

         }
     }
     return Arrays.copyOf(temp,k+1);
 }


}
