import java.util.*;
import java.util.stream.Collectors;

public class Zadatak_04_Judge_Lab_07 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String values=sc.nextLine();

        List<String> items = Arrays.stream(values.split(" "))
        		.collect(Collectors.toList());

        ArrayList<Integer> nums=new ArrayList<>();

        for(int i=0; i<items.size(); i++){

            nums.add(Integer.parseInt(items.get(i)));
        }

        for(int i=0; i<nums.size(); i++){

            if(nums.get(i)<0){

                nums.remove(i);
                i=-1;
            }

        }

        ArrayList<Integer> noNegative=new ArrayList<>();

        if(nums.size()>0){

            for(int i=0; i<nums.size(); i++){

                noNegative.add(nums.get(i));
            }

        }

        else{

            System.out.println("empty");
        }

        Collections.reverse(noNegative);

        for(Integer broj: noNegative){

            System.out.printf("%d ", broj);
        }

    }
}
