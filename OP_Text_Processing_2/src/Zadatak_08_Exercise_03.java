import java.util.Scanner;

public class Zadatak_08_Exercise_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        int hyphen=text.lastIndexOf("\\");
//        System.out.println(substring1);

//        String [] parts=text.split("\\\\");

//        String [] partparts=parts[parts.length-1].split("\\.");

        String substring2=text.substring(hyphen+1, text.lastIndexOf("."));
        String substring3=text.substring(text.lastIndexOf(".")+1);

//        System.out.printf("File name: %s\n", partparts[0]);
//        System.out.printf("File extension: %s", partparts[1]);

        System.out.printf("File name: %s\n", substring2);
        System.out.printf("File extension: %s",substring3);
    }
}
