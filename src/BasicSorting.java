public class BasicSorting {
    public void sortbasic(int ...tab){
        int n= tab.length-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(tab[j]>tab[j+1]){
                    int boite=tab[j];
                    tab[j]=tab[j+1];
                    tab[j+1]=boite;
                }
            }
        }
        System.out.println("Array sorted :");
        for(int i=0;i<tab.length;i++){
            System.out.println(tab[i]);
        }
    }


}
