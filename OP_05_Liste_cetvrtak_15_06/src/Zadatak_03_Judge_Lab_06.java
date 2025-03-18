import java.util.*;

public class Zadatak_03_Judge_Lab_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());
        ArrayList<String> products=new ArrayList<>();

        for(int i=1; i<=n; i++){

           products.add(sc.nextLine());

        }

        Collections.sort(products);

        for(int i=0; i<=n-1; i++){

            System.out.printf("%d.%s\n", i+1, products.get(i));
        }

    }
}
