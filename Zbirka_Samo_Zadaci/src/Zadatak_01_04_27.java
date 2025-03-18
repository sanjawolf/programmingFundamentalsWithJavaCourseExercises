import java.util.Scanner;

public class Zadatak_01_04_27 {

    public static int prestupna(int godina){

        if(godina%4==0) return 1;
        else return 0;

    }

    public static int broj_dana(int mesec, int godina) {

        if (mesec == 1 || mesec == 3 || mesec == 5 || mesec == 7 || mesec == 8 || mesec == 10 || mesec == 12) return 31;
        else if (mesec == 4 || mesec == 6 || mesec == 9 || mesec == 11) return 30;
        else {

            if (prestupna(godina) == 1) return 29;
            else return 28;

        }

    }

    public static int ispravan(int dan, int mesec, int godina){

        if(mesec==1 || mesec==3 || mesec==5 || mesec==7 || mesec==8 || mesec==10 || mesec==12){

            if(dan>=1 && dan<=31) return 1;
            else return 0;
        }
        else if(mesec==4 || mesec==6 || mesec==9 || mesec==11){

            if(dan>=1 && dan<=30) return 1;
            else return 0;
        }
        else{

            if(prestupna(godina)==1){

                if(dan>=1 && dan<=29) return 1;
                return 0;
            }
            else{

                if(dan>=1 && dan<=28) return 1;
                return 0;
            }

        }
    }

    public static int do_kraja_godine(int dan, int mesec, int godina){

        int brojDana=0;

        brojDana+=(broj_dana(mesec, godina)-dan);

        for(int i=mesec+1; i<=12; i++){

            if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12) brojDana+=31;
            else if(i==4 || i==6 || i==9 || i==11) brojDana+=30;
            else{

                if(prestupna(godina)==1) brojDana+=29;
                else brojDana+=28;
            }
        }

        return brojDana;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite datum: ");

        String datumTekst=sc.nextLine();

        String [] datum=datumTekst.split("\\.");

        int dan=Integer.parseInt(datum[0]);
        int mesec=Integer.parseInt(datum[1]);
        int godina=Integer.parseInt(datum[2]);

        if(ispravan(dan, mesec, godina)==1) System.out.printf("Broj dana do Nove godine je: %d", do_kraja_godine(dan, mesec, godina));
        else System.out.println("Greska: neispravan unos.");

    }
}
