//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));
    Scanner scanner1 = new Scanner(System.in) ;
    int choix ;

    do {
        System.out.println(" choisir le travailleur ");
        System.out.println("1 : Manager  \n" +
                "2 :Developper \n" +
                "quiter : saisir une valeur different de 1 et 2 ");

        System.out.println(" choisi 1 ou 2 --> :");
         choix = scanner1.nextInt();

        switch (choix) {
            case 1: {
                System.out.print(" donner le salaire de base :");
                double salaryBase = scanner1.nextDouble();
                System.out.print(" donner le taux de performance :");
                double rateperformance = scanner1.nextDouble();
                System.out.print(" donner une avantage :");
                double perk = scanner1.nextDouble();
                Employer employer = new Manager(salaryBase, rateperformance, perk);
                double result = employer.salaryCalculation();
                System.out.println(" Le salaire du Manager est :" + result + " FNG ");
                System.out.println();
                break;

            }


            case 2: {
                System.out.print(" donner le salaire de base :");
                double salaryBase = scanner1.nextDouble();
                System.out.print(" donner le taux de performance :");
                double rateperformance = scanner1.nextDouble();
                System.out.print(" donner une avantage :");
                double perk = scanner1.nextDouble();
                Employer employer = new Developper(salaryBase, rateperformance, perk);
                double result1 = employer.salaryCalculation();
                System.out.println(" Le salaire du Developpeur est :" + result1 + " FNG ");
                System.out.println();
                break;

            }
        }
    }while ( (choix >= 1 ) || (choix  <= 2) ) ;

}
