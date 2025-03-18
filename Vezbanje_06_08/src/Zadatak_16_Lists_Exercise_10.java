import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_16_Lists_Exercise_10 {

    public static void readList(ArrayList<String> list, String text) {

        String[] parts = text.split(", ");

        for (int i = 0; i < parts.length; i++) {

            list.add(parts[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        ArrayList<String> list = new ArrayList<>();

        readList(list, text);

        while (true) {

            String command = sc.nextLine();

            if (command.equals("course start")) break;

            String[] commandParts = command.split(":");

            String lessonTitle = commandParts[1];

            if (!list.contains(lessonTitle)) {

                if (commandParts[0].equals("Add")) {

                    list.add(lessonTitle);

//                    int counter=1;
//
//                    for (int i = 0; i < list.size(); i++) {
//
//                        System.out.printf("%d.%s\n", counter, list.get(i));
//                        counter++;
//                    }
                }

                if (commandParts[0].equals("Insert")) {

                    int index = Integer.parseInt(commandParts[2]);

                    list.add(index, lessonTitle);

                    int counter = 1;

//                    for (int i = 0; i < list.size(); i++) {
//
//                        System.out.printf("%d.%s\n", counter, list.get(i));
//                        counter++;
//                    }
                }
            } else {

                if (commandParts[0].equals("Remove")) {

                    list.remove(lessonTitle);

                    if (list.contains(lessonTitle + "-Exercise")) list.remove(lessonTitle + "-Exercise");

//                    int counter=1;
//
//                    for (int i = 0; i < list.size(); i++) {
//
//                        System.out.printf("%d.%s\n", counter, list.get(i));
//                        counter++;
//                    }
                }

            }

            if (commandParts[0].equals("Exercise")) {

                int lessonIndex = list.indexOf(lessonTitle);

                if (list.contains(lessonTitle)) {

                    if (!list.contains(lessonTitle + "-Exercise")) {

                        list.add(lessonIndex + 1, lessonTitle + "-Exercise");
                    }
                } else {

                    list.add(lessonTitle);
                    list.add(lessonTitle + "-Exercise");
                }

//                for (int i = 0; i < list.size(); i++) {
//
//                    String element = list.get(i);
//
//                    if (element.equals(lessonTitle)) {
//
//                        list.add(i + 1, lessonTitle + "-Exercise");
//                        break;
//
//                    }
//                }
//
//                if (!list.contains(lessonTitle)) {
//
//                    list.add(lessonTitle);
//                    list.add(lessonTitle + "-Exercise");
//                }

//                int counter=1;
//
//                for (int i = 0; i < list.size(); i++) {
//
//                    System.out.printf("%d.%s\n", counter, list.get(i));
//                    counter++;
//                }
            }

            if (commandParts[0].equals("Swap")) {

                String lessonTitle1 = commandParts[2];

//                for (int i = 0; i < list.size(); i++) {
//
//                    String element1 = list.get(i);
//
//                    if (element1.equals(lessonTitle)) {
//
//                        for (int j = i + 1; j < list.size(); j++) {
//
//                            String element2 = list.get(j);
//
//                            if (element2.equals(lessonTitle1)) {
//
//                                list.set(i, lessonTitle1);
//                                list.set(j, lessonTitle);
//                                break;
//
//                            }
//
//                        }
//
//
//                    }
//
//
//                }

                if (list.contains(lessonTitle) && list.contains(lessonTitle1)) {

                    int lessonIndex = list.indexOf(lessonTitle);
                    int lessonOneIndex = list.indexOf(lessonTitle1);

                    list.set(lessonIndex, lessonTitle1);
                    list.set(lessonOneIndex, lessonTitle);

                    if (list.contains(lessonTitle + "-Exercise")) {

                        list.remove(lessonTitle + "-Exercise");
                        list.add(lessonOneIndex + 1, lessonTitle + "-Exercise");
                    }
//
                    if (list.contains(lessonTitle1 + "-Exercise")) {

                        list.remove(lessonTitle1 + "-Exercise");
                        list.add(lessonIndex + 1, lessonTitle1 + "-Exercise");
                    }


                }

//                int counter=1;
//
//                for (int i = 0; i < list.size(); i++) {
//
//                    System.out.printf("%d.%s\n", counter, list.get(i));
//                    counter++;
//                }
            }


        }


        for (int i = 0; i < list.size(); i++) {

            System.out.printf("%d.%s\n", i + 1, list.get(i));
        }

    }

}

