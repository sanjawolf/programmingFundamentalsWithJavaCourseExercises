import java.util.Scanner;

public class Zadatak_01_04_14 {

    public static int ukloni(int n, int p){

        String brojTekst=n+"";

        int l=brojTekst.length();

//        if(n<0){
//
//            for(int i=0; i<=l-1; i++){
//
//                String character=brojTekst.charAt(i)+"";
//
//                if(i==l-p && l>2){
//
//                    brojTekst=brojTekst.replace(character, "");
//                }
//            }
//        }
//
//        else{
//
//            for(int i=0; i<l-1; i++){
//
//                String character=brojTekst.charAt(i)+"";
//
//                if(i==l-p){
//
//                    brojTekst=brojTekst.replace(character, "");
//                }
//            }
//        }

        for(int i=l-1; i>=0; i--){

            String character=brojTekst.charAt(i)+"";

            if(i==l-p || l>2){

                brojTekst=brojTekst.replace(character, "");
            }
        }

        int broj=Integer.parseInt(brojTekst);

        if(l>2 || brojTekst.charAt(0)!='-') return broj;
        else return 0;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite poziciju: ");

        int p=Integer.parseInt(sc.nextLine());

        if(p>0){

            System.out.print("Unesite broj: ");

            int n=Integer.parseInt(sc.nextLine());

            while(n!=0){

                int uklonjen=ukloni(n, p);

                System.out.printf("Novi broj: %d\n", uklonjen);

                System.out.print("Unesite broj: ");

                n=Integer.parseInt(sc.nextLine());


            }

        }

        else System.out.println("Greska: neispravan unos.");


    }
}
