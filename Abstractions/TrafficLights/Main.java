package Abstractions.TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]startColors = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        List<TrafficLight> trafficLights = new ArrayList<TrafficLight>();

        for (String light : startColors) {
            TrafficLight trafficLight = new TrafficLight(Color.valueOf(light));
            trafficLights.add(trafficLight);
        }
        for (int i = 0; i <n ; i++) {
            System.out.println();
            for (TrafficLight light: trafficLights){
                light.update();
                System.out.print(light.getColor() + " ");
            }
        }
    }
}
