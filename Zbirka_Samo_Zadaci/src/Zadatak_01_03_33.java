import java.util.Scanner;

public class Zadatak_01_03_33 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<=0){

            System.out.println("Greska: neispravan unos.");
        }

        else{

            System.out.print("Unesite n karaktera: ");

            String text=sc.nextLine();

            int sumA=0;

            int sumE=0;

            int sumI=0;

            int sumO=0;

            int sumU=0;

            for(int i=0; i<text.length(); i++){

                char character=text.charAt(i);

                if(character=='a' || character=='A') sumA+=1;

                else if(character=='e' || character=='E') sumE+=1;

                else if(character=='i' || character=='I') sumI+=1;

                else if(character=='o' || character=='O') sumO+=1;

                else if(character=='u' || character=='U') sumU+=1;
            }

            System.out.printf("Samoglasnik a: %d\n", sumA);
            System.out.printf("Samoglasnik e: %d\n", sumE);
            System.out.printf("Samoglasnik i: %d\n", sumI);
            System.out.printf("Samoglasnik o: %d\n", sumO);
            System.out.printf("Samoglasnik u: %d", sumU);
        }

    }
}
