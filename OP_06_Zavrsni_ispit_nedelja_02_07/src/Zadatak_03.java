import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak_03 {

    public static void readOriginalDeck(ArrayList<String> list){

        Scanner sc=new Scanner(System.in);

        String values=sc.nextLine();

        String [] parts=values.split(":");

        for(int i=0; i<parts.length; i++){

            list.add(parts[i]);

        }

    }

    public static void printDeck(ArrayList<String> newDeck){

        for(String card: newDeck){

            System.out.printf("%s ", card);
        }
    }
    public static void addCard(ArrayList<String> originalDeck, String card, ArrayList<String> newDeck){

        if(originalDeck.contains(card)){

            newDeck.add(card);

        }

        else{

            System.out.println("Card not found.");
        }
    }

    public static void insertCard(ArrayList<String> originalDeck, String card, int index, ArrayList<String> newDeck){

        if(originalDeck.contains(card) && index>=0 && index<newDeck.size()){

            newDeck.add(index, card);

        }

        else{

            System.out.println("Error!");
        }
    }

    public static void removeCard(String card, ArrayList<String> newDeck){

        if(newDeck.contains(card)){

            newDeck.remove(card);

        }

        else{

            System.out.println("Card not found.");
        }
    }

//    public static void swapPositions(ArrayList <String> newDeck, int card1, int card2){
//
//
//    }

    public static void shuffleDeck(ArrayList<String> newDeck){

        Collections.reverse(newDeck);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        ArrayList<String> originalDeck=new ArrayList<>();

        readOriginalDeck(originalDeck);

        while(true){

            String command=sc.nextLine();

            if(command.equals("Ready")){

                break;
            }

            String [] parts=command.split(" ");

            if(parts[0].equals("Add")){

                ArrayList<String> newDeck=new ArrayList<>();

                addCard(originalDeck, parts[1], newDeck);
            }

            if(parts[0].equals("Insert")){

                int index=Integer.parseInt(parts[2]);

                ArrayList<String> newDeck=new ArrayList<>();

                insertCard(originalDeck, parts[1], index, newDeck);
            }

            if(parts[0].equals("Remove")){

                ArrayList<String> newDeck=new ArrayList<>();

                removeCard(parts[1], newDeck);

            }

//            if(parts[0].equals("Swap")){
//
//                int card1=Integer.parseInt(parts[1]);
//                int card2=Integer.parseInt(parts[2]);
//
//                ArrayList<Integer> newDeck=new ArrayList<>();
//
//            }

            if(parts[0].equals("Shuffle")){

                ArrayList<String> newDeck=new ArrayList<>();
                shuffleDeck(newDeck);
            }

        }

        ArrayList<String> newDeck=new ArrayList<>();

        printDeck(newDeck);

    }
}
