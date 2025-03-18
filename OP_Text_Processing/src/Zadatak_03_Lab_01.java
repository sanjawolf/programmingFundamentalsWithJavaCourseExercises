import java.util.Scanner;

public class Zadatak_03_Lab_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        while(true){

            String text=sc.nextLine();

            if(text.equals("end")) break;

            String reversed="";

            for(int i=text.length()-1; i>=0; i--){

                reversed=reversed.concat(text.charAt(i)+"");
            }

            System.out.printf("%s = %s\n", text, reversed);
        }
    }
}
