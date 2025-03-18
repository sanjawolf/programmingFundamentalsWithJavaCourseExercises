import java.util.Scanner;

public class Zadatak_13_Arrays_Exercise_08 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts=text.split(" ");

        int n=parts.length;

        int [] array=new int [n];

        for(int i=0; i<n; i++){

            array[i]=Integer.parseInt(parts[i]);
        }

        int number=Integer.parseInt(sc.nextLine());

        for(int i=0; i<n; i++){

            for(int j=i+1; j<n; j++){

                if (array[i]+array[j]==number) {

                    System.out.printf("%d %d\n", array[i], array[j]);
                }
            }
        }
    }
}
