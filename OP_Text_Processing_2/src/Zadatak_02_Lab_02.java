import java.util.Scanner;

public class Zadatak_02_Lab_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts=text.split(" ");

        String string="";

        for(int i=0; i<parts.length; i++){

            for(int j=1; j<=parts[i].length(); j++){

                string+=parts[i];
            }

        }

        System.out.println(string);
    }
}
