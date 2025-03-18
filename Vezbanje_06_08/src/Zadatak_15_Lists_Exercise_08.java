import java.util.Scanner;
import java.util.ArrayList;

public class Zadatak_15_Lists_Exercise_08 {

    public static void readList(ArrayList<String> list, String text) {

        String[] parts = text.split(" ");

        for (int i = 0; i < parts.length; i++) {

            list.add(parts[i]);
        }
    }

    public static void merge(ArrayList<String> list, int startIndex, int endIndex) {

        if (startIndex < 0) startIndex = 0;

        if (endIndex > list.size() - 1) endIndex = list.size() - 1;

        if (startIndex >= 0 && startIndex <= list.size() - 1 && endIndex >= 0 && endIndex <= list.size() - 1) {

            String merged = "";

            for (int i = startIndex; i <= endIndex; i++) {

                String element = list.get(i);

                merged += element;
            }

            for (int i = startIndex; i <= endIndex; i++) {

                list.remove(startIndex);

            }

            list.add(startIndex, merged);
//            System.out.println(list);

        }


    }

    public static String podstring(String string, int startIndex, int endIndex) {

        String result = "";

        for (int i = startIndex; i < endIndex; i++) {

            result = result + string.charAt(i);
        }

        return result;
    }

    public static void divide(ArrayList<String> list, int index, int partitions) {

        String part = list.get(index);
        list.remove(index);
        int partLength = part.length() / partitions;
        int startIndex = 0;

        for (int i = 1; i < partitions; i++) {

            String podstring = podstring(part, startIndex, startIndex + partLength);
            startIndex += partLength;
            list.add(index, podstring);
            index++;
        }

        String theLongestPodstring = podstring(part, startIndex, part.length());

        list.add(index, theLongestPodstring);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        ArrayList<String> list = new ArrayList<>();

        readList(list, text);

        while (true) {

            String command = sc.nextLine();

            if (command.equals("3:1")) break;

            String[] commandParts = command.split(" ");

            if (commandParts[0].equals("merge")) {

                int startIndex = Integer.parseInt(commandParts[1]);
                int endIndex = Integer.parseInt(commandParts[2]);

                merge(list, startIndex, endIndex);
            }

            if (commandParts[0].equals("divide")) {

                int index = Integer.parseInt(commandParts[1]);
                int partitions = Integer.parseInt(commandParts[2]);

                divide(list, index, partitions);

            }

        }

        System.out.println(String.join(" ", list));

    }

}
