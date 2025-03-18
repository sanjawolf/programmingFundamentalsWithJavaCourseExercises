import java.util.Scanner;

public class Zadatak_01_03_47_a {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        for(int i=1; i<=n; i++){

            for(int j=1; j<=n; j++){

                System.out.print(i*j+" ");
                String number=i*j+"";
                if(number.length()==1) System.out.print(" ");
            }

            System.out.println();
        }
    }
}
