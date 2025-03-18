import java.util.Scanner;

public class Zadatak_01_03_08 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n>0){

            System.out.print("Pravi delioci: ");

            for(int i=2; i<=n-1; i++){

                if(n%i==0){

                    System.out.printf("%d ",i);
                }
            }
        }

        else{

            System.out.println("Greska: neispravan unos.");
        }


    }
}
