import java.util.Scanner;

public class Zadatak_02_03_17 {

    public static int heksadekadni_broj(String s){

        char karaker0=s.charAt(0);

        char karaker1=s.charAt(1);

        boolean isHexadecimal=true;

        for(int i=2; i<s.length()-1; i++){

            char karakter=s.charAt(i);

            if((karakter<'0' || karakter>'9') && karakter!='A' && karakter!='B' && karakter!='C' && karakter!='D' && karakter!='E' && karakter!='F' && karakter!='a' && karakter!='b' && karakter!='c' && karakter!='d' && karakter!='e' && karakter!='f'){

                isHexadecimal=false;
                break;
            }


        }

        if(isHexadecimal==true && karaker0=='0' && (karaker1=='x' || karaker1=='X')) return 1;
        else return 0;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite nisku: ");

        String s=sc.nextLine();

        if(s.length()<=7){

            if(heksadekadni_broj(s)==1) System.out.println("Korektan heksadekadni broj.");
            else System.out.println("Nekorektan heksadekadni broj.");
        }
    }
}
