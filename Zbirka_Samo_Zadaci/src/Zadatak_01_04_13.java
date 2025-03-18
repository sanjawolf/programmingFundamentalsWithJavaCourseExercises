import java.util.Scanner;

public class Zadatak_01_04_13 {

    public static int sve_parne_cifre(int x){

        String broj=x+"";

        if(broj.charAt(0)=='-') broj=-x+"";

        for(int i=0; i<broj.length(); i++){

            int cifra=Integer.parseInt(broj.charAt(i)+"");

            if(cifra%2==0) return 1;
        }

        return 0;
    }

    public static int sve_cifre_jednake(int x){

        String broj=x+"";

        if(broj.charAt(0)=='-') broj=-x+"";

        for(int i=0; i<broj.length()-1; i++){

            int cifra1=Integer.parseInt(broj.charAt(i)+"");

            int cifra2=Integer.parseInt(broj.charAt(i+1)+"");

            if(cifra1!=cifra2) return 0;
        }

        return 1;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj: ");

        int broj=Integer.parseInt(sc.nextLine());

        int sveParne=sve_parne_cifre(broj);

        int sveJednake=sve_cifre_jednake(broj);

        if(sveParne==1){

            System.out.println("Sve cifre broja su parne.");
        }

        else{

            System.out.println("Broj sadrzi bar jednu neparnu cifru.");
        }

        if(sveJednake==1){

            System.out.println("Cifre broja su jednake.");

        }

        else{

            System.out.println("Cifre broja nisu jednake.");
        }


    }
}
