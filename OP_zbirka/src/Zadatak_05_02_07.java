import java.util.Scanner;

public class Zadatak_05_02_07 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite prvi broj: ");

        int num1=Integer.parseInt(sc.nextLine());

        System.out.print("Unesite drugi broj: ");

        int num2=Integer.parseInt(sc.nextLine());

        if(num1>num2 && num2!=0){

            int r=num1%num2;

            int temp=num2;

            int r1;

            while(r!=0){

                r1=r;

                r=temp%r;

                temp=r1;

            }

            int nzd=temp;

            System.out.printf("NZD za brojeve %d i %d je %d.", num1, num2, nzd);
        }


        else if(num1<num2 && num1!=0){

            int r=num2%num1;

            int temp=num1;

            int r1;

            while(r!=0){

                r1=r;

                r=temp%r;

                temp=r1;

            }

            int nzd=temp;

            System.out.printf("NZD za brojeve %d i %d je %d.", num1, num2, nzd);
        }

        else if(num1==0 || num2==0){

            System.out.println("Greska: neispravan unos.");

        }


    }
}
