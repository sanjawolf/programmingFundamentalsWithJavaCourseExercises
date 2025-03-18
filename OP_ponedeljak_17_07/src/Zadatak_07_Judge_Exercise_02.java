import java.util.Scanner;

public class Zadatak_07_Judge_Exercise_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts=text.split(" ");

        String part1=parts[0];

        String part2=parts[1];

        int n1=part1.length();

        int n2=part2.length();

        int lessLength;

        if(n1<n2){

            lessLength=n1;
        }

        else{

            lessLength=n2;
        }

        int addition=0;

        for(int i=0; i<lessLength; i++){

            int characterCode1=part1.charAt(i);
            int characterCode2=part2.charAt(i);
            int product=characterCode1*characterCode2;
            addition+=product;
        }

        for(int i=lessLength; i<n1; i++){

            addition+=part1.charAt(i);
        }

        for(int i=lessLength; i<n2; i++){

            addition+=part2.charAt(i);
        }

        System.out.println(addition);
    }
}
