import java.util.Scanner;

public class Zadatak_10_Judge_Exercise_07 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        short sum=0;

        for(int i=1; i<=n; i++){

            short quantityOfWater=Short.parseShort(sc.nextLine());

            sum+=quantityOfWater;

            if(sum>255){

                System.out.println("Insufficient capacity!");
                sum-=quantityOfWater;
            }

        }

        System.out.println(sum);
    }
}
