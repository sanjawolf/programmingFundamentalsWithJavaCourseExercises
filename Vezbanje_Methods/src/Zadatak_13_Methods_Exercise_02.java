import java.util.Scanner;

public class Zadatak_13_Methods_Exercise_02 {

    public static int countVowels(String string){

        int n=string.length();

        int counter=0;

        for(int i=0; i<n; i++){

            char character=string.charAt(i);

            if(character=='a' || character=='e' || character=='i' || character=='o' || character=='u' || character=='A' || character=='E' || character=='I' || character=='O' || character=='U'){

                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String string=sc.nextLine();

        int vowelsNumber=countVowels(string);

        System.out.println(vowelsNumber);
    }
}
