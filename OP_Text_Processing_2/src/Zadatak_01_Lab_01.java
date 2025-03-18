import java.util.Scanner;

public class Zadatak_01_Lab_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        while(true){

            String text=sc.nextLine();

            if(text.equals("end")) break;

            String reverse="";

            for(int i=text.length()-1; i>=0; i--){

                reverse+=text.charAt(i);
            }


            System.out.printf("%s = %s\n", text, reverse);
        }
    }
}
