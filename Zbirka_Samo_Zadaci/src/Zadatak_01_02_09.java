import java.util.Scanner;

public class Zadatak_01_02_09 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite karaktere: ");

        String text=sc.nextLine();

        String [] characters=text.split(" ");

        char character1=characters[0].charAt(0);

        char character2=characters[1].charAt(0);

        char character3=characters[2].charAt(0);


        int product;

        if(Character.isDigit(character1) && Character.isDigit(character2) && Character.isDigit(character3)){

            int number1=Integer.parseInt(characters[0]);

            int number2=Integer.parseInt(characters[1]);

            int number3=Integer.parseInt(characters[2]);

            product=number1*number2*number3;

            System.out.printf("Proizvod cifara: %d", product);
        }

        else if (!Character.isDigit(character1) && Character.isDigit(character2) && Character.isDigit(character3)){

            int number2=Integer.parseInt(characters[1]);

            int number3=Integer.parseInt(characters[2]);

            product=number2*number3;

            System.out.printf("Proizvod cifara: %d", product);
        }

        else if (Character.isDigit(character1) && !Character.isDigit(character2) && Character.isDigit(character3)){

            int number1=Integer.parseInt(characters[0]);

            int number3=Integer.parseInt(characters[2]);

            product=number1*number3;

            System.out.printf("Proizvod cifara: %d", product);
        }

        else if (Character.isDigit(character1) && Character.isDigit(character2) && !Character.isDigit(character3)){

            int number2=Integer.parseInt(characters[1]);

            int number1=Integer.parseInt(characters[0]);

            product=number2*number1;

            System.out.printf("Proizvod cifara: %d", product);
        }

        else if (!Character.isDigit(character1) && !Character.isDigit(character2) && Character.isDigit(character3)){

            int number3=Integer.parseInt(characters[2]);

            product=number3;

            System.out.printf("Proizvod cifara: %d", product);
        }

        else if (!Character.isDigit(character1) && Character.isDigit(character2) && !Character.isDigit(character3)){

            int number2=Integer.parseInt(characters[1]);

            product=number2;

            System.out.printf("Proizvod cifara: %d", product);
        }

        else if (Character.isDigit(character1) && !Character.isDigit(character2) && !Character.isDigit(character3)){

            int number1=Integer.parseInt(characters[0]);

            product=number1;

            System.out.printf("Proizvod cifara: %d", product);
        }


        else System.out.println("Medju unetim karakterima nema cifara.");

    }
}
