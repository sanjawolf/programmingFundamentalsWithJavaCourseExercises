import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak_04_Lists_Lab_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        ArrayList<String > products=new ArrayList<>();

        for(int i=1; i<=n; i++){

            String product=sc.nextLine();

            products.add(product);

        }

        Collections.sort(products);

        for(int i=0; i<products.size(); i++){

            System.out.printf("%d.%s\n", i+1, products.get(i));
        }
    }
}
