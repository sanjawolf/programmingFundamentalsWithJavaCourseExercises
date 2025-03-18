import java.util.Scanner;

public class Zadatak_03_Judge_Exercise_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        int zig[]=new int[n];
        int zag[]=new int[n];

        for(int i=0; i<n; i++){

            String twoElementsArray=sc.nextLine();

            String twoElementsArrayParts []=twoElementsArray.split(" ");

            if(i%2==0){

                zig[i]=Integer.parseInt(twoElementsArrayParts[0]);
                zag[i]=Integer.parseInt(twoElementsArrayParts[1]);

            }

            else{

                zig[i]=Integer.parseInt(twoElementsArrayParts[1]);
                zag[i]=Integer.parseInt(twoElementsArrayParts[0]);
            }

        }

        for(int i=0; i<n; i++){

            System.out.printf("%d ", zig[i]);


        }

        System.out.println();

        for(int i=0; i<n; i++){

            System.out.printf("%d ", zag[i]);

        }

    }
}
