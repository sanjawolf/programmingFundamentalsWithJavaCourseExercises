import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_01_03_21_b {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<0){

            System.out.println("Greska: neispravan unos.");
            return;
        }

        else if(n==0){

            System.out.println("Nisu uneti brojevi.");
            return;
        }

        System.out.println("Unesite brojeve:");

        String text=sc.nextLine();

        String [] prices=text.split(" ");

        int max=Integer.MIN_VALUE;

        ArrayList<Integer> maxNumbers=new ArrayList<>();

        for(int i=0; i<=n-1; i++){

            int number=Integer.parseInt(prices[i]);

            if(number==0 && i==0){

                System.out.println("Najvise cifara ima broj 0.");
                return;
            }

            int sum=0;

            int number1=number;

            while(true){

                if(number1%10==0) break;

                sum+=1;

                number1/=10;
            }

            if(sum>max){

                max=sum;
                maxNumbers.clear();
                maxNumbers.add(number);
            }



        }

        for(int number: maxNumbers) System.out.printf("Najvise cifara ima broj %d.", number);
    }
}
