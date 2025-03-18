import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_12_Lists_Exercise_04 {

    public static void readList(ArrayList<Integer> list, String text) {

        String[] parts = text.split(" ");

        for (int i = 0; i < parts.length; i++) {

            list.add(Integer.parseInt(parts[i]));
        }
    }

    public static void shiftLeft(ArrayList<Integer> list, int count) {

        for (int i = 1; i <= count; i++) {

            int first = list.get(0);
            list.add(first);
            list.remove(Integer.valueOf(first));
        }
    }

    public static void shiftRight(ArrayList<Integer> list, int count){

        for(int i=1; i<=count; i++){

            int n=list.size()-1;
            int last=list.get(n);
            list.add(0, last);
            list.remove(n+1);

        }
    }

    public static void writeList(ArrayList<Integer> list) {

        for (int element : list) System.out.printf("%d ", element);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        ArrayList<Integer> list = new ArrayList<>();

        readList(list, text);

        while (true) {

            String command = sc.nextLine();

            if (command.equals("End")) break;

            String[] commandParts = command.split(" ");

            if (commandParts[0].equals("Add")) {

                int number = Integer.parseInt(commandParts[1]);
                list.add(number);
            }

            if (commandParts[0].equals("Insert")) {

                int number = Integer.parseInt(commandParts[1]);
                int index = Integer.parseInt(commandParts[2]);

                if (index >= 0 && index <= list.size()) list.add(index, number);
                else System.out.println("Invalid index");

//                writeList(list);
//                System.out.println();
            }

            if (commandParts[0].equals("Remove")) {

                int index = Integer.parseInt(commandParts[1]);

                if (index >= 0 && index <= list.size() - 1) list.remove(index);
                else System.out.println("Invalid index");
            }

            if (commandParts[1].equals("left")) {

                int count = Integer.parseInt(commandParts[2]);
                shiftLeft(list, count);
//                writeList(list);
//                System.out.println();
            } else if (commandParts[1].equals("right")) {

                int count = Integer.parseInt(commandParts[2]);
                shiftRight(list, count);


            }


        }



        writeList(list);
    }
}