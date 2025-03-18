import java.util.Scanner;

public class Zadatak_07_Judge_Exercise_07 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String arrayText=sc.nextLine();

        String [] arrayParts=arrayText.split(" ");

        int n=arrayParts.length;

        int [] array=new int[n];

        for(int i=0; i<n; i++){

            array[i]=Integer.parseInt(arrayParts[i]);
        }

        int currentPosition=0;
        int startingPosition=0;

        int currentLength=1;
        int theLongestLength=1;

        for(int i=1; i<n; i++){

            if(array[i]==array[i-1]){

                currentLength++;

                if(currentLength>theLongestLength){

                    theLongestLength=currentLength;
                    startingPosition=currentPosition;

                }
            }

            else{

                currentPosition=i;
                currentLength=1;
            }
        }

        for(int i=startingPosition; i<startingPosition+theLongestLength; i++){

            System.out.printf("%d ", array[i]);
        }


    }
}
