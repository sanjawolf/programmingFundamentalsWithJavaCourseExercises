import java.util.Scanner;

public class Zadatak_01_04_08_b_c {

    public static int prost(int x){

        for(int i=2; i<=x-1; i++){

            if(x%i==0){

                return 0;

            }


        }


        return 1;

    }

    public static void prosti_brojevi_manji_od_n(int n){

        System.out.print("Prosti manji od n: ");

        if(n==2) System.out.print("ne postoje");

        for(int i=2; i<=n-1; i++){

            int prost=prost(i);

            if(prost==1) System.out.print(i+" ");


        }




    }

    public static void prvih_n_prostih(int n){

        int broj=2;

        int sum=0;

        System.out.print("Prvih n prostih brojeva: ");

        while(true){

            int prost=prost(broj);

            if(prost==1){

                sum+=1;
                System.out.printf("%d ", broj);
                broj++;
            }

            else broj++;

            if(sum==n) break;

        }

        System.out.println();


    }

    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());
//


        if(n<=0) System.out.println("Greska: neispravan unos.");

        else{

            prvih_n_prostih(n);

            prosti_brojevi_manji_od_n(n);

        }
    }
}
