import java.util.Scanner;

public class Zadatak_12_Arrays_Exercise_05 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts=text.split(" ");

        int n=parts.length;

        int [] array=new int [n];

        for(int i=0; i<n; i++){

            array[i]=Integer.parseInt(parts[i]);
        }



        for(int i=0; i<n; i++){

            boolean isTopInteger=true;

            for(int j=i+1; j<n; j++){

                if(array[i]<=array[j]){

                    isTopInteger=false;
                    break;
                }
            }

            if(isTopInteger){

                System.out.printf("%d ", array[i]);
            }



        }


    }
}
