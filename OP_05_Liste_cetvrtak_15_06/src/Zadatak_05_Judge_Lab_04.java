import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Zadatak_05_Judge_Lab_04 {

    public static void addElement(ArrayList<Integer> list, int number){

        list.add(number);
    }

    public static void removeByValue(ArrayList<Integer> list, int number){

        list.remove(Integer.valueOf(number));
    }

    public static void removeByIndex(ArrayList<Integer> list, int number){

        list.remove(number);
    }

    public static void insertElement(ArrayList<Integer> list, int number, int index){

        list.add(index, number);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String values=sc.nextLine();

        List<String> items = Arrays.stream(values.split(" "))
        		.collect(Collectors.toList());

        ArrayList<Integer> nums=new ArrayList<>();

        for(int i=0; i<items.size(); i++){

            nums.add(Integer.parseInt(items.get(i)));
        }

        while(true){

            String command=sc.nextLine();

            if(command.equals("end")){

                break;
            }

            String [] parts=command.split(" ");
            String element1=parts[0];
            int element2=Integer.parseInt(parts[1]);

            switch(element1){

                case "Add":
                    addElement(nums, element2);
                    break;

                case "Remove":
                    removeByValue(nums, element2);
                    break;

                case "RemoveAt":
                    removeByIndex(nums, element2);
                    break;

                case "Insert":
                    int element3=Integer.parseInt(parts[2]);
                    insertElement(nums, element2, element3);
                    break;

                default:
            }
        }

        for(Integer number: nums){

            System.out.printf("%d ", number);
        }

    }
}


