import java.util.Scanner;

public class Zadatak_07_Arrays_Lab_07 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();
        String [] parts=text.split(" ");

        int n=parts.length;

        int [] array=new int[n];

        for(int i=0; i<n; i++){

            array[i]=Integer.parseInt(parts[i]);
        }

        while(array.length!=1){

            int [] newArray=new int[array.length-1];

            for(int i=0; i<array.length-1; i++){

                newArray[i]=array[i]+array[i+1];
            }

            array=newArray;


        }

            System.out.println(array[0]);


    }
}
