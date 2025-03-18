import java.util.Scanner;

public class Zadatak_11_Judge_Exercise_07 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double sumCoins=0;

        while(true){

            String coinText=sc.nextLine();

            if(coinText.equals("Start")){

                break;
            }

            double coin=Double.parseDouble(coinText);

            if(coin!=0.1 && coin!=0.2 && coin!=0.5 && coin!=1 && coin!=2 ){

                System.out.printf("Cannot accept %.2f\n", coin);
            }

            else{

                sumCoins+=coin;
            }

            }

        double nuts=2.0;
        double water=0.7;
        double crisps=1.5;
        double soda=0.8;
        double coke=1.0;

        double sumProducts=0;

        while(true){

            String product=sc.nextLine();

            if(product.equals("End")){

                break;
            }

            if(!(product.equals("Nuts") || product.equals("Water") || product.equals("Crisps") || product.equals("Soda") || product.equals("Coke"))){

                System.out.println("Invalid product");
            }

            else if(product.equals("Nuts")){

                sumProducts+=nuts;

                if(sumCoins<sumProducts){

                    System.out.println("Sorry, not enough money");
                    sumProducts-=nuts;
                }

                else{


                    System.out.printf("Purchased %s\n", product);
                }



            }

            else if(product.equals("Water")){

                sumProducts+=water;

                if(sumCoins<sumProducts){

                    System.out.println("Sorry, not enough money");
                    sumProducts-=water;
                }

                else{


                    System.out.printf("Purchased %s\n", product);
                }



            }

            else if(product.equals("Crisps")){

                sumProducts+=crisps;

                if(sumCoins<sumProducts){

                    System.out.println("Sorry, not enough money");
                    sumProducts-=crisps;
                }

                else{


                    System.out.printf("Purchased %s\n", product);
                }



            }

            else if(product.equals("Soda")){

                sumProducts+=soda;

                if(sumCoins<sumProducts){

                    System.out.println("Sorry, not enough money");
                    sumProducts-=soda;
                }

                else{


                    System.out.printf("Purchased %s\n", product);
                }



            }

            else{

                sumProducts+=coke;

                if(sumCoins<sumProducts){

                    System.out.println("Sorry, not enough money");
                    sumProducts-=coke;
                }

                else{


                    System.out.printf("Purchased %s\n", product);
                }


            }




        }

        double change=sumCoins-sumProducts;
        System.out.printf("Change: %.2f", change);
    }
}
