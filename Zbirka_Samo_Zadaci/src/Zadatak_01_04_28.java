import java.util.Scanner;

public class Zadatak_01_04_28 {

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

    public static int od_nove_godine(int dan, int mesec, int godina){

        int brojDana=0;

        for(int i=1; i<mesec; i++){

            if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12) brojDana+=31;
            else if(i==4 || i==6 || i==9 || i==11) brojDana+=30;
            else{

                if(prestupna(godina)==1) brojDana+=29;
                else brojDana+=28;
            }
        }

        brojDana+=(dan-1);

        return brojDana;
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

    public static  int broj_dana_izmedju(int dan1, int mesec1, int godina1, int dan2, int mesec2, int godina2){

        int brojDana=0;

        if(godina1==godina2){

            brojDana+=(broj_dana(mesec1, godina1)-dan1);

            for(int i=mesec1+1; i<=mesec2-1; i++){

                if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12) brojDana+=31;
                else if(i==4 || i==6 || i==9 || i==11) brojDana+=30;
                else{

                    if(prestupna(godina1)==1) brojDana+=29;
                    else brojDana+=28;
                }
            }

            brojDana+=dan2;
        }

        else if(godina1>godina2){

            int tempG=godina1;
            godina1=godina2;
            godina2=tempG;

            int tempM=mesec1;
            mesec1=mesec2;
            mesec2=tempM;

            int tempD=dan1;
            dan1=dan2;
            dan2=tempD;

            brojDana+=do_kraja_godine(dan1, mesec1, godina1);

            for(int i=godina1+1; i<=godina2-1; i++){

                if(prestupna(i)==1) brojDana+=366;
                else brojDana+=365;
            }

            brojDana+=od_nove_godine(dan2, mesec2, godina2);

        }

        else{

            brojDana+=do_kraja_godine(dan1, mesec1, godina1);

            for(int i=godina1+1; i<=godina2-1; i++){

                if(prestupna(i)==1) brojDana+=366;
                else brojDana+=365;
            }

            brojDana+=od_nove_godine(dan2, mesec2, godina2);
        }

        return brojDana;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite prvi datum: ");

        String prviDatumTekst=sc.nextLine();

        String [] datum1=prviDatumTekst.split("\\.");

        int dan1=Integer.parseInt(datum1[0]);
        int mesec1=Integer.parseInt(datum1[1]);
        int godina1=Integer.parseInt(datum1[2]);

        System.out.print("Unesite drugi datum: ");

        String drugiDatumTekst=sc.nextLine();

        String [] datum2=drugiDatumTekst.split("\\.");

        int dan2=Integer.parseInt(datum2[0]);
        int mesec2=Integer.parseInt(datum2[1]);
        int godina2=Integer.parseInt(datum2[2]);

        if(ispravan(dan1, mesec1, godina1)==1 && ispravan(dan2, mesec2, godina2)==1) System.out.printf("Broj dana izmedju dva datuma je: %d", broj_dana_izmedju(dan1, mesec1, godina1, dan2, mesec2, godina2));
        else System.out.println("Greska: neispravan unos.");
    }
}
