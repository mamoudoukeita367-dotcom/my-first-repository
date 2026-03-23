public class SearchLinear {
    public  int linesearch(int element,int ...tab){
        for(int i=0;i<tab.length;i++){
            if(tab[i]==element){
                return i;
            }
        }
        return 0;
    }
}
