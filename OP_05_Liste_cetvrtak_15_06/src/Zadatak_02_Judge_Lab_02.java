import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Zadatak_02_Judge_Lab_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String values=sc.nextLine();

        List<String> items = Arrays.stream(values.split(" "))
        		.collect(Collectors.toList());

        int n=items.size();

        ArrayList<Integer> nums=new ArrayList<>();

        for(int i=0; i<=n-1;i++){

            nums.add(Integer.parseInt(items.get(i)));
        }

        for(int i=0; i<n/2; i++){

            int first=nums.set(i, nums.get(i)+nums.get(n-i-1));
            nums.remove(n-i-1);

        }

        int [] array=new int[n/2+1];

        if(n%2==1){

            int last=nums.set(n/2, nums.get(n/2));

            for(int i=0; i<=n/2; i++){

                array[i]= nums.get(i);
                System.out.printf("%d ", array[i]);
            }
        }

        else{

            for(int i=0; i<n/2; i++){

                array[i]= nums.get(i);
                System.out.printf("%d ", array[i]);
            }
        }


    }
}
