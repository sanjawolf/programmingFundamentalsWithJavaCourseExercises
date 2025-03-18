import java.util.Scanner;

public class Zadatak_05_02_11 {

    /*******************************?????????????????????????****************************/

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesi tekst: ");

        String text=sc.nextLine();

        String [] delovi=text.split("(\"|,|:|\\.|!|\\?|, | |: |\\. |! |\\? )");

        for(String s: delovi) System.out.println(s);
    }
}
