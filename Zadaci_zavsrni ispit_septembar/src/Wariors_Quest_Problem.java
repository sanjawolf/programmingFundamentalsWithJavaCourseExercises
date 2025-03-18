import java.util.Scanner;

public class Wariors_Quest_Problem {

    public static String gladiatorStance(String s){

        s=s.toUpperCase();
        return s;
    }

    public static String defensiveStance(String s){

        s=s.toLowerCase();
        return s;
    }

    public static String dispel(String s, int index, String letter){

        s=s.substring(0, index)+letter+s.substring(index+1);
        return s;
    }

    public static String targetChange(String s, String substring1, String substring2){

        s=s.replace(substring1, substring2);
        return s;
    }

    public static String targetRemove(String s, String substring){

        int index=s.indexOf(substring);

        s=s.substring(0, index)+s.substring(index+substring.length());

        return s;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String skill=sc.nextLine();

        while(true){

            String command=sc.nextLine();

            if(command.equals("For Azeroth")) break;

            String [] commandParts=command.split(" ");

            String firstPart=commandParts[0];

            if(firstPart.equals("GladiatorStance")){

                skill=gladiatorStance(skill);
                System.out.println(skill);
            }

            else if(firstPart.equals("DefensiveStance")){

                skill=defensiveStance(skill);
                System.out.println(skill);
            }

            else if(firstPart.equals("Dispel")){

                int index=Integer.parseInt(commandParts[1]);

                String letter=commandParts[2];

                if(index>=0 && index<skill.length()){

                    skill=dispel(skill, index, letter);
                    System.out.println("Success!");
                }

                else{

                    System.out.println("Dispel too weak.");
                }
            }

            else if(firstPart.equals("Target")){

                String secondPart=commandParts[1];

                if(secondPart.equals("Change")){

                    String firstSubstring=commandParts[2];
                    String secondSubstring=commandParts[3];

                    if(skill.contains(firstSubstring)){

                        skill=targetChange(skill, firstSubstring, secondSubstring);
                        System.out.println(skill);
                    }

                    else{

                        System.out.println(skill);
                    }
                }

                if(secondPart.equals("Remove")){

                    String substring=commandParts[2];

                    if(skill.contains(substring)){

                        skill=targetRemove(skill, substring);
                        System.out.println(skill);
                    }
                }
            }

            else{

                System.out.println("Command doesn't exist!");
            }

        }
    }
}
