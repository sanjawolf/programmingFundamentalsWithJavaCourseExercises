import java.util.Scanner;

public class Zadatak_02_Judge_Lab_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String string1=sc.nextLine();

        String string2=sc.nextLine();

        while(true){

            if(!string2.contains(string1)) break;

            string2=string2.replace(string1,"");
        }

        System.out.println(string2);

//        String [] parts=string2.split(string1);
//        String string=String.join("", parts);
//
//        System.out.println(string2);
    }
}
