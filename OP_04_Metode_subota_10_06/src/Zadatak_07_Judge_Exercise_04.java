import java.util.Scanner;

public class Zadatak_07_Judge_Exercise_04 {

    public static boolean isPassword610CharactersLong(String password){

        if(password.length()>=6 && password.length()<=10){

            return true;
        }

        else{

            return false;
        }
    }

    public static boolean doesPasswordConsistsOnlyDigitsLetters(String password) {

        boolean onlyDigitsLetters = true;

        for (int i = 0; i < password.length(); i++) {

            if (!((password.charAt(i) >= 'a' && password.charAt(i) <= 'z')
                    || (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z')
                    || (password.charAt(i) >= '0' && password.charAt(i) <= '9'))) {

                onlyDigitsLetters = false;
                break;
            }

        }

        if (onlyDigitsLetters) {

            return true;
        } else {

            return false;
        }

    }

        public static boolean doesPasswordHasAtLeastTwoDigits (String password){

            int counter = 0;

            for (int i = 0; i < password.length(); i++) {

                if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {

                    counter++;
                }
            }

            if (counter >= 2) {

                return true;
            } else {

                return false;
            }

        }

        public static void main (String[]args){

            Scanner sc = new Scanner(System.in);

            String password= sc.nextLine();

            if (!isPassword610CharactersLong(password)) {

                System.out.println("Password must be between 6 and 10 characters");


            }

            if (!doesPasswordConsistsOnlyDigitsLetters(password)) {

                System.out.println("Password must consist only of letters and digits");


            }

            if (!doesPasswordHasAtLeastTwoDigits(password)) {

                System.out.println("Password must have at least 2 digits");


            }

            if(isPassword610CharactersLong(password) && doesPasswordHasAtLeastTwoDigits(password) && doesPasswordConsistsOnlyDigitsLetters(password))

                System.out.println("Password is valid");

        }

    }