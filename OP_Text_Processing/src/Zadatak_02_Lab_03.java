import java.util.Scanner;

public class Zadatak_02_Lab_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String first=sc.nextLine();

        String second=sc.nextLine();

        while(second.contains(first)){

            second=second.replace(first, "");
//            String [] parts=second.split(first);
//            second=String.join("", parts);
        }




        System.out.println(second);



    }
}
