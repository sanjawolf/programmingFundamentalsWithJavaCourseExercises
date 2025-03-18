import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_07_Lists_Lab_05 {

    public static void readList(ArrayList<Integer> list, String text){

        String [] parts=text.split(" ");

        for(int i=0; i< parts.length; i++){

            list.add(Integer.parseInt(parts[i]));
        }
    }

    public static void printEven(ArrayList<Integer> list){

        for(int i=0; i< list.size(); i++){

            int element=list.get(i);

            if(element%2==0){

                System.out.printf("%d ", element);
            }
        }

        System.out.println();
    }

    public static void printOdd(ArrayList<Integer> list){

        for(int i=0; i< list.size(); i++){

            int element=list.get(i);

            if(element%2!=0){

                System.out.printf("%d ", element);
            }
        }

        System.out.println();
    }

    public static void getSum(ArrayList<Integer> list){

        int sum=0;

        for(int i=0; i< list.size(); i++){

            int element=list.get(i);

            sum+=element;
        }

        System.out.println(sum);
    }

    public static void listContains(ArrayList<Integer> list, int number){

        if(list.contains(number)){

            System.out.println("Yes");
        }

        else{

            System.out.println("No such number");
        }
    }

    public static void filterList1(ArrayList<Integer> list, int number){

        for(int i=0; i< list.size(); i++){

            int element=list.get(i);

            if(element<number){

                System.out.printf("%d ", element);
            }
        }

        System.out.println();
    }

    public static void filterList2(ArrayList<Integer> list, int number){

        for(int i=0; i< list.size(); i++){

            int element=list.get(i);

            if(element>number){

                System.out.printf("%d ", element);
            }
        }

        System.out.println();
    }

    public static void filterList3(ArrayList<Integer> list, int number){

        for(int i=0; i< list.size(); i++){

            int element=list.get(i);

            if(element<=number){

                System.out.printf("%d ", element);
            }
        }
    }

    public static void filterList4(ArrayList<Integer> list, int number){

        for(int i=0; i< list.size(); i++){

            int element=list.get(i);

            if(element>=number){

                System.out.printf("%d ", element);
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        ArrayList <Integer> list=new ArrayList<>();

        String text=sc.nextLine();

        readList(list, text);

        while(true){

            String command=sc.nextLine();

            if(command.equals("end")){

                break;
            }

            String [] commandParts=command.split(" ");

            if(commandParts[0].equals("Print") && commandParts[1].equals("even")){

                printEven(list);
            }

            if(commandParts[0].equals("Print") && commandParts[1].equals("odd")){

                printOdd(list);
            }

            if(commandParts[0].equals("Get") && commandParts[1].equals("sum")){

                getSum(list);
            }

            if(commandParts[0].equals("Contains")){

                int number1=Integer.parseInt(commandParts[1]);
                listContains(list, number1);
            }

            if(commandParts[0].equals("Filter")){

                String condition=commandParts[1];
                int number2=Integer.parseInt(commandParts[2]);

                switch(condition){

                    case "<":
                        filterList1(list, number2);
                        break;

                    case ">":
                        filterList2(list, number2);
                        break;

                    case "<=":
                        filterList3(list, number2);
                        break;

                    case ">=":
                        filterList4(list, number2);
                        break;

                    default:
                }
            }

        }
    }
}
