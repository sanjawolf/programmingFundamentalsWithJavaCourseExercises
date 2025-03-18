import java.util.Scanner;

public class Zadatak_01_04_10 {

    public static float aritmeticka_sredina(int n){

        String brojTekst=n+"";

        int sum=0;

        for(int i=0; i<brojTekst.length(); i++){

            char karakter=brojTekst.charAt(i);

            if(karakter!='-'){

                int cifra=Integer.parseInt(karakter+"");

                sum+=cifra;
            }


        }

        if(brojTekst.charAt(0)!='-') return (float)sum/brojTekst.length();

        else return (float)sum/(brojTekst.length()-1);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj: ");

        int broj=Integer.parseInt(sc.nextLine());

        System.out.printf("Aritmeticka sredina: %.3f", aritmeticka_sredina(broj));
    }
}
