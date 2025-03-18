import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_02 {

    public static void enterBooks(ArrayList<String> list, String text){

        String [] parts=text.split(" \\| ");

        for(int i=0; i< parts.length; i++){

            list.add(parts[i]);
        }
    }

    public static void Join(ArrayList<String> list, String genre){

        if(!list.contains(genre)){

            list.add(genre);
        }
    }

    public static void Drop(ArrayList<String> list, String genre){

        if(list.contains(genre)){

            list.remove(String.valueOf(genre));
        }
    }

    public static void Replace(ArrayList<String> list, String oldGenre, String newGenre){

        if(list.contains(oldGenre) && !list.contains(newGenre)){

            int index=list.indexOf(oldGenre);
            list.set(index, newGenre);
        }
    }

    public static void Prefer(ArrayList<String> list, int index1, int index2){

        if(index1>=0 && index1< list.size() && index2>=0 && index2< list.size()){

           String el1= list.get(index1);
            String el2= list.get(index2);

            list.set(index1, el2);
            list.set(index2, el1);

        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        ArrayList<String > list=new ArrayList<>();

        enterBooks(list, text);

        while(true){

            String command=sc.nextLine();

            String [] commandParts=command.split(" ");

            if(command.equals("Stop!")) break;

            if(commandParts[0].equals("Join")){

                Join(list, commandParts[1]);

//                for(String element: list) System.out.printf("%s ", element);
            }

            if(commandParts[0].equals("Drop")){

                Drop(list, commandParts[1]);

//                for(String element: list) System.out.printf("%s ", element);
            }

            if(commandParts[0].equals("Replace")){

                Replace(list, commandParts[1], commandParts[2]);

//                for(String element: list) System.out.printf("%s ", element);
            }

            if(commandParts[0].equals("Prefer")){

                int index1=Integer.parseInt(commandParts[1]);
                int index2=Integer.parseInt(commandParts[2]);
                Prefer(list, index1, index2);

//                for(String element: list) System.out.printf("%s ", element);
            }


        }

        for(String element: list) System.out.printf("%s ", element);


    }
}
