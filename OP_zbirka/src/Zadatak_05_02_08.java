import java.util.Scanner;

public class Zadatak_05_02_08 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        int max=Integer.MIN_VALUE;

        int temp=-1;

        for(int i=2; i<n; i++){

            int sum=0;

            for(int j=1; j<=i; j++){

                if(i%j==0) sum+=1;
            }

            if(sum>max){

                temp=i;

                max=sum;
            }
        }

        System.out.printf("Broj %d ima najveći broj delilaca, a to je %d.", temp, max);
    }
}
