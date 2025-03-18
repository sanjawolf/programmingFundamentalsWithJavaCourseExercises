import java.util.Scanner;

public class Zadatak_15_Judge_Exercise_11 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int lostGamesCount=Integer.parseInt(sc.nextLine());
        double headsetPrice=Double.parseDouble(sc.nextLine());
        double mousePrice=Double.parseDouble(sc.nextLine());
        double keyboardPrice=Double.parseDouble(sc.nextLine());
        double displayPrice=Double.parseDouble(sc.nextLine());

        int headset=lostGamesCount/2;
        int mouse=lostGamesCount/3;
        int keyboard=lostGamesCount/6;
        int display=keyboard/2;

        double expenses=headsetPrice*headset+mousePrice*mouse+keyboardPrice*keyboard+displayPrice*display;

        System.out.printf("Rage expenses: %.2f USD.", expenses);

    }
}
