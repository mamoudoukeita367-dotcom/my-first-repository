public class FileLifo{

    private int [] elments ;
    private int top ;

    FileLifo(int capacity){
        elments=new int[capacity];
        top =-1;
    }

    public  void push(int value){
        if(top==elments.length-1){
            System.out.println("the array is full");
            return;
        }
        elments[++top]=value;
    }

    public  void pop(){
        if(top==-1){
            System.out.println("the array is empty");
            return;
        }
        System.out.println("apres retirage du dernier int on a :");
        for(int top=0;top<elments.length-1;top++){
            System.out.println(elments[top]);
        }

    }
    public  void display(){
        System.out.println("my file ");
        for(int i: elments){
            System.out.println(i);
        }
    }

    public void peek(){
        if(top==-1){
            System.out.println("the file is empty");
        }
        if(top==elments.length-1){
            System.out.println("L'element du sommet est :"+ elments[top]);
        }
        /*
        if (top==elments.length-1) {
            System.out.println("L'element du sommet est :"+ elments[top--]);
        }
         */
    }


    public boolean Empty(){
        if(top==-1){
            return true;
        }

        return false;

    }


}
