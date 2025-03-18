import java.util.Scanner;

public class Zadatak_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double moneyPerSearch=Double.parseDouble(sc.nextLine());
        int numberOfUsers=Integer.parseInt(sc.nextLine());

        double moneyFromSearches=0;

        for(int i=1; i<=numberOfUsers; i++){

            int numberOfSearchesForEachUser=Integer.parseInt(sc.nextLine());

           if(numberOfSearchesForEachUser>5){


               moneyFromSearches*=2;

            }

            if(numberOfSearchesForEachUser==1){

                double moneySearch=0;
                moneyFromSearches+=moneySearch*numberOfSearchesForEachUser;
            }

            if(i==3){

                moneyPerSearch*=3;

                if(numberOfSearchesForEachUser>5){

                    moneyPerSearch*=2;
                    moneyFromSearches+=moneyPerSearch*numberOfSearchesForEachUser;

                }

                else if(numberOfSearchesForEachUser==1){

                    double moneyPer=0;
                    moneyFromSearches+=moneyPer*numberOfSearchesForEachUser;

                }

                else{

                    moneyFromSearches+=moneyPerSearch*numberOfSearchesForEachUser;

                }


            }

            else{

               moneyFromSearches+=moneyPerSearch*numberOfSearchesForEachUser;

           }








        }

        System.out.printf("Total money earned: %.2f.", moneyFromSearches);

    }
}
