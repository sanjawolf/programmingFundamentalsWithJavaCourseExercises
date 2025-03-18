import java.util.Scanner;

public class Zadatak_05_Judge_Exercise_05 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String arrayText=sc.nextLine();

        String arrayParts []=arrayText.split(" ");

        int n=arrayParts.length;

        int array []=new int[n];

        for(int i=0; i<n; i++){

            array[i]=Integer.parseInt(arrayParts[i]);
        }

        for(int i=0; i<n-1; i++){

            boolean isTop=true;

            for(int j=i+1; j<n; j++){

                if (array[i] <= array[j]){

                   isTop=false;
                   break;
                }
            }

            if(isTop){

                System.out.printf("%d ", array[i]);
            }

        }

        System.out.print(array[n-1]);
    }
}
