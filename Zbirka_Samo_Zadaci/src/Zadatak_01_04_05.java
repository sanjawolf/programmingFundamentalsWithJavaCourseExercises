import java.util.Scanner;

public class Zadatak_01_04_05 {

    public static int euklid(int x, int y){

        int r=x%y;

        while(r!=0 && r<y){

            x=y;
            y=r;
            r=x%y;
        }

        if(y>0) return y;

        else return -y;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite dva cela broja: ");

        String text=sc.nextLine();

        String [] numbers=text.split(" ");

        int number1=Integer.parseInt(numbers[0]);

        int number2=Integer.parseInt(numbers[1]);

        int nZD=euklid(number1, number2);

        System.out.printf("Najveci zajednicki delilac: %d", nZD);
    }
}
