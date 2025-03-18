import java.util.Scanner;

public class Zadatak_08_Arrays_Exercises_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        int [] train=new int[n];
        int sum=0;

        for(int i=0; i<n; i++){

            int number=Integer.parseInt(sc.nextLine());
            train[i]=number;
            sum+=train[i];
        }

        for(int element: train){

            System.out.printf("%d ", element);
        }

        System.out.println();
        System.out.println(sum);


    }
}
