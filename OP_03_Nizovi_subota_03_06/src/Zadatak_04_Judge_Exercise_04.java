import java.util.Scanner;

public class Zadatak_04_Judge_Exercise_04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String arrayText=sc.nextLine();

        int numberOfRotations=Integer.parseInt(sc.nextLine());

        String arrayParts []=arrayText.split(" ");

        int n=arrayParts.length;

        int array []=new int[n];

        for(int i=0; i<n; i++){

            array[i]=Integer.parseInt(arrayParts[i]);

        }

        numberOfRotations=numberOfRotations%n;

        for(int i=1; i<=numberOfRotations; i++){

            int firstElement=array[0];

            for(int j=0; j<n-1; j++){

                array[j]=array[j+1];

            }

            array[n-1]=firstElement;
        }

        for(int i=0; i<n; i++){

            System.out.printf("%d ", array[i]);
        }

    }
}
