package Abstractions.EnumerationsDemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(getDayNumber(Day.MONDAY));
        //System.out.println(getDayNumber(Day.valueOf(scanner.nextLine())));


    }



    private static int getDayNumber(Day day) {

        return day.ordinal()+1; //или така...

//        int dayNumber = switch (day) {
//            case MONDAY -> 1;
//            case TUESDAY -> 2;
//            case FRIDAY -> 5;
//            case WEDNESDAY -> 3;
//            case THURSDAY -> 4;
//            case SATURDAY -> 6;
//            case SUNDAY -> 7;
//            default -> 0;
//        };
//return dayNumber;
    }

}
