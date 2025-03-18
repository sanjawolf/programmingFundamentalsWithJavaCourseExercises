import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Zadatak_01_Judge_Lab_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String values = sc.nextLine();

        List<String> items = Arrays.stream(values.split(" "))
                .collect(Collectors.toList());

        List<Double> nums = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            nums.add(Double.parseDouble(items.get(i)));

        }

        for (int i = 0; i < nums.size() - 1 ;i ++){

            double trenutni = nums.get(i);
            double sledeci = nums.get(i + 1);
            if (trenutni == sledeci){

                nums.set(i, trenutni + sledeci);

                nums.remove(i+1);

                i = i - 2;

                if (i < -1) i = -1;
            }

        }
        DecimalFormat df = new DecimalFormat("#.#");

        for (int j = 0; j < nums.size(); j++){
            String trenutni = df.format(nums.get(j));
            System.out.printf("%s ", trenutni);
        }

    }
}
