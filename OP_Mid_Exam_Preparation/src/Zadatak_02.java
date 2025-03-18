import java.util.Scanner;

public class Zadatak_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int initialHealth=100;
        int initialBitcoins=0;

        String text=sc.nextLine();

        String [] parts=text.split("\\|");

        for(int i=0; i<parts.length; i++){

            String [] commandParts=parts[i].split(" ");

            int number=Integer.parseInt(commandParts[1]);

            if(commandParts[0].equals("potion")){

                int afterCuringHP=initialHealth+number;

                if(afterCuringHP>100){

                    number=100-initialHealth;
                    initialHealth=100;
                }

                else{

                    initialHealth=afterCuringHP;
                }

                System.out.printf("You healed for %d hp.\n", number);
                System.out.printf("Current health: %d hp.\n", initialHealth);
            }

            else if(commandParts[0].equals("chest")){

                initialBitcoins+=number;

                System.out.printf("You found %d bitcoins.\n", number);
            }

            else{

                    initialHealth-=number;

                    if(initialHealth>0){

                        System.out.printf("You slayed %s.\n", commandParts[0]);

                    }

                    else{

                        System.out.printf("You died! Killed by %s.\n", commandParts[0]);
                        System.out.printf("Best room: %d\n", i+1);
                        return;

                    }
            }
        }

        if(initialHealth>0){

            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d\n", initialBitcoins);
            System.out.printf("Health: %d\n", initialHealth);
        }
    }
}
