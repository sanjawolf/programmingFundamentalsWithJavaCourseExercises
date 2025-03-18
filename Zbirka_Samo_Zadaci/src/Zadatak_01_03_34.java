import java.util.Scanner;

public class Zadatak_01_03_34 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<=0){

            System.out.println("Greska: neispravan unos.");
        }

        else{

            int sum=0;

            for(int i=1; i<=n; i++){

                System.out.printf("Unesite %d. karakter: ", i);

                char character=sc.nextLine().charAt(0);

                if(character=='Z' || character=='i' || character=='m' || character=='a') sum+=1;
            }

            if(sum==4) System.out.println("Moze se napisati rec Zima.");
            else System.out.println("Ne moze se napisati rec Zima.");

        }

    }
}
