import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak_03 {

    public static void enterProducts(ArrayList<String> list, String text){

        String [] parts=text.split("\\|");

        for(int i=0; i<parts.length; i++){

            list.add(parts[i]);
        }
    }

    public static void Important(ArrayList<String> list, String product){

        if(list.contains(product)){

            list.remove(String.valueOf(product));
            list.add(0, product);
        }

        else{

            list.add(0, product);
        }
    }

    public static void Add(ArrayList<String> list, String product){

        if(!list.contains(product)){

            list.add(product);
        }

        else{

            System.out.println("The product is already in the list.");
        }
    }

    public static void Swap(ArrayList<String> list, String product1, String product2){

        if(list.contains(product1) && list.contains(product2)){

            int index1=list.indexOf(product1);
            int index2= list.indexOf(product2);

            list.set(index1, product2);
            list.set(index2, product1);
        }

        else if(!list.contains(product1)){

            System.out.printf("Product %s missing!\n", product1);

        }

        else if(!list.contains(product2)){

            System.out.printf("Product %s missing!\n", product2);
        }
    }

    public static void Remove(ArrayList<String> list, String product){

        if(list.contains(product)){

            list.remove(String.valueOf(product));
        }

        else{

            System.out.printf("Product %s isn't in the list.\n", product);
        }
    }

    public static void Reverse(ArrayList<String> list){

            Collections.reverse(list);

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        ArrayList<String> list=new ArrayList<>();

        enterProducts(list, text);



        while(true){

            String command=sc.nextLine();

            String [] commandParts=command.split("%");

            if(command.equals("Shop!")) break;

            if(commandParts[0].equals("Important")){

                Important(list, commandParts[1]);

//                for(String el: list) System.out.printf("%s ", el);
            }

            if(commandParts[0].equals("Add")){

                Add(list, commandParts[1]);

//                for(String el: list) System.out.printf("%s ", el);
            }

            if(commandParts[0].equals("Swap")){

                Swap(list, commandParts[1], commandParts[2]);

//                for(String el: list) System.out.printf("%s ", el);
            }

            if(commandParts[0].equals("Remove")){

                Remove(list, commandParts[1]);

//                for(String el: list) System.out.printf("%s ", el);
            }

            if(commandParts[0].equals("Reverse")){

                Reverse(list);

//                for(String el: list) System.out.printf("%s ", el);
            }
        }

        for(int i=0; i<list.size(); i++){

            System.out.printf("%d. %s\n", i+1, list.get(i));

        }

    }
}
