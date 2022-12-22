import java.util.Scanner;

/*
 * @Author Emircan Aktaş - 23.Dec.2022
 */
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double km, age, triptype;
        double per = 0.10, price;

        System.out.println("Enter the distance (km) type :");
        km = inp.nextDouble();

        System.out.println("Enter your age :");
        age = inp.nextDouble();

        System.out.println("Choose the type of trip :\n" +
                "1-One direction\n" +
                "2-Round Trip");
        triptype = inp.nextDouble();

        price = km * per;

        if (km >= 0) {
            if (triptype == 1) {
                if (age <= 0) {
                    System.out.println("You have entered your age wrong.");
                } else if (age > 0 && age < 12) {
                    price = price / 2;
                    System.out.println("Total Price :" + price);
                } else if (age >= 12 && age < 24) {
                    price = price - (price * 0.1);
                    System.out.println("Total Price :" + price);
                } else if (age > 24 && age <= 65) {
                    System.out.println("Total Price :" + price);
                } else if (age > 65) {
                    price = price - (price * 0.3);
                    System.out.println("Total Price :" + price);
                }

            } else if (triptype == 2) {

                if (age <= 0) {
                    System.out.println("You have entered your age wrong.");
                } else if (age > 0 && age < 12) {
                    price = (price / 2);
                    price = (price - (price * 0.2));
                    price = price * 2;
                    System.out.println("Total Price :" + price);
                } else if (age >= 12 && age < 24) {
                    price = (price - (price * 0.1));
                    price = (price - (price * 0.2));
                    price = price * 2;
                    System.out.println("Total Price :" + price);
                } else if (age > 24 && age <= 65) {
                    price = (price - (price * 0.2));
                    price = price * 2;
                    System.out.println("Total Price :" + price);
                } else if (age > 65) {
                    price = (price - (price * 0.3));
                    price = (price - (price * 0.2));
                    price = price * 2;
                    System.out.println("Total Price :" + price);
                }

            } else {
                System.out.println("You Entered Wrong Data!");
            }
        }else {
            System.out.println("You Entered Wrong Data!");
        }

    }
}