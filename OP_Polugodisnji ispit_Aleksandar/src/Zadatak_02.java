import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_02 {

    public static void enterWeaponParts(String text, ArrayList<String> list){

        String [] parts=text.split("\\|");

        for(int i=0; i< parts.length; i++){

            list.add(parts[i]);
        }
    }

    public static void addAtGivenIndex(ArrayList<String> list, int index, String particle){

        if(index>=0 && index<list.size()){

            list.add(index, particle);
        }
    }

    public static void removeAtGivenIndex(ArrayList<String> list, int index){

        if(index>=0 && index<list.size()){

            list.remove(index);
        }
    }

    public static void printEvenIndexPositionsElements(ArrayList<String> list){

        for(int i=0; i<list.size(); i++){

            if(i%2==0){

                System.out.printf("%s ", list.get(i));
            }
        }
    }

    public static void printOddIndexPositionsElements(ArrayList<String> list){

        for(int i=0; i<list.size(); i++){

            if(i%2!=0){

                System.out.printf("%s ", list.get(i));
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        ArrayList<String> list=new ArrayList<>();

        enterWeaponParts(text, list);

        while(true){

            String command=sc.nextLine();

            String [] commandParts=command.split(" ");

            if(command.equals("Done")) break;

            if(commandParts[0].equals("Add")){

                int index=Integer.parseInt(commandParts[2]);

                addAtGivenIndex(list, index, commandParts[1]);
            }

            if(commandParts[0].equals("Remove")){

                int index=Integer.parseInt(commandParts[1]);

                removeAtGivenIndex(list, index);
            }

            if(commandParts[1].equals("Even")){

                printEvenIndexPositionsElements(list);
            }

            if(commandParts[1].equals("=dd")){

                printOddIndexPositionsElements(list);
            }
        }

        String weapon=String.join("", list);

            System.out.printf("You crafted %s!", weapon);


    }
}
