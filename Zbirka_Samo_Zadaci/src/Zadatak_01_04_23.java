import java.util.Scanner;

public class Zadatak_01_04_23 {

    public static char sifra(char c, int k){

//        if(c>='a' && c<='z' || c>='A' && c<='Z'){

        if((int)c-k>='a') return (char)((int)c-k);
        else if ((int)c-k>='A'){

            if((int)c<='Z')return (char)((int)c-k);
            else return (char)((int)'Z'-(k-(c-'A'+1)));
        }
        else return (char)((int)'z'-(k-(c-'a'+1)));

//        }



    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj k: ");

        int k=Integer.parseInt(sc.nextLine());

        if(k<0) System.out.println("Greska: neispravan unos.");
        else{

            System.out.println("Unesite tekst (CTRL+D za prekid): ");

            String tekst=sc.nextLine();

            for(int i=0; i<tekst.length(); i++){

                char karakter=tekst.charAt(i);

                if(karakter>='a' && karakter<='z' || karakter>='A' && karakter<='Z'){

                    char sifrovan=sifra(karakter, k);

                    System.out.printf("%c", sifrovan);
                } else{

                    System.out.print(karakter);
                }


            }

            System.out.println();
        }

    }
}
