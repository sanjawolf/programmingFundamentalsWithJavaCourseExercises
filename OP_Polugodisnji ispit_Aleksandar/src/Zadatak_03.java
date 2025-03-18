import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak_03 {

    public static void enterSpices(String text, ArrayList<String> list){

        String [] parts=text.split(", ");

        for(int i=0; i< parts.length; i++){

            list.add(parts[i]);
        }
    }

    public static void AddSpice(ArrayList<String> list, String spice){

        if(!list.contains(spice)){

            list.add(spice);
        }
    }

    public static void Swap(String spice1, String spice2, ArrayList<String> list){

        if(list.contains(spice1) && list.contains(spice2)){

            int index1=list.indexOf(spice1);
            int index2=list.indexOf(spice2);

            list.set(index2, spice1);
            list.set(index1, spice2);
        }
    }

    public static void ThrowAwaySpices(ArrayList<String> list, String spice, int number){

        if(list.contains(spice)){

            int index=list.indexOf(spice);

            for(int i=index+number-1; i>=index; i--){

                list.remove(i);
            }
        }
    }

    public static void Arrange(ArrayList<String> list){

        Collections.sort(list);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        ArrayList<String> list=new ArrayList<>();

        enterSpices(text, list);

        while(true){

            String command=sc.nextLine();

            String [] commandParts=command.split(" ");

            if(command.equals("done")) break;

            if(commandParts[0].equals("AddSpice")){

                AddSpice(list, commandParts[1]);

//                for(String element: list) System.out.printf("%s ", element);
            }

            if(commandParts[0].equals("AddManySpices")){

                int index=Integer.parseInt(commandParts[1]);

                String commandParts2=commandParts[2];

                String [] commandParts2Parts=commandParts2.split("\\|");

                for(int i=commandParts2Parts.length-1; i>=0; i--){

                    list.add(index, commandParts2Parts[i]);
                }

//                for(String element: list) System.out.printf("%s ", element);
            }

            if(commandParts[0].equals("SwapSpices")){

                Swap(commandParts[1], commandParts[2], list);

//                for(String element: list) System.out.printf("%s ", element);
            }

            if(commandParts[0].equals("ThrowAwaySpices")){

                int number=Integer.parseInt(commandParts[2]);

                ThrowAwaySpices(list, commandParts[1], number);

//                for(String element: list) System.out.printf("%s ", element);
            }

            if(commandParts[0].equals("Arrange")){

                Arrange(list);

//                for(String element: list) System.out.printf("%s ", element);
            }

        }

        for(String element: list) System.out.printf("%s ", element);

    }
}
