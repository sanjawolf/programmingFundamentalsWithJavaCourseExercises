import java.util.Scanner;

public class Zadatak_08_Exercise_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String path=sc.nextLine();

        String [] parts=path.split("\\\\");

        int n= parts.length;

        String [] partsParts=parts[n-1].split("\\.");

        System.out.printf("File name: %s\n", partsParts[0]);

        System.out.printf("File extension: %s", partsParts[1]);
    }
}
