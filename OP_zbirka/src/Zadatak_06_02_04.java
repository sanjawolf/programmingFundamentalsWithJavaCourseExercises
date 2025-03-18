import java.util.Scanner;

public class Zadatak_06_02_04 {

    public static int heksVrednost(char karakter){

        switch(karakter){

            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
            default:
                return -1;
        }


    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesi heksadekadni broj: ");

        String num=sc.nextLine();

        int sum=0;

        for(int i=0; i<num.length(); i++){

            char karakter=num.charAt(i);

            if(heksVrednost(karakter)!=-1){

                sum+=heksVrednost(karakter)*Math.pow(16, num.length()-i-1);
            }
            else{

                System.out.println("Greska: heksadekadni broj sadrzi cifru koja nije 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F.");
                return;
            }
        }

        System.out.printf("Dekadna vrednost unetog broja je: %d", sum);
    }
}
