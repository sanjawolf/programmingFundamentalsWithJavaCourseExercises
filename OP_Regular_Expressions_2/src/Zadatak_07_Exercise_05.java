import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak_07_Exercise_05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String [] parts = text.split("\\s*,\\s*");

        Pattern regex1 = Pattern.compile("[^\\.\\+\\*/\\d-]");

        Pattern regex2 = Pattern.compile("\\-?\\d+\\.?\\d*");

        Pattern regex3 = Pattern.compile("[*\\/]");

        for (String part : parts) {

//            System.out.println(part);

            Matcher matcher1 = regex1.matcher(part);

            int totalDemonHealth = 0;

            while (matcher1.find()) {

                totalDemonHealth += matcher1.group().charAt(0);
            }

            Matcher matcher2 = regex2.matcher(part);

            double baseDamage = 0;

            while (matcher2.find()) {

                baseDamage += Double.parseDouble(matcher2.group());
            }

            Matcher matcher3 = regex3.matcher(part);

            double damage = baseDamage;

            while (matcher3.find()) {

                if (matcher3.group().equals("*")) {

                    damage *= 2;
                }


                if (matcher3.group().equals("/")) {

                    damage /= 2;
                }

            }

            System.out.printf("%s - %d health, %.2f damage\n", part, totalDemonHealth, damage);


        }
    }

}
