import java.util.Scanner;

public class Zadatak_10_Arrays_Exercise_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        int [] array1=new int[n];
        int [] array2=new int[n];

        for(int i=0; i<n; i++){

            String text=sc.nextLine();

            String [] parts=text.split(" ");

            int part1=Integer.parseInt(parts[0]);
            int part2=Integer.parseInt(parts[1]);

            if(i%2==0){

                array1[i]=part1;
                array2[i]=part2;

            }

            else{

                array2[i]=part1;
                array1[i]=part2;
            }

        }

        for(int element: array1){

            System.out.printf("%d ", element);
        }

        System.out.println();

        for(int element: array2){

            System.out.printf("%d ", element);
        }
    }
}
