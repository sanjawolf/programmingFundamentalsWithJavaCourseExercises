import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Zadatak_01_Lab_01 {

    public static void printPairs(TreeMap<Double, Integer> map){

        for(Map.Entry<Double, Integer> entry: map.entrySet()){

            System.out.printf("%.0f -> %d\n", entry.getKey(), entry.getValue());

        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts= text.split(" ");

        ArrayList<Double> nums=new ArrayList<>();

        for(int i=0; i<parts.length; i++){

            nums.add(Double.parseDouble(parts[i]));
        }

        TreeMap<Double, Integer> numbersOfRepeating=new TreeMap<>();

        for(double d: nums){

            if(!numbersOfRepeating.containsKey(d)){

                numbersOfRepeating.put(d, 1);
            }

            else{

                int currentNumberOfRepeating=numbersOfRepeating.get(d);
                numbersOfRepeating.put(d, currentNumberOfRepeating+1);
            }
        }

        printPairs(numbersOfRepeating);
    }
}
