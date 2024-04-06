package LAB7;

import java.util.*;

public class Fractional_Knapsack {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("How many items? ");
        Item[] array = new Item[k.nextInt()];
        System.out.println("Enter items: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(String.format("\nItem %1$s~ \nProfit: ", j + 1));
            double profit = k.nextDouble();
            System.out.print("Weight: ");
            double weight = k.nextDouble();
            array[j] = new Item(profit, weight);
        }
        Arrays.sort(array);
        double weight_left = 50, profit = 0;
        int i = 0;
        while (weight_left != 0 && i < array.length) {
            if (array[i].weight <= weight_left) {
                profit += array[i].profit;
                weight_left -= array[i].weight;
            } else {
                profit += (weight_left * array[i].ratio);
                weight_left = 0;
            }
            i++;
        }
        System.out.println(String.format("\nMaximum profit: %1$s", profit));
        k.close();
    }
}

class Item implements Comparable<Item> {
    double ratio, profit, weight;

    Item(double profit, double weight) {
        this.profit = profit;
        this.weight = weight;
        this.ratio = profit / weight;
    }

    public int compareTo(Item other) {
        return (int) (other.ratio - this.ratio);
    }

    public String toString() {
        return String.format("Profit: %1$s \t Weight: %2$s", this.profit, this.weight);
    }
}