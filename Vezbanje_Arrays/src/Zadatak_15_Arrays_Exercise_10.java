import java.util.Scanner;

public class Zadatak_15_Arrays_Exercise_10 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts=text.split(" ");

        while(true){

            String command=sc.nextLine();

            String [] commandParts=command.split(" ");

            int n=commandParts.length;

            if(command.equals("Yohoho!")) break;

            if(commandParts[0].equals("Loot")){


            }
        }
    }
}
