import java.util.Scanner;

public class Zadatak_01_04_25 {

    public static int prestupna(int godina){

        if(godina%4==0) return 1;
        else return 0;

    }

    public static int broj_dana(int mesec, int godina){

        if(mesec==1 || mesec==3 || mesec==5 || mesec==7 || mesec==8 || mesec==10 || mesec==12) return 31;
        else if(mesec==4 || mesec==6 || mesec==9 || mesec==11) return 30;
        else{

            if(prestupna(godina)==1) return 29;
            else return 28;

        }

//        switch(mesec){
//
//            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//                return 31;
//                break;
//
//            case 2:
//                if(godina%4==0) return 29;
//                else return 28;
//                break;
//
//            case 4: case 6: case 9: case 11:
//                return 30;
//                break;
//
//            default:
//        }
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

    public static void sledeci_dan(int dan, int mesec, int godina){

        if(ispravan(dan, mesec, godina)==1){

            if(broj_dana(mesec, godina)==31){

                if(mesec!=12){

                    if(dan==31) System.out.printf("Datum sledeceg dana je: %d.%d.%d.", 1, mesec+1, godina);
                    else System.out.printf("Datum sledeceg dana je: %d.%d.%d.", dan+1, mesec, godina);
                }

                else System.out.printf("Datum sledeceg dana je: %d.%d.%d.", 1, 1, godina+1);
            }

            else if(broj_dana(mesec, godina)==30){

                if(dan==30) System.out.printf("Datum sledeceg dana je: %d.%d.%d.", 1, mesec+1, godina);
                else System.out.printf("Datum sledeceg dana je: %d.%d.%d.", dan+1, mesec, godina);
            }

            else{

                if(broj_dana(mesec, godina)==29){

                    if(dan==29) System.out.printf("Datum sledeceg dana je: %d.%d.%d.", 1, 3, godina);
                    else System.out.printf("Datum sledeceg dana je: %d.%d.%d.", dan+1, mesec, godina);
                }

                else if(broj_dana(mesec, godina)==28){

                    if(dan==28) System.out.printf("Datum sledeceg dana je: %d.%d.%d.", 1, 3, godina);
                    else System.out.printf("Datum sledeceg dana je: %d.%d.%d.", dan+1, mesec, godina);
                }
            }

        }

        else System.out.println("Greska: neispravan unos.");
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite datum: ");

        String datumTekst=sc.nextLine();

        String [] datum=datumTekst.split("\\.");

        int dan=Integer.parseInt(datum[0]);
        int mesec=Integer.parseInt(datum[1]);
        int godina=Integer.parseInt(datum[2]);

        sledeci_dan(dan, mesec, godina);
    }
}
