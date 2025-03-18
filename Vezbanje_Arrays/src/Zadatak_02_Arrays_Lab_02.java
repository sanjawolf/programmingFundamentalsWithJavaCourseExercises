import java.util.Scanner;

public class Zadatak_02_Arrays_Lab_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        int [] array=new int[n];

        for(int i=1; i<=n; i++){

            int number=Integer.parseInt(sc.nextLine());
            array[i-1]=number;

        }



        for(int i=n; i>=1; i--){

            System.out.printf("%d ", array[i-1]);
        }
    }
}
