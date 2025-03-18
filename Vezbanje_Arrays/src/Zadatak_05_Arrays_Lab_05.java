import java.util.Scanner;

public class Zadatak_05_Arrays_Lab_05 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts= text.split(" ");

        int n= parts.length;

        int [] array=new int [n];

        for(int i=0; i<n; i++){

            array[i]=Integer.parseInt(parts[i]);
        }

        int sumEven=0;
        int sumOdd=0;

        for(int i=0; i<array.length; i++){

            if(array[i]%2==0){

                sumEven+=array[i];
            }

            else{

                sumOdd+=array[i];
            }
        }

        System.out.printf("%d", sumEven-sumOdd);
    }
}
