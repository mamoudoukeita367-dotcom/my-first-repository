//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    Scanner scanner1 = new Scanner(System.in);
    Random random = new Random();
    int nombreSecret = random.nextInt(1);
    int tentative;
    int score = 0 ;
    
    System.out.println( " choix de niveau du jeu : \n" +
            "1 : Niveau Facile \n" +
            "2 : Niveau Moyen \n" +
            "3 : Niveau Difficil \n" +
            "ou taper une valeur differente pour : quiter \n");
    
    
    int niveau  = scanner1.nextInt();


    do {


        switch (niveau) {
            case 1:
                nombreSecret = random.nextInt(3);
                break;
            case 2:
                nombreSecret = random.nextInt(10);
                break;
            case 3:
                nombreSecret = random.nextInt(100);
                break;
            default: System.out.println( " Fin du programme !! ");return;
        }
        do {
            int essaie = 0;

            do {

                System.out.println(" donne Le nombre secret ");
                tentative = scanner1.nextInt();
                essaie++;


                if (tentative > nombreSecret) {
                    System.out.println(" plus petit ");


                } else if (tentative < nombreSecret) {
                    System.out.println(" plus grand ");


                } else if (tentative == nombreSecret) {


                    switch (essaie) {
                        case 1 :System.out.println("Score 100%"); break;
                        case 2 :System.out.println("Score 90%"); break;
                        case 3 :System.out.println("Score 80%"); break;
                        case 4 :System.out.println("Score 60%"); break;
                        case 5 :System.out.println("Score 40%"); break;
                        case 6 :System.out.println("Score 20%"); break;
                    }
                    System.out.println( "Le nombre secret est :"+ tentative);
                    System.out.println(" Bravo !!! ");
                    return;

                }
            } while ( essaie <= 6);
        } while (tentative != nombreSecret);

    }while ( niveau >=1 && niveau <= 3) ;

}