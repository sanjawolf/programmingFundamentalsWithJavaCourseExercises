import java.util.Scanner;

public class Zadatak_09_Methods_Lab_09 {

    public static void getMax(String type, String string1, String string2){

        if(type.equals("int")){

            int num1=Integer.parseInt(string1);
            int num2=Integer.parseInt(string2);

            if(num1>num2) System.out.println(num1);
            else System.out.println(num2);
        }

        if(type.equals("char")){

            char char1=string1.charAt(0);
            char char2=string2.charAt(0);

            if(char1>char2) System.out.println(char1);
            else System.out.println(char2);
        }

        if(type.equals("string")){

            if(string1.compareTo(string2)>=0) System.out.println(string1);
            else System.out.println(string2);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String type=sc.nextLine();

        String string1=sc.nextLine();

        String string2=sc.nextLine();

        getMax(type, string1, string2);

    }
}
