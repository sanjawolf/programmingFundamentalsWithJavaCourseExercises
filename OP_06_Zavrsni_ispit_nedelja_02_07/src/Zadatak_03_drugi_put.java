import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak_03_drugi_put {

    public static void enterList(String text, ArrayList<String> list){

        String [] parts=text.split(":");

        for(int i=0; i< parts.length; i++){

            list.add(parts[i]);
        }
    }

    public static void add(String cardname, ArrayList<String> list1, ArrayList<String> list2) {

        if (list1.contains(cardname)) {

            list2.add(cardname);
        } else {

            System.out.println("Card not found.");
        }

    }

    public static void swap(String card1, String card2, ArrayList<String> list2){

        int index2=list2.indexOf(card2);
        int index1=list2.indexOf(card1);

        String position2=list2.get(index2);
        String position1=list2.get(index1);

        list2.set(index2, position1);
        list2.set(index1, position2);
    }

        public static void insert(String cardname,  ArrayList<String> list1, ArrayList<String> list2, int index){

            if(list1.contains(cardname) && index>=0 && index<list2.size()){

                list2.add(index, cardname);
            }

            else{

                System.out.println("Error!");
            }
    }

    public static void remove(String cardname, ArrayList<String> list2){

        if(list2.contains(cardname)){

            list2.remove(String.valueOf(cardname));
        }

        else{

            System.out.println("Card not found.");
        }
    }

    public static void shuffle(ArrayList<String > list2){

        Collections.reverse(list2);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        ArrayList<String> list1=new ArrayList<>();

        enterList(text, list1);

        ArrayList<String> list2=new ArrayList<>();

        while(true){

            String command=sc.nextLine();

            if(command.equals("Ready")) break;

            String [] commandParts=command.split(" ");

            if(commandParts[0].equals("Add")){

                add(commandParts[1], list1, list2);
            }

            if(commandParts[0].equals("Insert")){

                int index=Integer.parseInt(commandParts[2]);

                insert(commandParts[1], list1, list2, index);
            }

            if(commandParts[0].equals("Remove")){

                remove(commandParts[1], list2);
            }

            if(commandParts[0].equals("Swap")){

                swap(commandParts[1], commandParts[2], list2);
            }

            if(commandParts[0].equals("Shuffle")){

                shuffle(list2);
            }

        }

        for(String element: list2) System.out.printf("%s ", element);
    }
}
