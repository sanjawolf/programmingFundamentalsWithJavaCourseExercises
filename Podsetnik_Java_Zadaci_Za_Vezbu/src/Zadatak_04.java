import java.util.Scanner;

public class Zadatak_04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number=Integer.parseInt(sc.nextLine());

        for(int hunThousands=0; hunThousands<=9; hunThousands++){

            for(int tenThousands=0; tenThousands<=9; tenThousands++){

                for(int thousands=0; thousands<=9; thousands++){

                    for(int hundreads=0; hundreads<=9; hundreads++){

                        for(int tens=0; tens<=9; tens++){

                            for(int ones=0; ones<=9; ones++){

                                if(hunThousands*tenThousands*thousands*hundreads*tens*ones==number){

                                    System.out.printf("%d%d%d%d%d%d ", hunThousands, tenThousands, thousands, hundreads, tens, ones);
                                }
                            }
                        }
                    }


                }
            }

        }
    }
}
