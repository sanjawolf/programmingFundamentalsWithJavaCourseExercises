import java.util.Scanner;

public class Zadatak_03_Arrays_Lab_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts= text.split(" ");

        int n= parts.length;

        int [] array=new int[n];

        for(int i=0; i<n; i++){

            array[i]=Integer.parseInt(parts[i]);
        }

        int sum=0;

        for(int i=0; i<n; i++){

            if(array[i]%2==0) sum+=array[i];
        }

        System.out.println(sum);
    }
}
