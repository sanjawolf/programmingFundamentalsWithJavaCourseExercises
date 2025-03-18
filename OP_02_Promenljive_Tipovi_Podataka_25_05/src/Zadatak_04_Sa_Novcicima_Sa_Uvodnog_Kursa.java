import java.math.BigDecimal;
import java.util.Scanner;

public class Zadatak_04_Sa_Novcicima_Sa_Uvodnog_Kursa {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        BigDecimal kusur=new BigDecimal(sc.nextLine());

        int brojac=0;

        while(kusur.compareTo(new BigDecimal("0"))!=0){

            if(kusur.compareTo(new BigDecimal("2.0"))>=0){

                 kusur=kusur.subtract(new BigDecimal("2.0"));
                 brojac++;

            }

            else if(kusur.compareTo(new BigDecimal("1.0"))>=0){

                kusur=kusur.subtract(new BigDecimal("1.0"));
                brojac++;

            }

            else if(kusur.compareTo(new BigDecimal("0.50"))>=0){

                kusur=kusur.subtract(new BigDecimal("0.50"));
                brojac++;

            }
            else if(kusur.compareTo(new BigDecimal("0.20"))>=0){

                kusur=kusur.subtract(new BigDecimal("0.20"));
                brojac++;

            }

            else if(kusur.compareTo(new BigDecimal("0.10"))>=0){

                kusur=kusur.subtract(new BigDecimal("0.10"));
                brojac++;

            }

            else if(kusur.compareTo(new BigDecimal("0.05"))>=0){

                kusur=kusur.subtract(new BigDecimal("0.05"));
                brojac++;

            }

            else if(kusur.compareTo(new BigDecimal("0.02"))>=0){

                kusur=kusur.subtract(new BigDecimal("0.02"));
                brojac++;

            }

            else{

                kusur=kusur.subtract(new BigDecimal("0.01"));
                brojac++;

            }


        }

        System.out.println(brojac);
    }
}
