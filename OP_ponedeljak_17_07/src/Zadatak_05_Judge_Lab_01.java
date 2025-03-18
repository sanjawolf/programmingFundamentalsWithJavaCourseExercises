import java.util.Scanner;

public class Zadatak_05_Judge_Lab_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String reversedText="";

        while(true){

            String text=sc.nextLine();

            if(text.equals("end")) break;

            StringBuilder sb=new StringBuilder("");

            for(int i=text.length()-1; i>=0; i--){

                char reversed=text.charAt(i);
                reversedText=sb.append(reversed).toString();
            }


            System.out.printf("%s = %s\n", text, reversedText);
        }
    }
}
