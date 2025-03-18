import java.util.Scanner;

public class Zadatak_02_03_27 {

    public static void rotiraj(String s, int k){

        char [] sca=s.toCharArray();

        for(int i=0; i<=s.length()-1-k%s.length(); i++){

            sca[i]=s.charAt(k%s.length()+i);
        }

        for(int i=0; i<k%s.length(); i++){

            sca[s.length()-k%s.length()+i]=s.charAt(i);
        }

        for(char c: sca) System.out.printf("%c", c);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite nisku i broj k: ");

        String sn=sc.nextLine();

        String [] snParts= sn.split(" ");

        String s=snParts[0];

        int k=Integer.parseInt(snParts[1]);

        if(s.length()<=20 && k>=0){

            System.out.print("Rezultat: ");

            rotiraj(s, k);
        }

        else System.out.println("Greska: neispravan unos.");

    }
}
