import java.util.Scanner;
import java.util.SplittableRandom;

public class Zadatak_16{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String string=sc.nextLine();

        while(true){

            String command=sc.nextLine();

            if(command.equals("Done")) break;

            String [] commandParts=command.split(" ");

            String firstCommand=commandParts[0];

            if(firstCommand.equals("Change")){

                String character=commandParts[1];

                String replacement=commandParts[2];

                for(int i=0; i<string.length(); i++){

                    if(character.equals(string.charAt(i)+"")) string=string.replaceAll(character, replacement);
                }

                System.out.println(string);

            }

            if(firstCommand.equals("Includes")){

                String substring=commandParts[1];

                if(string.contains(substring)){

                    System.out.println("True");
                }

                else{

                    System.out.println("False");
                }
            }

            if(firstCommand.equals("End")){

                String substring=commandParts[1];

                if(string.substring(string.length()-substring.length()).equals(substring)) System.out.println("True");
                else System.out.println("False");
            }

            if(firstCommand.equals("Uppercase")){

                string=string.toUpperCase();

                System.out.println(string);
            }

            if(firstCommand.equals("FindIndex")){

                String character=commandParts[1];

                System.out.println(string.indexOf(character));
            }

            if(firstCommand.equals("Cut")){

                int startIndex= Integer.parseInt(commandParts[1]);

                int count= Integer.parseInt(commandParts[2]);

                string=string.substring(startIndex, startIndex+count);

                System.out.println(string);
            }
        }
    }
}
