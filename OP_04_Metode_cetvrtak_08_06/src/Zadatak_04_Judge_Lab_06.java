import java.util.Scanner;

public class Zadatak_04_Judge_Lab_06 {


    public static int theAreaOfRectangle(int height, int width){

        int P=height*width;

        return P;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int height=Integer.parseInt(sc.nextLine());
        int width=Integer.parseInt(sc.nextLine());

        int P=theAreaOfRectangle(height, width);

        System.out.println(P);
    }
}
