import java.util.Scanner;

public class Zadatak_01_03_12 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj t: ");

        int t=Integer.parseInt(sc.nextLine());

        if(t>0){

            System.out.println("Unesite transakcije: ");

            String text=sc.nextLine();

            String [] numbers=text.split(" ");

            int sumPos=0;
            int sumNeg=0;

            for(int i=0; i<=t-1; i++){

                int transaction=Integer.parseInt(numbers[i]);

                if(transaction>0) {

                    sumPos += transaction;

                }

                else{

                    sumNeg += transaction;
                }

            }

            System.out.printf("Prihod: %d\n", sumPos);
            System.out.printf("Rashod: %d\n", sumNeg);

            if(sumPos+sumNeg>=0){

                System.out.printf("Zarada: %d", sumPos+sumNeg);
            }

            else{

                System.out.printf("Gubitak: %d", sumPos+sumNeg);
            }

        }

        else if(t<0){

            System.out.println("Greska: neispravan unos.");

        }

        else{

            System.out.println("Nema evidentiranih transakcija.");
        }
    }
}
