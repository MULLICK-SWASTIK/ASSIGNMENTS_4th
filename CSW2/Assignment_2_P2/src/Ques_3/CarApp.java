package Ques_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        ArrayList<Car> carList = new ArrayList<Car>();
        String name;
        int ModalNo, stock;
        char choice;
        while (true) {
            System.out.print("\nEnter car name: ");
            name = k.nextLine();
            System.out.print("Enter Modal number: ");
            ModalNo = k.nextInt();
            System.out.print("Enter stock quantity: ");
            stock = k.nextInt();
            carList.add(new Car(name, stock, ModalNo));

            System.out.print("Want to enter more cars? (y/n)  ");
            choice = k.next().charAt(0);
            if (choice == 'n' || choice == 'N')
                break;
            System.out.println("Next entry.......");
            k.nextLine();
        }
        System.out.println("\nCar List: ");
        for (Car car : carList) {
            System.out.println(car);
        }
        Collections.sort(carList);
        System.out.println("\nSorted Car List: ");
        for (Car car : carList) {
            System.out.println(car);
        }
        k.close();
    }
}
// OUTPUT
// Enter car name: Kia
// Enter Modal number: 2018
// Enter stock quantity: 20
// Want to enter more cars? (y/n) y
// Next entry.......

// Enter car name: MG
// Enter Modal number: 2020
// Enter stock quantity: 13
// Want to enter more cars? (y/n) y
// Next entry.......

// Enter car name: BMW
// Enter Modal number: 2015
// Enter stock quantity: 55
// Want to enter more cars? (y/n) y
// Next entry.......

// Enter car name: Creta
// Enter Modal number: 2013
// Enter stock quantity: 10
// Want to enter more cars? (y/n) y
// Next entry.......

// Enter car name: Audi
// Enter Modal number: 2017
// Enter stock quantity: 45
// Want to enter more cars? (y/n) n

// Car List:
// Name: Kia Modal no.: 2018 Stock: 20
// Name: MG Modal no.: 2020 Stock: 13
// Name: BMW Modal no.: 2015 Stock: 55
// Name: Creta Modal no.: 2013 Stock: 10
// Name: Audi Modal no.: 2017 Stock: 45

// Sorted Car List:
// Name: Creta Modal no.: 2013 Stock: 10
// Name: MG Modal no.: 2020 Stock: 13
// Name: Kia Modal no.: 2018 Stock: 20
// Name: Audi Modal no.: 2017 Stock: 45
// Name: BMW Modal no.: 2015 Stock: 55