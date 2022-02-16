package Abstractions.GreedyTimes;
//created by J.M.

import java.util.Scanner;
import static java.util.stream.IntStream.iterate;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long capacity = Long.parseLong(scanner.nextLine());
        String[] input = scanner.nextLine().split("\\s+");
        Bag bag = new Bag(capacity);

        for(int i = 0; i < input.length; i += 2){
                String item = input[i].trim();
                long quantity = Long.parseLong(input[i + 1].trim());
                if (item.length() == 3) {
                    bag.addCash(item, quantity);
                } else if (item.toLowerCase().endsWith("gem")) {
                    bag.addGem(item, quantity);
                } else if (item.equalsIgnoreCase("gold")) {
                    bag.addGold(quantity);
                }
        }
        System.out.println(bag.toString());
    }
}