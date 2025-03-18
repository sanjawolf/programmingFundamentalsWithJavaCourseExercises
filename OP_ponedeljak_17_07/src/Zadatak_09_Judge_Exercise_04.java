import java.util.Scanner;

public class Zadatak_09_Judge_Exercise_04 {

    public static String encript(char character){

        char encripted=(char)((int) character+3);

        return encripted+"";
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        StringBuilder sb=new StringBuilder();

        for(char character: text.toCharArray()){

            String encriptedCharacter=encript(character);

            sb.append(encriptedCharacter);
        }

        System.out.println(sb);

    }
}
