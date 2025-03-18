import java.util.Scanner;

public class Zadatak_02_03_30 {

    public static void formiraj(String s1, char c1, char c2){

        StringBuilder s2=new StringBuilder();

        for(int i=0; i<s1.length(); i++){

            char karakter=s1.charAt(i);

            if(karakter==c1){

                s2.append(c1);
                s2.append(c1);
            }

            else if(karakter==c2) s2.append("");

            else s2.append(karakter);
        }

        System.out.print(s2.toString());
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite nisku: ");

        String s=sc.nextLine();

        System.out.print("Unesite prvi karakter: ");

        char c1=sc.nextLine().charAt(0);

        System.out.print("Unesite drugi karakter: ");

        char c2=sc.nextLine().charAt(0);

        if(s.length()<=20){

            System.out.print("Rezultat: ");

            formiraj(s, c1, c2);
        }
    }
}
