import java.util.Scanner;

public class Zadatak_06_Judge_Exercise_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String arrayText=sc.nextLine();

        String [] arrayParts=arrayText.split(" ");

        int n=arrayParts.length;

        int array[]=new int[n];

        for(int i=0; i<n; i++){

            array[i]=Integer.parseInt(arrayParts[i]);
        }

        if(n==1){

            System.out.println(0);
            return;
        }

        for(int i=0; i<n; i++){

            int sumBefore=0;
            int sumAfter=0;

            for(int j=0; j<i; j++){

                sumBefore+=array[j];

            }

            for(int j=i+1; j<n; j++){

                sumAfter+=array[j];
            }

            if(sumBefore==sumAfter){

                System.out.println(i);
                return;
            }

        }

        System.out.println("no");

    }
}
