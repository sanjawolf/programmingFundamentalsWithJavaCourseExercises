import java.util.Scanner;

public class Zadatak_11_Arrays_Exercise_04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts=text.split(" ");

        int [] array=new int[parts.length];

        for(int i=0; i<parts.length; i++){

            array[i]=Integer.parseInt(parts[i]);
        }

        int numberOfRotations=Integer.parseInt(sc.nextLine());

        int n=array.length;

        for(int j=1; j<=numberOfRotations; j++){

            int zeroPosition=array[0];

            for(int i=0; i<n-1; i++){

                array[i]=array[i+1];
            }

            array[n-1]=zeroPosition;
        }

        for(int element: array) System.out.printf("%d ", element);
    }
}
