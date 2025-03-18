public class Zadatak_03_02_03 {

    public static void main(String[] args) {

        final double INČ_CM = 2.54;
        double širinaPapira = 21.0;
        double visinaPapira = 29.7;
        System.out.print("Format A4 (210 x 297mm) u inčima: ");
        System.out.printf("%.2f x %.2f\n",
                širinaPapira/INČ_CM, visinaPapira/INČ_CM);
    }
}
