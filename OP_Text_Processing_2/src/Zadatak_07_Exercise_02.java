import java.util.Scanner;

public class Zadatak_07_Exercise_02 {

    public static int sumOfMultipliedCharacters(String part1, String part2){

        int sum=0;

        for(int i=0; i<part1.length(); i++){

            sum+=(int)part1.charAt(i)*(int)part2.charAt(i);

        }

        for(int i=part1.length(); i<part2.length(); i++){

            sum+=(int)part2.charAt(i);

        }

        return sum;


    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts=text.split(" ");

        int n1=parts[0].length();
        int n2=parts[1].length();;

        int sum;

        if(n1>n2){

            sum=sumOfMultipliedCharacters(parts[1], parts[0]);

        }

        else{

            sum=sumOfMultipliedCharacters(parts[0], parts[1]);
        }

        System.out.println(sum);

    }
}
