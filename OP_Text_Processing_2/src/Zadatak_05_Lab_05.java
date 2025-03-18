import java.util.Scanner;

public class Zadatak_05_Lab_05 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        StringBuilder sb3=new StringBuilder();

        for(int i=0; i<text.length(); i++){

            char character=text.charAt(i);

            if (Character.isDigit(character)) sb1.append(character);
            else if(Character.isLetter(character)) sb2.append(character);
            else sb3.append(character);
        }

        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);
    }
}
