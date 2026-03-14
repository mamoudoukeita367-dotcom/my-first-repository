//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"");
            }


            System.out.println();
        }



        int k=6;
        for(int i=1;i<=k;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"");

            }
                System.out.println();
        }


        int z=7;
        for(int i=z;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+"");
            }
            System.out.println();
        }

        int y=8;
        for(int i=y;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
}