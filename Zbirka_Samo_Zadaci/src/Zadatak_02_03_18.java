import java.util.Scanner;

public class Zadatak_02_03_18 {

    public static int dekadna_vrednost(String s){

        int sum=0;

        int cifra=-1;

        for(int i=s.length()-1; i>=2; i--){

            char karakter= s.charAt(i);

            if(karakter=='a' || karakter=='A') cifra=10;
            else if(karakter=='b' || karakter=='B')  cifra=11;
            else if(karakter=='c' || karakter=='C') cifra=12;
            else if(karakter=='d' || karakter=='D')  cifra=13;
            else if(karakter=='e' || karakter=='E')    cifra=14;
            else if(karakter=='f' || karakter=='F')    cifra=15;
            else cifra=Integer.parseInt(karakter+"");

            sum+=cifra*Math.pow(16, s.length()-1-i);
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite nisku: ");

        String s=sc.nextLine();

        if(s.length()<=7){

            System.out.printf("Rezultat: %d", dekadna_vrednost(s));
        }
    }
}
