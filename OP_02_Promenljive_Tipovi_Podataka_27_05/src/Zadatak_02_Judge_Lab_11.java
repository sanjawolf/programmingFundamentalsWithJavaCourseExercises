import java.util.Scanner;

public class Zadatak_02_Judge_Lab_11 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Length: ");
        double duzina = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        double shirina = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        double visina = Double.parseDouble(scanner.nextLine());
        double V = (duzina * shirina * visina) / 3;
        System.out.printf("Pyramid Volume: %.2f", V);
    }
}
