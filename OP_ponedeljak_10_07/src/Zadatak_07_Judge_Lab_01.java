import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Zadatak_07_Judge_Lab_01 {

    public static void writeRepeatings(TreeMap<Double, Integer> repeated){

        for(Map.Entry<Double, Integer> entry: repeated.entrySet()){

            double number=entry.getKey();
            int repeatedTimes=entry.getValue();
            System.out.printf("%.0f -> %d\n", number, repeatedTimes);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String textNums=sc.nextLine();

        String [] parts=textNums.split(" ");

        int [] nums= new int[parts.length];

        for(int i=0; i<nums.length; i++){

            nums[i]=Integer.parseInt(parts[i]);
        }

        TreeMap <Double, Integer> numberRepeated=new TreeMap<>();

        for(double broj: nums){

            if(!numberRepeated.containsKey(broj)){

                numberRepeated.put(broj, 1);
            }

            else{

                int currentValue=numberRepeated.get(broj);
                numberRepeated.put(broj, currentValue+1);

            }
        }

        writeRepeatings(numberRepeated);
    }
}
