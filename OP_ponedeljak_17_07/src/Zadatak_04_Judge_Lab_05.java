import java.util.Scanner;

public class Zadatak_04_Judge_Lab_05 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        StringBuilder sbDigits=new StringBuilder("");
        StringBuilder sbLetters=new StringBuilder("");
        StringBuilder sbRemaining=new StringBuilder("");

        for(int i=0; i<text.length(); i++){

            char character= text.charAt(i);

            if(Character.isDigit(character)){

                sbDigits.append(character);
            }

            if(Character.isLetter(character)){

                sbLetters.append(character);
            }

            if(!Character.isLetterOrDigit(character)){

                sbRemaining.append(character);
            }


        }


        System.out.println(sbDigits);
        System.out.println(sbLetters);
        System.out.println(sbRemaining);

    }
}
