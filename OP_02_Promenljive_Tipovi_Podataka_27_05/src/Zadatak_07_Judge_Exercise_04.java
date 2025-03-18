import java.util.Scanner;

public class Zadatak_07_Judge_Exercise_04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        int sum=0;

        for(int i=1; i<=n; i++){

            char character=sc.nextLine().charAt(0);
            int cast=(int)character;
            sum+=cast;
        }

        System.out.printf("The sum equals: %d", sum);
    }
}
