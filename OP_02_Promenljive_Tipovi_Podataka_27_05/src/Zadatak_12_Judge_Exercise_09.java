import java.util.Scanner;

public class Zadatak_12_Judge_Exercise_09 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int startingYield=Integer.parseInt(sc.nextLine());

        int counter=0;
        int currentYield=0;

        while(startingYield>=100){

            counter++;

            currentYield+=startingYield;

            if(currentYield>=26){

                currentYield-=26;
            }

            startingYield-=10;

        }

        if(currentYield>=26){

            currentYield-=26;
        }

        System.out.println(counter);
        System.out.println(currentYield);


    }
}
