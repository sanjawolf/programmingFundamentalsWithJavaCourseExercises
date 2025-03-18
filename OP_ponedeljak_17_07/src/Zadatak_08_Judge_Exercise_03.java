import java.util.Scanner;

public class Zadatak_08_Judge_Exercise_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String filepath=sc.nextLine();

        int index1=filepath.lastIndexOf("\\");

        int index2=filepath.lastIndexOf(".");

        String filename=filepath.substring(index1+1, index2);

        String extension=filepath.substring(index2+1);

        System.out.printf("File name: %s\n", filename);
        System.out.printf("File extension: %s", extension);

//        String [] parts=filepath.split("\\\\");
//
//        String nameExtension=parts[parts.length-1];
//
//        String [] nameExtensionParts=nameExtension.split("\\.");
//
//        String nameExtensionParts1=nameExtensionParts[0];
//        String nameExtensionParts2=nameExtensionParts[1];
//
//        System.out.printf("File name: %s\n", nameExtensionParts1);
//        System.out.printf("File extension: %s", nameExtensionParts2);


    }
}
