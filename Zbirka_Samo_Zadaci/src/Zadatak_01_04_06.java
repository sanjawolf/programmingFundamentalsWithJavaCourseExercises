import java.util.Scanner;

public class Zadatak_01_04_06 {

    public static float zbir_reciprocnih(int n){

        float sum=0;

        for(int i=1; i<=n; i++){

            sum+=1/(float)i;

        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<=0) System.out.println("Greska: neispravan unos.");

        else{

            float zbir=zbir_reciprocnih(n);

            System.out.printf("Zbir reciprocnih: %.2f", zbir);
        }
    }
}
