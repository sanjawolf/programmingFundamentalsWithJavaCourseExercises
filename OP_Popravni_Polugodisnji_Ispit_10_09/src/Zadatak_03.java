import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_03 {

    public static void enterCards(ArrayList<String> list, String text){

        String [] parts=text.split(", ");

        for(int i=0; i< parts.length; i++){

            list.add(parts[i]);
        }

    }

    public static void Add(ArrayList<String> list, String card){

        if(!list.contains(card)){

            list.add(card);
            System.out.println("Card successfully added");
        }

        else{

            System.out.println("Card is already in the deck");
        }
    }

    public static void Remove(ArrayList<String> list, String card){

        if(list.contains(card)){

            list.remove(String.valueOf(card));
            System.out.println("Card successfully removed");
        }

        else{

            System.out.println("Card not found");
        }
    }

    public static void Insert(ArrayList<String> list, int index, String card){

        if(!list.contains(card) && index>=0 && index<list.size()){

            list.add(index, card);
            System.out.println("Card successfully added");
        }

        else if(index<0 || index>=list.size()){

            System.out.println("Index out of range");
        }

        else{

            System.out.println("Card is already added");
        }


    }

    public static void RemoveAt(ArrayList<String> list, int index){


        if(index>=0 && index<list.size()){


            list.remove(index);
            System.out.println("Card successfully removed");
        }

        else{

            System.out.println("Index out of range");
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        ArrayList<String> list=new ArrayList<>();

        enterCards(list, text);

        int n=Integer.parseInt(sc.nextLine());

        for(int i=1; i<=n; i++){

            String command=sc.nextLine();

            String [] commandParts=command.split(", ");

            if(commandParts[0].equals("Add")){

                Add(list, commandParts[1]);
            }

            if(commandParts[0].equals("Remove")){

                Remove(list, commandParts[1]);
            }

            if(commandParts[0].equals("Remove At")){

                int index=Integer.parseInt(commandParts[1]);

                RemoveAt(list, index);
            }

            if(commandParts[0].equals("Insert")){

                int index=Integer.parseInt(commandParts[1]);
                Insert(list, index, commandParts[2]);

            }
        }

        for(int i=0; i<list.size(); i++){

            if(i!= list.size()-1) System.out.printf("%s, ", list.get(i));
            else System.out.printf("%s", list.get(i));
        }


    }
}
