import java.util.Scanner;

public class Zadatak_11_Judge_Exercise_08 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        double max=Double.MIN_VALUE;
        String maxModel="";

        for(int i=1; i<=n; i++){

            String model=sc.nextLine();
            float radius=Float.parseFloat(sc.nextLine());
            int height=Integer.parseInt(sc.nextLine());
            double radiusDouble=radius;

            double volume=Math.PI*Math.pow(radiusDouble, 2)*height;

            if(volume>max){

                max=volume;
                maxModel=model;


            }

        }

        System.out.printf("%s", maxModel);

    }
}
