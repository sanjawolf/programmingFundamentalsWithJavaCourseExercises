import java.util.Scanner;

public class Zadatak_01_03_32 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite tekst: ");

        String text=sc.nextLine();

        int sumV=0;

        int sumM=0;

        int sumB=0;

        int sumC=0;

        int sumD=0;

        for(int i=0; i<text.length(); i++){

            char character=text.charAt(i);

            if(Character.isLowerCase(character)) sumM+=1;

            else if(Character.isUpperCase(character)) sumV+=1;

            else if(Character.isSpaceChar(character)) sumB+=1;

            else if(Character.isDigit(character)){

                sumD+=1;
                sumC+=Integer.parseInt(character+"");
            }
        }

        System.out.printf("Velika slova: %d\n", sumV);
        System.out.printf("Mala slova: %d\n", sumM);
        System.out.printf("Cifre: %d\n", sumD);
        System.out.printf("Beline: %d\n", sumB);
        System.out.printf("Suma cifara: %d\n", sumC);
    }
}
