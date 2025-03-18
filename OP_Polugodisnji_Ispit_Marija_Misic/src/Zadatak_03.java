import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak_03 {

    public static void enterWords(ArrayList<String> list, String text){

        String [] parts=text.split(" ");

        for(int i=0; i< parts.length; i++){

            list.add(parts[i]);
        }
    }

    public static void Delete(ArrayList<String> list, int index){

        if((index+1)>=0 && (index+1)<list.size() && list.contains(list.get(index+1))){

            list.remove(index+1);
        }
    }

    public static void Swap(ArrayList<String>list, String word1, String word2){

        int index1=list.indexOf(word1);
        int index2=list.indexOf(word2);

        list.set(index1, word2);
        list.set(index2, word1);
    }

    public static void Put(ArrayList<String> list, String word, int index){

        if((index-1)>=0 && (index-1)<list.size()-1){

            list.add(index-1, word);
        }

        else if(index==list.size()){

            list.set(list.size()-1, word);
        }
    }

    public static void Sort(ArrayList<String> list){

        Collections.reverse(list);
    }

    public static void Replace(ArrayList<String>list, String word1, String word2){

        if(list.contains(word2)){

            int index2=list.indexOf(word2);
            list.set(index2, word1);
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        ArrayList<String > list=new ArrayList<>();

        enterWords(list, text);

        while(true) {

            String command = sc.nextLine();

            String[] commandParts = command.split(" ");

            if (command.equals("Stop")) break;

            if(commandParts[0].equals("Delete")){

                int index=Integer.parseInt(commandParts[1]);

                Delete(list, index);

//                for(String el: list) System.out.printf("%s ", el);
            }

            if(commandParts[0].equals("Swap")){

                Swap(list, commandParts[1], commandParts[2]);

                for(String el: list) System.out.printf("%s ", el);
            }

            if(commandParts[0].equals("Put")){

                int index=Integer.parseInt(commandParts[2]);
                Put(list, commandParts[1], index);

                for(String el: list) System.out.printf("%s ", el);
            }

            if(commandParts[0].equals("Sort")){

                Sort(list);

//                for(String el: list) System.out.printf("%s ", el);
            }

            if(commandParts[0].equals("Replace")){

                Replace(list, commandParts[1], commandParts[2]);

//                for(String el: list) System.out.printf("%s ", el);
            }

        }

        for(String el: list) System.out.printf("%s ", el);
    }
}
