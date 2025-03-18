import java.util.Scanner;

public class Zadatak_09_Exercise_04 {

    public static StringBuilder encrypt(String text){

        StringBuilder sb=new StringBuilder();

        for(int i=0; i<text.length(); i++){

            char character=text.charAt(i);

            int code=(int) character + 3;

            sb.append((char) code);
        }

        return sb;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        System.out.println(encrypt(text));
    }
}
