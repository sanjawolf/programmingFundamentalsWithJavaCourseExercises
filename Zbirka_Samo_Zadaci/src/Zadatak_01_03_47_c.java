import java.util.Scanner;

public class Zadatak_01_03_47_c {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        for(int i=1; i<=n; i++){

            for(int j=i; j<=n; j++){

                System.out.print(j+" ");
            }

            if(i>1){

                for(int j=1; j<i; j++){

                    System.out.print(j+" ");
                }

                System.out.println();
            }

            else{

                System.out.println();
            }
        }
    }
}
