import java.util.Scanner;

public class Zadatak_08_Judge_Exercise_05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = sc.nextLine();

        String password = "";

        int length=username.length();

        for(int i=length-1; i>=0; i--){

            char character=username.charAt(i);
            password=password+character;
        }

        for(int i=1; i<=4; i++){

            String passwordAttempt=sc.nextLine();

            if(passwordAttempt.equals(password)){

                System.out.printf("User %s logged in.", username);
                return;
            }

            else{

                if(i==4){

                    System.out.printf("User %s blocked!", username);

                }

                else{

                    System.out.println("Incorrect password. Try again.");
                }
            }
        }

                }


            }






