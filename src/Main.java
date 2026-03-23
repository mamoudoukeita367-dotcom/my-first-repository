
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int Maximum(int[] tab) {
        int max = tab[0];
        for (int i = 0; i < tab.length; i++) {

            if (max < tab[i]) {
                max = tab[i];
            }
        }
        return max;
    }

    public static int Minimum(int[] tab) {
        int min = tab[0];
        for (int i = 0; i < tab.length; i++) {

            if (min > tab[i]) {
                min = tab[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        System.out.println("1:Find Max/min \n" +
                "2:Sum Filter \n" +
                "3:Count Occurrences \n" +
                "4:Remove Duplicate \n" +
                "5:Rotate Array \n" +
                "6:Merge Sorted Arrays \n" +
                "7:Subarray Sum \n" +
                "8:Vowel Counter \n" +
                "9:Palindrome Check \n" +
                "10:Reverse Words \n" +
                "11:Title Case \n" +
                "12:Anagram Check \n" +
                "13:First Non-Repeating character\n" +
                "14:Fibonacci Iterative \n" +
                "15:Factorial Recurssive \n" +
                "16:Linear search \n" +
                "17:Basic Sorting \n" +
                "18:Implement Queue FIFO \n" +
                "19:Implement a stack LIFO \n" +
                "20:Big O Analysis \n ");

        int enter =1;
        do {
            Scanner scanner = new Scanner(System.in);
            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 =new Scanner(System.in);
            System.out.println("donner votre numero de choix dans le Menu");
            int choix = scanner.nextInt();

            char confirmation;
            switch (choix) {
                case 1:

                    do {
                        System.out.println("Find Max or Min");
                        System.out.println();
                        MaxMinFinder maxMinFinder = new MaxMinFinder();
                        int mi = maxMinFinder.min(2, 4, 7, 9, 5, 6, 12, 34, 65);
                        System.out.println("le minimum est " + mi);
                        int ma = maxMinFinder.max(12, 11, 34, 89, 15, 23, 34, 56);
                        System.out.println("le maximum est " + ma);


                        System.out.println("voulez vous reessayez ? o/n");
                        confirmation = scanner.next().charAt(0);

                        do  {
                            System.out.println("Find Max or Min");
                            System.out.println("donner la taille du tableau ");
                            int n = scanner.nextInt();
                            int [] tab = new int[n];

                            for(int i=0;i<n;i++){
                                System.out.println("Entrer le nombre " + (i+1) +":");
                                tab[i]=scanner.nextInt();
                            }
                            int min=maxMinFinder.min(tab);
                            System.out.println("le minimum est " + min);
                            int max =maxMinFinder.max(tab);
                            System.out.println("le maximum est " + max);


                            System.out.println("voulez vous reessayez ? o/n");
                            confirmation = scanner.next().charAt(0);

                        }while (confirmation=='o');


                    } while (confirmation == 'o');

                    break;
                case 2:


                    do {

                        System.out.println("the sum of elements positive ");

                        System.out.println("donner la taille de votre tableau :");
                        int n =scanner.nextInt();
                        int [] tab = new int[n];
                        for(int i=0;i<n;i++){
                            System.out.println("entrer le nombre " + (i+1) + ":");
                            tab[i]=scanner.nextInt();
                        }

                        SumElementPositive sumElement = new SumElementPositive();
                        int value = sumElement.sumPositive(tab);
                        System.out.println("la somme est :" + value);
                        System.out.println("voulez vous reessayez ? O/N");
                        confirmation = scanner.next().charAt(0);
                    } while (confirmation == 'o');

                    break;
                case 3:


                    do {
                        System.out.println("The number ocurrence of appear value");
                        System.out.println("donner la taille du tableau :");
                        int n3 =scanner1.nextInt();
                        int [] tab3 =new  int[n3];
                        for(int i=0;i<n3;i++){
                            System.out.println("Entrez le nombre " + (i+1) + ":");
                            tab3[i]=scanner1.nextInt();
                        }

                        System.out.println("Entrez la valeur rechercher :");
                        int value =scanner1.nextInt();
                        NumberOccurence nbocurence = new NumberOccurence();
                        int ocurence = nbocurence.countOccurence(value,tab3);

                        System.out.println("le nombre d'occurence de " + value + " est :" +ocurence);
                        System.out.println("voulez vous reessayez ? O/N");
                        confirmation = scanner.next().charAt(0);
                    } while (confirmation == 'O');
                    break;
                case 4:

                    do {


                        System.out.println("donner la taille du tableau :");
                        int n4 =scanner1.nextInt();
                        int [] tab4 = new int[n4];
                        for(int i=0;i<n4;i++){
                            System.out.println("Entrer le numero " +(i+1) + ":");
                            tab4[i]=scanner1.nextInt();
                        }

                        RemoveDuplicate removeDupli = new RemoveDuplicate();
                         int [] chow =removeDupli.deleteDuplic(tab4);
                            for(int n : chow){
                                System.out.println(n);
                            }
                        System.out.println("voulez vous reessayez ? O/N");
                        confirmation = scanner.next().charAt(0);
                    } while (confirmation == 'o');
                    break;
                case 5:
                    do {

                        System.out.println("donner la taille de votre tableau :");
                        int n5 =scanner2.nextInt();
                        int []tab5 = new int[n5];
                        for(int i=0; i<n5;i++){
                            System.out.println("Entrez le numero :" + (i+1) + ":");
                            tab5[i]=scanner2.nextInt();
                        }

                        System.out.println("donner la valeur de rotation :");
                        int value =scanner2.nextInt();
                        do {
                            if (value == tab5.length) {
                                System.out.println("Rotation Impossible ,USAGE: Valeur de rotation < taba.length ");
                            }
                            System.out.println("donner la valeur de rotation :");
                            value =scanner1.nextInt();
                        } while (value== tab5.length);

                        System.out.println("donner le type de rotation (1 = rotation gauche ou 2 = rotation droite):");
                        int cas = scanner2.nextInt();

                            switch (cas){
                                case 1: RotationArrayLeft rotationArrayL = new RotationArrayLeft();
                                        rotationArrayL.rotateInarrayleft(value, tab5);
                                        break;


                                case 2: RotationArrayRight rotationArrayR = new RotationArrayRight();
                                        rotationArrayR.rotateInarrayright(value, tab5);
                                        break;

                                       }



                        System.out.println("voulez vous reessayez ? O/N");
                        confirmation = scanner1.next().charAt(0);
                    } while (confirmation == 'o');
                    break;
                case 6:
                    do {

                        System.out.println("The Merging Array ");
                        System.out.println("donner la taille de votre premier tableau ");
                        int t1 =scanner.nextInt();
                        int [] tab1 = new int[t1];

                        for(int i=0;i<t1;i++){
                            System.out.println("Entrez le nombre " + (i+1) + ":");
                            tab1[i]=scanner.nextInt();
                        }
                        Merging merging = new Merging();
                        merging.sorted(tab1);

                        System.out.println("donner la taille de votre deuxieme tableau :");
                        int t2 =scanner.nextInt();
                        int [] tab2 = new int[t2];

                        for(int i=0;i<t2;i++){
                            System.out.println("Entrez le nombre " + (i+1) + ":");
                            tab2[i]=scanner.nextInt();
                        }

                        merging.sorted(tab2) ;

                        int [] resultat = merging.mergeArray( tab1 , tab2 ) ;
                        for (int s : resultat ){
                            System.out.println( s );
                        }


                        int [] deletDup = merging.deletDuplicatMerge(tab1,tab2) ;
                        System.out.println(Arrays.toString(deletDup));

                        System.out.println("voulez vous reessayez ? O/N") ;
                        confirmation = scanner.next().charAt(0) ;
                    } while (confirmation == 'o') ;
                    break;
                case 7:
                    do {

                        System.out.println("donner la taille du tableau :");
                        int n7 =scanner1.nextInt();
                        int [] tab7 = new int[n7];
                        for(int i=0;i<n7;i++){
                            System.out.println("Entrer le nombre " + (i+1) + ":");
                            tab7[i]=scanner1.nextInt();
                        }

                        System.out.println("donner la somme cible ");
                        int targ =scanner1.nextInt();

                        SumTarget sumTarg = new SumTarget();
                        sumTarg.thesumtarget(targ,tab7);


                        System.out.println("voulez vous reessayez ? O/N");
                        confirmation = scanner.next().charAt(0);
                    } while (confirmation == 'o');
                    break;
                case 8:
                    do {
                        System.out.println("donner la taille du tableau :");
                        int n8 =scanner1.nextInt();
                        char []tab8= new char[n8];
                        for(int i=0;i<n8;i++){
                            System.out.println("donner le caractere " + (i+1) + ":");
                            tab8[i]=scanner1.next().charAt(0);

                        }


                        CountVowelLetters countVowel = new CountVowelLetters();
                        countVowel.vowel(tab8);
                        System.out.println("voulez vous reessayez ? O/N");
                        confirmation = scanner.next().charAt(0);
                    } while (confirmation == 'o');
                    break;
                case 9:
                    do {
                        System.out.println("PALINDROME");
                        System.out.println("donnez une chaine de caractere :");
                        String chaine =scanner1.nextLine();
                        Palindrome palindrome = new Palindrome();
                        boolean verifi = palindrome.ispalindrome(chaine);
                        System.out.println("is palindrome-->true/ is not palindrome-->false : " + verifi);


                        System.out.println("voulez vous reessayez ? O/N");
                        confirmation = scanner.next().charAt(0);
                    } while (confirmation == 'o');
                    break;
                case 10:
                    do {


                        System.out.println("donnez une chaine de caractere  ex-->hello world:");
                        String chaine =scanner1.nextLine();
                        Reversewords reversewords = new Reversewords();
                        reversewords.reverse(chaine);


                        System.out.println("voulez vous reessayez ? O/N");
                        confirmation = scanner.next().charAt(0);
                    } while (confirmation == 'o');
                    break;
                case 11:
                    do {

                        System.out.println("donner un mot de la forme ex-->hello:");
                        String chaine =scanner1.nextLine();
                        CaseTitle caseTit = new CaseTitle();
                        String word= caseTit.titlecase(chaine);
                        System.out.println("Le Title case est :" + word);

                        System.out.println("voulez vous reessayez ? O/N");
                        confirmation = scanner.next().charAt(0);
                    } while (confirmation == 'o');
                    break;
                case 12:
                    do {

                        System.out.println("Verifier si deux mots sont des anagrammes ex-->ex: chien et niche ");
                        System.out.println("donnez le premier mot :");
                        String chaine1 =scanner1.nextLine();
                        System.out.println("donnez le deuxieme mot :");
                        String chaine2 =scanner1.nextLine();
                        Anagrame anagrame = new Anagrame();
                        boolean anag = anagrame.isanagram(chaine1,chaine2 );
                        System.out.println("if the string is anagramme or not -->true/false :" + anag);
                        System.out.println("voulez vous reessayez ? O/N");
                        confirmation = scanner.next().charAt(0);
                    } while (confirmation == 'o');
                    break;
                case 13:
                    do {

                        System.out.println("donner une chaine ");
                        String chaine =scanner1.nextLine();
                        System.out.println("the first characters is :" );
                        FirstCharacter firstCharac = new FirstCharacter();
                         firstCharac.isfirstcharac(chaine);

                        System.out.println("voulez vous reessayez ? O/N");
                        confirmation = scanner.next().charAt(0);
                    } while (confirmation == 'o');
                    break;
                case 14:
                    do {

                        System.out.println("donner un nombre");
                        int nombre =scanner1.nextInt();
                        Fibonacci fibonacci = new Fibonacci();
                        int fib = fibonacci.isfibonaci(nombre);
                        System.out.println("La fibonacci du nombre est :" + fib);

                        System.out.println("voulez vous reessayez ? O/N");
                        confirmation = scanner.next().charAt(0);
                    } while (confirmation == 'o');
                    break;
                case 15:
                    do {

                        System.out.println("donner un nombre");
                        int nombre =scanner1.nextInt();
                        Factorial factorial = new Factorial();
                        int facto = factorial.isfactorial(nombre);
                        System.out.println("Le factoriel du nombre est :" + facto);


                        System.out.println("voulez vous reessayez ? O/N");
                        confirmation = scanner.next().charAt(0);
                    } while (confirmation == 'o');
                    break;
                case 16:
                    do {

                        System.out.println("Linear Search ");
                        System.out.println("donner la taille du tableau ");
                        int taille = scanner1.nextInt();
                        int [] tab = new  int[taille];
                        for(int i=0;i<taille;i++){
                            System.out.println("Entrez le nombre " + (i+1) + ":");
                            tab[i]=scanner1.nextInt();
                        }
                        System.out.println("Entrez un element du tableau :");
                        int elem =scanner1.nextInt();
                        SearchLinear searchLinear = new SearchLinear();
                        int indice = searchLinear.linesearch(elem,tab);
                        System.out.println("L'indice de l'element " + elem + " est " + indice );

                        System.out.println("voulez vous reessayez ? O/N");
                        confirmation = scanner.next().charAt(0);
                    } while (confirmation == 'o');
                    break;
                case 17:
                    do {



                        System.out.println("donner la taille du tableau :");
                        int taille =scanner1.nextInt();

                        int [] tableau = new int[taille];
                        for(int i=0;i<taille;i++){
                            System.out.println("Entrez le nombre " + (i+1) + ":");
                            tableau[i]=scanner.nextInt();
                        }

                        BasicSorting basicSort = new BasicSorting();
                        basicSort.sortbasic(tableau);

                        System.out.println("voulez vous reessayez ? O/N");
                        confirmation = scanner.next().charAt(0);
                    } while (confirmation == 'o');
                    break;
                case 18:
                    do {
                        FileQueue file = new FileQueue(3);
                        file.AddFileQueue(1);
                        file.AddFileQueue(2);
                        file.AddFileQueue(3);

                        System.out.println(file.DeQueue());
                        System.out.println(file.peek());
                        //file.peek();
                        System.out.println("voulez vous reessayez ? O/N");
                        confirmation = scanner.next().charAt(0);
                    } while (confirmation == 'o');
                    break;
                case 19:
                    do {
                        int[] tab;
                        FileLifo file = new FileLifo(5);
                        file.push(1);
                        file.push(2);
                        file.push(3);
                        file.push(4);
                        file.push(5);


                        file.display();
                        file.peek();

                        file.pop();
                        file.peek();
                        System.out.println("Le file est il vide ?:" + file.Empty());

                        System.out.println("voulez vous reessayez ? O/N");
                        confirmation = scanner.next().charAt(0);
                    } while (confirmation == 'o');
                    break;
                case 20:
                    do {



                        System.out.println("big O Analysis ,Verification de la vitesse  d'un Algo ");
                        System.out.println("donner la taille du tableau --> minimum 20 element :");
                        int size =scanner.nextInt();

                        int [] Array = new int[size];
                        for(int i =0;i<size;i++){
                            System.out.println("Entrer le nombre " +(i+1) + ":");
                            Array[i]=scanner.nextInt();
                        }
                        System.out.println("donne l'Element a rechercher :");
                        int elem =scanner.nextInt();
                        BigOanalysis bigOanal = new BigOanalysis();
                        bigOanal.searchelem(elem,Array);
                        System.out.println("voulez vous reessayez ? O/N");
                        confirmation = scanner.next().charAt(0);
                    } while (confirmation == 'o');
                    break;


            }
            System.out.println("tapez un nombre different de zero pour continuez ou tapez 0 pour quiter le programme");
            enter = scanner.nextInt();
        }while(enter !=0);


    }

}