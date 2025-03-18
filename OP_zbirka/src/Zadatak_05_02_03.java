import java.util.Scanner;

public class Zadatak_05_02_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite godinu u periodu između 1900. i 2099. godine: ");

        int godina = Integer.parseInt(sc.nextLine());

        if (godina > 1900 && godina < 2099) {

            int A = godina % 19;
            int B = godina % 4;
            int C = godina % 7;
            int D = (19 * A + 24) % 30;
            int E = (2 * B + 4 * C + 6 * D + 5) % 7;

            int dan = 22 + D + E;
            int mesec;

            if (godina == 1954 || godina == 1981 || godina == 2049 || godina == 2076) {

                if (dan > 31) {

                    mesec=4;

                    dan = dan - 7;

                    if (dan > 7) mesec = 4;
                    else {

                        mesec = 3;
                        dan = dan - 7 + 31;

                    }

                    System.out.printf("Katolicki Uskrs %d. godine je bio %d.%d.", godina, dan - 31, mesec);
                }

                else {

                    mesec = 3;

                    System.out.printf("Katolicki Uskrs %d. godine je bio %d.%d.", godina, dan, mesec);

                }

            }

            else{

                if(dan>31){

                    System.out.printf("Katolicki Uskrs %d. godine je bio %d.4.", godina, dan-31);
                }

                else System.out.printf("Katolicki Uskrs %d. godine je bio %d.3.", godina, dan);
            }

        }


        else System.out.println("Greska: neispravan unos.");





    }
}
