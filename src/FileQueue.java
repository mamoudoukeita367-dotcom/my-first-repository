public class FileQueue {


    private int [] elements;
    private int size ;
    private int IndiceBefore;

    FileQueue(int capacity){
        this.elements= new int[capacity];
        this.size=0;
        this.IndiceBefore=0;
    }

    public void AddFileQueue(int value){
        if(size==elements.length){
            System.out.println("the file is full");
        }
        elements[(IndiceBefore+size)%elements.length]=value;
        size++;
    }


    public  int  DeQueue(){
        if(size==0){
            System.out.println("the file is empty");
            return -1;
        }
        int value = elements[IndiceBefore];
        size--;
        System.out.println("La Liste devient ");
        IndiceBefore++;
        while ( IndiceBefore<=size){

            System.out.println(elements[IndiceBefore]);

            IndiceBefore++;
        }

        System.out.print("Si on diminue ");
        return value;
    }


    public int peek(){
        if (size==0){
            System.out.println("the file is empty");
            return -1;
        }
        System.out.println("La Liste initial avant diminue ");
        IndiceBefore=0;
        while (IndiceBefore < elements.length){
            System.out.println(elements[IndiceBefore]);
            IndiceBefore++;
        }
        return 0;


    }




}
