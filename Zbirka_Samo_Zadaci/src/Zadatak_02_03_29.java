import java.util.Scanner;

public class Zadatak_02_03_29 {

    public static void sifruj(String rec){

        StringBuilder sifra=new StringBuilder();

        for(int i=0; i<rec.length(); i++){

            char karakter=rec.charAt(i);

            if(karakter>='a' && karakter<'z' || karakter>='A' && karakter<'Z'){

                sifra.append((char)(karakter+1)+"");

                sifra.append((char)(karakter+2)+"");

                sifra.append((char)(karakter+3)+"");

            }

            else if(karakter=='z'){

                sifra.append('a'+"");

                sifra.append((char)('a'+1)+"");

                sifra.append((char)('a'+2)+"");
            }

            else if(karakter=='Z') {

                sifra.append('A'+"");

                sifra.append((char)('A'+1)+"");

                sifra.append((char)('A'+2)+"");
            }

            else sifra.append(karakter+"");
        }

        System.out.print(sifra.toString());
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite nisku s: ");

        String s=sc.nextLine();

        if(s.length()<=20){

            System.out.print("Rezultat: ");

            sifruj(s);
        }
    }
}
