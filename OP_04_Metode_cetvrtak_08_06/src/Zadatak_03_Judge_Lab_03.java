import java.util.Scanner;

public class Zadatak_03_Judge_Lab_03 {

    public static void writeNumbers(int number){

        for (int k = 1 ; k <= number; k++) {

            System.out.printf("%d ", k);
        }
    }

    public static void createTriangle(int number){

        for(int i=1; i<=number; i++) {

            writeNumbers(i);

            System.out.println();

        }



            for(int j=number-1; j>=1; j--){

                writeNumbers(j);

                System.out.println();

            }
        }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number=Integer.parseInt(sc.nextLine());

        createTriangle(number);
    }
}
