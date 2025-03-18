import java.util.Scanner;

public class Zadatak_09_Judge_Lab_09 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        int sum=0;

        for(int i=1; i<2*n; i++){

            if (i%2==1){

                System.out.println(i);
                sum+=i;
            }
        }

        System.out.printf("Sum: %d", sum);
    }
}
