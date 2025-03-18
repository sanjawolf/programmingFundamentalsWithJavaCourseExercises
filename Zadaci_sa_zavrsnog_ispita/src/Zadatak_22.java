import java.util.Scanner;

public class Zadatak_22 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String skill=sc.nextLine();

        while(true){

            String command=sc.nextLine();

            if(command.equals("For Azeroth")) break;

            String [] parts=command.split(" ");

            String firstPart=parts[0];

            if(firstPart.equals("GladiatorStance")){

                skill=skill.toUpperCase();

                System.out.println(skill);
            }

            else if(firstPart.equals("DefensiveStance")){

                skill=skill.toLowerCase();

                System.out.println(skill);
            }

            else if(firstPart.equals("Dispel")){

                int index= Integer.parseInt(parts[1]);

                String letter=parts[2];

                if(index>=0 && index<skill.length()){

//                    skill=skill.replace(skill.charAt(index)+"", letter);
                    skill = skill.substring(0, index) + letter + skill.substring(index + 1);

                    System.out.println("Success!");
                }

                else{

                    System.out.println("Dispel too weak.");
                }

            }

            else if(firstPart.equals("Target") && parts[1].equals("Change")){

                String firstSubstring=parts[2];

                String secondSubstring=parts[3];

                if(skill.contains(firstSubstring)){

                    skill=skill.replaceAll(firstSubstring, secondSubstring);

                    System.out.println(skill);
                }

                else{

                    System.out.println(skill);
                }
            }

            else if(firstPart.equals("Target") && parts[1].equals("Remove")){

                String substring=parts[2];

                if(skill.contains(substring)){

                    skill=skill.replaceAll(substring, "");

                    System.out.println(skill);
                }
            }

            else{

                System.out.println("Command doesn't exist!");
            }


        }
    }
}
