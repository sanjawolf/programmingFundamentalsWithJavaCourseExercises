import java.util.Scanner;

public class Zadatak_05_Judge_Lab_05 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String arrayText=sc.nextLine();

        String [] arrayParts=arrayText.split(" ");

        int [] array=new int[arrayParts.length];

        for(int i=0; i<array.length; i++){

            array[i]=Integer.parseInt(arrayParts[i]);
        }

        int result=0;

        for(int i=0; i<array.length; i++){

            result=result^array[i];
        }

        System.out.println(result);
    }
}
