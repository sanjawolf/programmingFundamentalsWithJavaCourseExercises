import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_14_Judge_Exercise_03_preko_klasa {

    static class Product{

        private String name;
        private double price;
        private double quantity;

        public Product(String name, double price, double quantity){

            this.name=name;
            this.price=price;
            this.quantity=quantity;
        }

        public double getPrice(){

            return this.price;
        }

        public double getQuantity(){

            return this.quantity;
        }

//        public double countPrice(double price, double quantity){
//
//            return this.price*this.quantity;
//        }

        public void setPrice(double price){

            this.price=price;
        }

        public void setQuantity(double quantity){

            this.quantity=quantity;
        }

//        @Override
//        public String toString() {
//            return String.format("%s -> %.2f", this.name, this.countPrice(this.price, this.quantity));
//        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap<String, Product> prices=new LinkedHashMap<>();

        while(true){

            String productText=sc.nextLine();

            if(productText.equals("buy")) break;

            String [] productParts=productText.split(" ");

            String name=productParts[0];

            double price=Double.parseDouble(productParts[1]);

            double quantity=Double.parseDouble(productParts[2]);

            if(!prices.containsKey(name)){

                prices.put(name, new Product(name, price, quantity));
            }

            else{

                Product product=new Product(name, price, quantity);
                double currentQuantity=prices.get(name).getQuantity();
                prices.put(name, new Product(name, price, quantity+currentQuantity));

            }
        }

        for(Map.Entry<String, Product> entry: prices.entrySet()){

            System.out.printf("%s -> %.2f\n", entry.getKey(), entry.getValue().getPrice()*entry.getValue().getQuantity());
        }
    }
}
