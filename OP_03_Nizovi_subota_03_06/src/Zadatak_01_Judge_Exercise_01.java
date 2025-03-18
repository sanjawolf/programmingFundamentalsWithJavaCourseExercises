import java.util.Scanner;

public class Zadatak_01_Judge_Exercise_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        int wholeTrain []=new int[n];

        int sum=0;

        for(int i=0; i<n; i++){

            int numberOfPeopleInWagon=Integer.parseInt(sc.nextLine());
            System.out.print(numberOfPeopleInWagon+ " ");
            sum+=numberOfPeopleInWagon;
        }

        System.out.println();
        System.out.println(sum);
    }
}
