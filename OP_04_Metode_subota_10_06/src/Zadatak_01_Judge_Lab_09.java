import java.util.Scanner;

public class Zadatak_01_Judge_Lab_09 {

    public static void getMax(String text, int number1, int number2){

        if(number1>number2){

            System.out.println(number1);
        }

        else{

            System.out.println(number2);
        }
    }

    public static void getMax(String text, char char1, char char2){

        if(char1>char2){

            System.out.println(char1);
        }

        else{

            System.out.println(char2);
        }
    }

    public static void getMax(String text, String text1, String text2){

        if(text1.compareTo(text2)>0){

            System.out.println(text1);
        }

        else{

            System.out.println(text2);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        if(text.equals("int")){

            int value1=Integer.parseInt(sc.nextLine());

            int value2=Integer.parseInt(sc.nextLine());

            getMax(text, value1, value2);
        }

        if(text.equals("char")){

            char char1=sc.nextLine().charAt(0);

            char char2=sc.nextLine().charAt(0);

            getMax(text, char1, char2);
        }

        if(text.equals("string")){

            String text1=sc.nextLine();

            String text2=sc.nextLine();

            getMax(text, text1, text2);
        }

    }
}
