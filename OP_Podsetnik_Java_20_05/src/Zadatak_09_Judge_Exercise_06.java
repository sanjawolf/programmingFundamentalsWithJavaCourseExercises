import java.util.Scanner;

public class Zadatak_09_Judge_Exercise_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String number=sc.nextLine();

        int n=number.length();

        int sum=0;

        for(int i=0; i<n; i++){

            char character=number.charAt(i);

            int digit=Integer.parseInt(character+"");

            int factorial=1;

            for(int j=digit; j>=2; j--){

                factorial*=j;

            }

            sum+=factorial;

        }

        int numberInt=Integer.parseInt(number);

        if(sum==numberInt){

            System.out.println("yes");
        }

        else{

            System.out.println("no");
        }
    }
}


