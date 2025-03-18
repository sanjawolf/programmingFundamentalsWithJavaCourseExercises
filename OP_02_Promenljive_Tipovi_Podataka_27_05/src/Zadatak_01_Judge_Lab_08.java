import java.util.Scanner;

public class Zadatak_01_Judge_Lab_08 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String character=sc.nextLine();

        if(character.equals(character.toLowerCase())){

            System.out.println("lower-case");
        }

        else{

            System.out.println("upper-case");
        }
    }
}
