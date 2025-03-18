import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_06_Lists_Lab_04 {

    public static void enterList(ArrayList<Integer> list, String text) {

        String[] parts = text.split(" ");

        for (int i = 0; i < parts.length; i++) {

            list.add(Integer.parseInt(parts[i]));
        }

    }

    public static void addNumber(ArrayList<Integer> list, int number){

        list.add(number);
    }

    public static void removeNumber(ArrayList<Integer> list, int number){

        list.remove(Integer.valueOf(number));
    }

    public static void removeAtGivenIndex(ArrayList<Integer> list, int number){

        list.remove(number);
    }

    public static void insertAtGivenIndex(ArrayList<Integer> list, int index, int number){

        list.add(index, number);
    }


    public static void writeList(ArrayList<Integer> list){

        for(int element: list){

            System.out.printf("%d ", element);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        ArrayList<Integer> list=new ArrayList<>();

        String text=sc.nextLine();

        enterList(list, text);

        while(true){

            String command=sc.nextLine();

            if(command.equals("end")) break;

            String [] commandParts=command.split(" ");

            int number=Integer.parseInt(commandParts[1]);

            if(commandParts[0].equals("Add")){

                addNumber(list, number);

            }

            if(commandParts[0].equals("Remove")){

                removeNumber(list, number);
            }

            if(commandParts[0].equals("RemoveAt")){

                removeAtGivenIndex(list, number);
            }

            if(commandParts[0].equals("Insert")){

                int index=Integer.parseInt(commandParts[2]);
                insertAtGivenIndex(list, index, number);
            }
        }


        writeList(list);


    }
}
