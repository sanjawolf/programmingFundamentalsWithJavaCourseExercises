import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Zadatak_06_Judge_Lab_05 {

    public static void readList(ArrayList<Integer> list){

        Scanner sc=new Scanner(System.in);

        String values=sc.nextLine();

        List<String> items = Arrays.stream(values.split(" "))
        		.collect(Collectors.toList());

        ArrayList<Integer> nums=new ArrayList<>();

        for(int i=0; i<items.size(); i++){

            nums.add(Integer.parseInt(items.get(i)));

        }

    }

    public static void printList(ArrayList<Integer> list){

        for(Integer number: list){

            System.out.printf("%d ", number);
        }
    }

    public static void containsElement(ArrayList<Integer> list, int number){

        if(list.contains(number)){

            System.out.println("Yes");
        }

        else{

            System.out.println("No such number");
        }
    }

    public static void printEven(ArrayList<Integer> list){

        for(int i=0; i<list.size(); i++){

            int element=list.get(i);

            if(element%2==0){

                System.out.printf("%d ", element);
            }
        }


    }

    public static void printOdd(ArrayList<Integer> list){

        for(int i=0; i<list.size(); i++){

            int element=list.get(i);

            if(element%2==1){

                System.out.printf("%d ", element);
            }
        }


    }

    public static void getSum(ArrayList<Integer> list){

        int sum=0;

        for(int i=0; i<list.size(); i++){

            int element=list.get(i);
            sum+=element;
        }

        System.out.println(sum);
    }

    public static void isLess(ArrayList<Integer> list, int number){

        for(int i=0; i< list.size(); i++){

            if(list.get(i)<number){

                System.out.printf("%d ", list.get(i));
            }
        }

    }

    public static void isGreater(ArrayList<Integer> list, int number){

        for(int i=0; i< list.size(); i++){

            if(list.get(i)>number){

                System.out.printf("%d ", list.get(i));
            }
        }

    }

    public static void isLessOrEqual(ArrayList<Integer> list, int number){

        for(int i=0; i< list.size(); i++){

            if(list.get(i)<=number){

                System.out.printf("%d ", list.get(i));
            }
        }

    }

    public static void isGreaterOrEqual(ArrayList<Integer> list, int number){

        for(int i=0; i< list.size(); i++){

            if(list.get(i)>=number){

                System.out.printf("%d ", list.get(i));
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        ArrayList<Integer> list=new ArrayList<>();

        readList(list);

        while(true){

            String command=sc.nextLine();

            if(command.equals("end")) break;

            String [] parts=command.split(" ");
            String element1=parts[0];

            if(element1.equals("Contains")){

                int element2=Integer.parseInt(parts[1]);
                containsElement(list, element2);
            }

            if(element1.equals("Print")){

                if(parts[1].equals("even")){

                    printEven(list);
                }

                else{

                    printOdd(list);
                }
            }

            if(parts.equals("Get sum")){

                getSum(list);
            }

            if(parts[0].equals("Filter")){

                int element3=Integer.parseInt(parts[2]);

                switch(parts[1]){

                    case "<":
                        isLess(list, element3);
                        break;

                    case "<=":
                        isLessOrEqual(list, element3);
                        break;

                    case ">":
                        isGreater(list, element3);
                        break;

                    case ">=":
                        isGreaterOrEqual(list, element3);
                        break;

                    default:
                }
            }

        }

        printList(list);
    }
}
