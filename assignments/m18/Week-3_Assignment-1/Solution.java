/**
 * @author : saitejasedate.
 */
/**
 * Class for solution.
 */
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberofcompanies = Integer.parseInt(sc.nextLine());
        int count = 0;
        MaxPQ<Stock> maxpq1 = new MaxPQ<Stock>();
        MinPQ<Stock> minpq1 = new MinPQ<Stock>();
        for (int i = 0; i < numberofcompanies; i++) {
            String[] tokens = sc.nextLine().split(",");
            Stock object = new Stock(tokens[0], Double.parseDouble(tokens[1]));
            maxpq1.insert(object);
            minpq1.insert(object);
            count++;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(maxpq1.delMax());

        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(minpq1.delMin());
        }
        System.out.println();
        MaxPQ<Stock> maxpq2 = new MaxPQ<Stock>();
        MinPQ<Stock> minpq2 = new MinPQ<Stock>();
        for (int i = 0; i < numberofcompanies; i++) {
            String[] tokens = sc.nextLine().split(",");
            Stock object = new Stock(tokens[0], Double.parseDouble(tokens[1]));
            maxpq2.insert(object);
            minpq2.insert(object);
            count++;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(maxpq2.delMax());

        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(minpq2.delMin());
        }
        System.out.println();

        MaxPQ<Stock> maxpq3 = new MaxPQ<Stock>();
        MinPQ<Stock> minpq3 = new MinPQ<Stock>();
        for (int i = 0; i < numberofcompanies; i++) {
            String[] tokens = sc.nextLine().split(",");
            Stock object = new Stock(tokens[0], Double.parseDouble(tokens[1]));
            maxpq3.insert(object);
            minpq3.insert(object);
            count++;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(maxpq3.delMax());

        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(minpq3.delMin());
        }
        System.out.println();
        MaxPQ<Stock> maxpq4 = new MaxPQ<Stock>();
        MinPQ<Stock> minpq4 = new MinPQ<Stock>();
        for (int i = 0; i < numberofcompanies; i++) {
            String[] tokens = sc.nextLine().split(",");
            Stock object = new Stock(tokens[0], Double.parseDouble(tokens[1]));
            maxpq4.insert(object);
            minpq4.insert(object);
            count++;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(maxpq4.delMax());

        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(minpq4.delMin());
        }
        System.out.println();
        MaxPQ<Stock> maxpq5 = new MaxPQ<Stock>();
        MinPQ<Stock> minpq5 = new MinPQ<Stock>();
        for (int i = 0; i < numberofcompanies; i++) {
            String[] tokens = sc.nextLine().split(",");
            Stock object = new Stock(tokens[0], Double.parseDouble(tokens[1]));
            maxpq5.insert(object);
            minpq5.insert(object);
            count++;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(maxpq5.delMax());

        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(minpq5.delMin());
        }
        System.out.println();
        MaxPQ<Stock> maxpq6 = new MaxPQ<Stock>();
        MinPQ<Stock> minpq6 = new MinPQ<Stock>();
        for (int i = 0; i < numberofcompanies; i++) {
            String[] tokens = sc.nextLine().split(",");
            Stock object = new Stock(tokens[0], Double.parseDouble(tokens[1]));
            maxpq6.insert(object);
            minpq6.insert(object);
            count++;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(maxpq6.delMax());

        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(minpq6.delMin());
        }
        System.out.println();
    }
}