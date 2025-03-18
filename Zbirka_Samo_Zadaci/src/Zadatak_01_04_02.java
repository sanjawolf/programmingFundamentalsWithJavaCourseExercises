import java.util.Scanner;

public class Zadatak_01_04_02 {

    public static float razlomljeni_deo(float x){

        double ceoDeo;

        if(x>0) ceoDeo=Math.floor(x);

        else ceoDeo=Math.ceil(x);

        float razlomljeniDeo=Math.abs(x-(float)ceoDeo);

        return razlomljeniDeo;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj: ");

        float broj=Float.parseFloat(sc.nextLine());

        float razlomljen=razlomljeni_deo(broj);

        System.out.printf("Razlomleni deo: %.6f", razlomljen);



    }
}
