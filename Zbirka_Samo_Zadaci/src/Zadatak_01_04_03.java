import java.util.Scanner;

public class Zadatak_01_04_03 {



    public static int zbir_delilaca(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {

                sum += i;
            }

        }

        return sum;



    }



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj k: ");

        int k=Integer.parseInt(sc.nextLine());

        if(k<=0){

            System.out.println("Greška: neispravan unos.");
        }

        else{

            for(int i=1; i<=k; i++){

                int zbir_delilaca_broja_k=zbir_delilaca(i);

                System.out.print(zbir_delilaca_broja_k+" ");
            }


        }




    }



}
