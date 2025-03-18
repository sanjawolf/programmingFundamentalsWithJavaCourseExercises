import java.util.Scanner;

public class Zadatak_01_03_23 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite brojeve n i d: ");

        String nD=sc.nextLine();

        String [] values=nD.split(" ");

        int n=Integer.parseInt(values[0]);

        int d=Integer.parseInt(values[1]);

        if(n<=1 || d<0){

            System.out.println("Greska: neispravan unos.");
            return;
        }

        else{

            System.out.print("Unesite n brojeva: ");

            String text=sc.nextLine();

            String [] numbers=text.split(" ");

            int [] array=new int[n];

            for(int i=0; i<n; i++){

                array[i]=Integer.parseInt(numbers[i]);
            }

            int sum=0;

            for(int i=0; i<n-1; i++){

                if(Math.abs(array[i+1]-array[i])==d){

                    sum+=1;
                }
            }

            System.out.printf("Broj parova: %d", sum);
        }
    }
}
