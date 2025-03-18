import java.util.Scanner;

public class Zadatak_01_04_09_b {

    public static float apsolutna_vrednost(float x){

        if(x>=0) return x;
        else return -x;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite jedan realan broj: ");

        float x=Float.parseFloat(sc.nextLine());

        System.out.printf("Apsolutna vrednost: %.2f", apsolutna_vrednost(x));
    }
}
