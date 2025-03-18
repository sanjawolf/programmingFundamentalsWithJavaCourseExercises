import java.util.Scanner;

public class Zadatak_17_Arrays_Exercise_07 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts=text.split(" ");

        int [] array=new int[parts.length];

        for(int i=0; i< parts.length; i++){

            array[i]=Integer.parseInt(parts[i]);
        }

        int currentPosition=0;
        int startingPosition=0;

        int currentLength=1;
        int mostLength=1;

        for(int i=1; i<array.length; i++) {

            if (array[i] == array[i - 1]) {

                currentLength++;

                if (currentLength > mostLength) {

                    mostLength = currentLength;
                    startingPosition = currentPosition;
                }

            }

            else {

                    currentPosition = i;
                    currentLength = 1;

            }

        }

        for(int i=startingPosition; i<startingPosition+mostLength; i++) System.out.printf("%d ", array[i]);
    }
}
