import java.util.Scanner;

public class Zadatak_04_Arrays_Lab_04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts=text.split(" ");

        int n=parts.length;

        String [] array=new String[n];

        for(int i=0; i< array.length; i++){

            array[i]=parts[i];
        }

//        for(int i=array.length-1; i>=0; i--){
//
//            S

        for(int i=0; i<n/2; i++){

            String help=array[i];
            array[i]=array[n-i-1];
            array[n-i-1]=help;


        }

                for(int i=0; i<array.length; i++){

            System.out.printf("%s ", array[i]);
        }

    }
}
