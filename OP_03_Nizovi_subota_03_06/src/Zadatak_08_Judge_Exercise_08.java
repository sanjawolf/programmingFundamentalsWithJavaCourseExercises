import java.util.Scanner;

public class Zadatak_08_Judge_Exercise_08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String arrayText=sc.nextLine();

        String [] arrayParts=arrayText.split(" ");

        int n=arrayParts.length;

        int array []=new int [n];

        for(int i=0; i<n; i++){

            array[i]=Integer.parseInt(arrayParts[i]);

        }

        int number=Integer.parseInt(sc.nextLine());

        int newArray []=new int[2];

        for(int i=0; i<n; i++){

            for(int j=i+1; j<n; j++){

                if(array[i]+array[j]==number){

                    newArray[0]=array[i];
                    newArray[1]=array[j];

                    System.out.printf("%d %d\n", newArray[0], newArray[1]);

                }



            }


        }




    }

}
