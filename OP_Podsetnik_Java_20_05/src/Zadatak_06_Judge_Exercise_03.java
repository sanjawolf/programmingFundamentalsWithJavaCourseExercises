import java.util.Scanner;

public class Zadatak_06_Judge_Exercise_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int numberOfPeopleInGroup=Integer.parseInt(sc.nextLine());

        String typeOfGroup=sc.nextLine();

        String dayOfWeek=sc.nextLine();

        double pricePerPerson=-1;
        double totalPrice=-1;

        switch(typeOfGroup){

            case "Students":

                switch(dayOfWeek){

                    case "Friday":

                        if(numberOfPeopleInGroup>=30){

                        pricePerPerson=8.45;
                        totalPrice=pricePerPerson*numberOfPeopleInGroup*0.85;
                        System.out.printf("Total price: %.2f", totalPrice);

                    }
                        else{

                        pricePerPerson=8.45;
                        totalPrice=pricePerPerson*numberOfPeopleInGroup;
                        System.out.printf("Total price: %.2f", totalPrice);

                    }

                    break;

                    case "Saturday":

                        if(numberOfPeopleInGroup>=30){

                        pricePerPerson=9.80;
                        totalPrice=pricePerPerson*numberOfPeopleInGroup*0.85;
                        System.out.printf("Total price: %.2f", totalPrice);

                    }

                        else{

                        pricePerPerson=9.80;
                        totalPrice=pricePerPerson*numberOfPeopleInGroup;
                        System.out.printf("Total price: %.2f", totalPrice);

                    }

                    break;

                        case "Sunday":

                            if(numberOfPeopleInGroup>=30){

                        pricePerPerson=10.46;
                        totalPrice=pricePerPerson*numberOfPeopleInGroup*0.85;
                        System.out.printf("Total price: %.2f", totalPrice);

                    }

                            else{

                        pricePerPerson=10.46;
                        totalPrice=pricePerPerson*numberOfPeopleInGroup;
                        System.out.printf("Total price: %.2f", totalPrice);

                    }

                    break;

                    default:

                }

                break;

            case "Business":

                switch(dayOfWeek){

                    case "Friday":

                        if(numberOfPeopleInGroup>=100){

                            pricePerPerson=10.90;
                            totalPrice=pricePerPerson*numberOfPeopleInGroup-10*pricePerPerson;
                            System.out.printf("Total price: %.2f", totalPrice);

                        }

                        else{

                            pricePerPerson=10.90;
                            totalPrice=pricePerPerson*numberOfPeopleInGroup;
                            System.out.printf("Total price: %.2f", totalPrice);

                        }

                        break;

                    case "Saturday":

                        if(numberOfPeopleInGroup>=100){

                            pricePerPerson=15.60;
                            totalPrice=pricePerPerson*numberOfPeopleInGroup-10*pricePerPerson;
                            System.out.printf("Total price: %.2f", totalPrice);

                        }

                        else{

                            pricePerPerson=15.60;
                            totalPrice=pricePerPerson*numberOfPeopleInGroup;
                            System.out.printf("Total price: %.2f", totalPrice);

                        }

                        break;

                    case "Sunday":

                        if(numberOfPeopleInGroup>=100){

                            pricePerPerson=16.00;
                            totalPrice=pricePerPerson*numberOfPeopleInGroup-10*pricePerPerson;
                            System.out.printf("Total price: %.2f", totalPrice);

                        }

                        else{

                            pricePerPerson=16.00;
                            totalPrice=pricePerPerson*numberOfPeopleInGroup;
                            System.out.printf("Total price: %.2f", totalPrice);

                        }

                        break;

                    default:


                }


                break;

            case "Regular":

                switch(dayOfWeek){

                    case "Friday":

                        if(numberOfPeopleInGroup>=10 && numberOfPeopleInGroup<=20){

                        pricePerPerson=15.00;
                        totalPrice=pricePerPerson*numberOfPeopleInGroup*0.95;
                        System.out.printf("Total price: %.2f", totalPrice);

                    }
                        else{

                        pricePerPerson=15.00;
                        totalPrice=pricePerPerson*numberOfPeopleInGroup;
                        System.out.printf("Total price: %.2f", totalPrice);

                    }

                    break;

                    case "Saturday":

                        if(numberOfPeopleInGroup>=10 && numberOfPeopleInGroup<=20){

                        pricePerPerson=20.00;
                        totalPrice=pricePerPerson*numberOfPeopleInGroup*0.95;
                        System.out.printf("Total price: %.2f", totalPrice);

                    }

                        else{

                        pricePerPerson=20.00;
                        totalPrice=pricePerPerson*numberOfPeopleInGroup;
                        System.out.printf("Total price: %.2f", totalPrice);

                    }

                        break;

                    case "Sunday":

                        if(numberOfPeopleInGroup>=10 && numberOfPeopleInGroup<=20){

                        pricePerPerson=22.50;
                        totalPrice=pricePerPerson*numberOfPeopleInGroup*0.95;
                        System.out.printf("Total price: %.2f", totalPrice);

                    }

                        else{

                        pricePerPerson=22.50;
                        totalPrice=pricePerPerson*numberOfPeopleInGroup;
                        System.out.printf("Total price: %.2f", totalPrice);

                    }

                         break;

                    default:
                }


                break;

            default:
        }


    }
}
