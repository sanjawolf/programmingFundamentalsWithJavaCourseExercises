import java.util.Scanner;

public class Zadatak_01_Judge_Lab_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] parts = text.split(" ");

        for (int i = 0; i < parts.length; i++) {

            int numberOfCharacters = parts[i].length();

            String[] words = new String[numberOfCharacters];

            for (int j = 0; j < numberOfCharacters; j++) {

                words[j] = parts[i];

            }

            String repeated = String.join("", words);
            System.out.print(repeated);
        }

//        String rez = "";
//
//        for (String s : parts) {
//
//            int numberOfCharacters = s.length();
//
//            for (int i = 1; i <= numberOfCharacters; i++) {
//
//                rez = rez.concat(s);
//
//            }
//
//        }
//
//        System.out.println(rez);
    }

}
