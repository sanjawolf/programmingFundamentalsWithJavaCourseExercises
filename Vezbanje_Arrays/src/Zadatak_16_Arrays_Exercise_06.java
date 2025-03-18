import java.util.Scanner;

public class Zadatak_16_Arrays_Exercise_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts= text.split(" ");

        int n=parts.length;

        int [] array=new int[n];

        for(int i=0; i<n; i++){

            array[i]=Integer.parseInt(parts[i]);
        }

        if(n==1){

            System.out.println(0);
            return;
        }

        for(int i=0; i<n; i++){

            int sumLeft=0;

            int sumRight=0;

            for(int j=0; j<i; j++){

                sumLeft+=array[j];
            }

            for(int j=i+1; j<n; j++){

                sumRight+=array[j];
            }

            if(sumRight==sumLeft){

                System.out.println(i);
                return;
            }


        }

        System.out.println("no");
    }
}
