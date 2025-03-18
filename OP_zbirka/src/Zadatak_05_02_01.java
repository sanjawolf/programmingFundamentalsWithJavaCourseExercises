import java.util.Scanner;

public class Zadatak_05_02_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite godinu u periodu između 1900. i 2099. godine: ");

        int godina = Integer.parseInt(sc.nextLine());

        if (godina > 1900 && godina < 2099){

            int A=godina%4;
            int B=godina%7;
            int C=godina%19;
            int D=(19*C+15)%30;
            int E=(2*A+4*B-D+34)%7;
            int F=D+E+114;

            int mesec=F/31;
            int dan=F%31+1;

            if(godina>=1919){

                switch(mesec){

                    case 4:
                        if(dan<=17) dan=dan+13;
                        else{

                            dan=dan+13-30;
                            mesec=mesec+1;
                        }
                            break;

                    case 3:
                        if(dan<=18) dan=dan+13;
                        else{

                            dan=dan+13-31;
                            mesec=mesec+1;
                        }
                        break;

                    default:

                }

            }

            System.out.printf("Pravoslavni Uskrs u Srbiji %d. godine je bio %d.%d.", godina, dan, mesec);
        }

        else System.out.println("Greska: neispravan unos.");

    }
}
