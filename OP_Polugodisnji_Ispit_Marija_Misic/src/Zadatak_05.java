import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_05 {

    public static void enterTargets(ArrayList<Integer> list, String text){

        String [] parts=text.split("\\|");

        for(int i=0; i< parts.length; i++){

            list.add(Integer.parseInt(parts[i]));
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        ArrayList<Integer> list=new ArrayList<>();

        enterTargets(list, text);

        while(true){

            String command=sc.nextLine();

            String [] commandParts=command.split("@");

            if(command.equals("Game over")) break;

            if(commandParts[0].equals("Shoot Left")){


            }
        }
    }
}
