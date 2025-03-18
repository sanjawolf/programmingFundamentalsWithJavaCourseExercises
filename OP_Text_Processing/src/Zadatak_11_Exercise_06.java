import java.util.Scanner;

public class Zadatak_11_Exercise_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        for(int i=0; i<text.length(); i++){

            String character=text.charAt(i)+"";

            String doubleCharacter=String.format("%s%s", character, character);

            while (text.contains(doubleCharacter)){

                text=text.replace(doubleCharacter, character);
            }

        }

        System.out.println(text);
    }
}
