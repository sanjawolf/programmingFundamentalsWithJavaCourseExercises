import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak_06 {

    public static void enterPaintinAccessionNumbers(ArrayList<Integer> list, String text){

        String [] parts=text.split(" ");

        for(int i=0; i< parts.length; i++){

            list.add(Integer.parseInt(parts[i]));
        }
    }

    public static void Change(ArrayList<Integer> list, int paintingNumber, int givenPaintingNumber){

        if(list.contains(paintingNumber)){

            int index=list.indexOf(paintingNumber);

            list.set(index, givenPaintingNumber);
        }
    }

    public static void Hide(ArrayList<Integer> list, int givenNumber){

        if(list.contains(givenNumber)){

            list.remove(Integer.valueOf(givenNumber));
        }
    }

    public static void Switch(ArrayList<Integer> list, int number1, int number2){

        if(list.contains(number1) && list.contains(number2)){

            int index1=list.indexOf(number1);
            int index2= list.indexOf(number2);

            list.set(index1, number2);
            list.set(index2, number1);
        }
    }

    public static void Insert(ArrayList<Integer> list, int index, int number){

        if(index>=0 && index<list.size()){

            list.add(index+1, number);
        }
    }

    public static void Reverse(ArrayList<Integer> list){

        Collections.reverse(list);

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        ArrayList<Integer> list=new ArrayList<>();

        enterPaintinAccessionNumbers(list, text);

        while(true){

            String command=sc.nextLine();

            String [] commandParts=command.split(" ");

            if(command.equals("END")) break;

            if(commandParts[0].equals("Change")){

                int paintingNumber=Integer.parseInt(commandParts[1]);

                int newPaintingNumber=Integer.parseInt(commandParts[2]);

                Change(list, paintingNumber, newPaintingNumber);
            }

            if(commandParts[0].equals("Hide")){

                int paintingNumber=Integer.parseInt(commandParts[1]);

                Hide(list, paintingNumber);
            }

            if(commandParts[0].equals("Switch")){

                int number1=Integer.parseInt(commandParts[1]);

                int number2=Integer.parseInt(commandParts[2]);

                Switch(list, number1, number2);
            }

            if(commandParts[0].equals("Insert")){

                int index=Integer.parseInt(commandParts[1]);

                int number=Integer.parseInt(commandParts[2]);

                Insert(list, index, number);
            }

            if(commandParts[0].equals("Reverse")){

                Reverse(list);
            }

        }

        for(int el: list) System.out.printf("%d ", el);

    }
}
