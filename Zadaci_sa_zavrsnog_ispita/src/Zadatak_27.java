import java.util.Scanner;

public class Zadatak_27 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String spell=sc.nextLine();

        while(true){

            String command=sc.nextLine();

            if(command.equals("Abracadabra")) break;

            String [] parts=command.split(" ");

            String firstCommand=parts[0];

            if(firstCommand.equals("Abjuration")){

                spell=spell.toUpperCase();

                System.out.println(spell);
            }

            else if(firstCommand.equals("Necromancy")){

                spell=spell.toLowerCase();

                System.out.println(spell);
            }

            else if(firstCommand.equals("Illusion")){

                int index= Integer.parseInt(parts[1]);

                String letter=parts[2];

                if(index>=0 && index<spell.length()){

//                    spell=spell.replace(spell.charAt(index)+"", letter);
                    spell = spell.substring(0, index) + letter + spell.substring(index + 1);

                    System.out.println("Done!");

                }

                else{

                    System.out.println("The spell was too weak.");
                }
            }

            else if(firstCommand.equals("Divination")){

                String firstSubstring=parts[1];

                String secondSubstring=parts[2];

                if(spell.contains(firstSubstring)){

                    spell=spell.replaceAll(firstSubstring, secondSubstring);

                    System.out.println(spell);
                }

            }

            else if(firstCommand.equals("Alteration")){

                String substring=parts[1];

                if(spell.contains(substring)){

                    spell=spell.replace(substring, "");

                    System.out.println(spell);
                }

            }

            else{

                System.out.println("The spell did not work!");
            }
        }
    }
}
