import java.util.Scanner;
import java.util.SplittableRandom;

public class Hogwarts_Problem {

    public static String abjuration(String s){

        s=s.toUpperCase();
        return s;
    }

    public static String necromancy(String s){

        s=s.toLowerCase();
        return s;
    }

    public static String illusion(String s, int index, String letter){

        s=s.substring(0, index)+letter+s.substring(index+1);
        return s;
    }

    public static String divination(String s, String firstSubstring, String secondSubstring){

        s=s.replace(firstSubstring, secondSubstring);
        return s;
    }

    public static String alteration(String string, String substring){

        int index=string.indexOf(substring);
        string=string.substring(0, index)+string.substring(index+substring.length());
        return string;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String spell=sc.nextLine();

        while(true){

            String command=sc.nextLine();

            if(command.equals("Abracadabra")) break;

            String [] commandParts=command.split(" ");

            String firstCommand=commandParts[0];

            if(firstCommand.equals("Abjuration")){

                spell=abjuration(spell);
                System.out.println(spell);
            }

            else if(firstCommand.equals("Necromancy")){

                spell=necromancy(spell);
                System.out.println(spell);
            }

            else if(firstCommand.equals("Illusion")){

                int index=Integer.parseInt(commandParts[1]);
                String letter=commandParts[2];

                if(index>=0 && index<=spell.length()){

                    spell=illusion(spell, index, letter);
                    System.out.println("Done!");
                }

                else{

                    System.out.println("The spell was too weak.");
                }
            }

            else if(firstCommand.equals("Divination")){

                String firstSubstring=commandParts[1];

                String secondSubstring=commandParts[2];

                if(spell.contains(firstSubstring)){

                    spell=divination(spell, firstSubstring, secondSubstring);
                    System.out.println(spell);
                }
            }

            else if(firstCommand.equals("Alteration")){

                String substring=commandParts[1];

                if(spell.contains(substring)){

                    spell=alteration(spell, substring);
                    System.out.println(spell);
                }
            }

            else{

                System.out.println("The spell did not work!");
            }
        }
    }
}
