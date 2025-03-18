import java.util.Scanner;

public class Zadatak_06_Methods_Lab_06 {

    public static int calculateArea(int width, int height){

        return width*height;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int width=Integer.parseInt(sc.nextLine());

        int height=Integer.parseInt(sc.nextLine());

        int rectangleArea=calculateArea(width, height);

        System.out.println(rectangleArea);
    }
}
