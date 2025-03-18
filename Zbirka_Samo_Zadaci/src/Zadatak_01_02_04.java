import java.util.Scanner;

public class Zadatak_01_02_04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite tri cela broja: ");
        int a=Integer.parseInt(sc.nextLine());
        int b=Integer.parseInt(sc.nextLine());
        int c=Integer.parseInt(sc.nextLine());

        if(a>0 && b>0) {

                if(c>0){

                    int zbirPozitivnih=a+b+c;
                    System.out.printf("Zbir pozitivnih: %d", zbirPozitivnih);
                }

                else{

                    int zbirPozitivnih=a+b;
                    System.out.printf("Zbir pozitivnih: %d", zbirPozitivnih);
                }

            }

        if(c>0 && b>0) {

            if(a<0){

                int zbirPozitivnih=c+b;
                System.out.printf("Zbir pozitivnih: %d", zbirPozitivnih);
            }

        }

        if(a>0 && c>0) {

            if(b<0){

                int zbirPozitivnih=a+c;
                System.out.printf("Zbir pozitivnih: %d", zbirPozitivnih);
            }

        }

        if(a<0 && b<0){

            if(c>0){

                int zbirPozitivnih=c;
                System.out.printf("Zbir pozitivnih: %d", zbirPozitivnih);
            }
        }

        if(a<0 && c<0){

            if(b>0){

                int zbirPozitivnih=b;
                System.out.printf("Zbir pozitivnih: %d", zbirPozitivnih);
            }
        }

        if(c<0 && b<0){

            if(a>0){

                int zbirPozitivnih=a;
                System.out.printf("Zbir pozitivnih: %d", zbirPozitivnih);
            }
        }

        if(a<0 && b<0 && c<0) {

                int zbirPozitivnih=0;
                System.out.println("Zbir pozitivnih: "+zbirPozitivnih);


        }

        }
    }

