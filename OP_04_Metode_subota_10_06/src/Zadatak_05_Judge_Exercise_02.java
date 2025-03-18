import java.util.Scanner;

public class Zadatak_05_Judge_Exercise_02 {
    public static int countTheVowels(String word){

        int counter=0;

        for(int i=0; i<word.length(); i++){

            if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u' || word.charAt(i)=='A' || word.charAt(i)=='E' || word.charAt(i)=='I' || word.charAt(i)=='O' || word.charAt(i)=='U'){

                counter++;
            }
        }
        return counter;
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String word=sc.nextLine();

        System.out.println(countTheVowels(word));

    }
}
