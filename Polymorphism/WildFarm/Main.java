package Polymorphism.WildFarm;

import Polymorphism.Animals.Animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String line = "";
        while (!"End".equals(line=scanner.nextLine())){
            String [] animalInfo = line.split("\\s+");
            String  type = animalInfo[0];
            String name = animalInfo[1];
            double weight = Double.parseDouble(animalInfo[2]);
            String livingRegion = animalInfo[3];

            Animal animal = null;

//            switch (type){
//
//                case "Cat":
//                    String catBreed = animalInfo[4];
//                    animal = new Cat(type, name, weight, livingRegion, catBreed);
//                    break;
//                case "Tiger":
//                    animal = new Tiger(type, name, weight, livingRegion);
//                    break;
//                case "Zebra":
//                    animal = new Zebra(type, name, weight, livingRegion);
//                    break;
//                case "Mouse":
//                    animal = new Mouse(type, name, weight, livingRegion);
//                    break;
//            }


        }


    }
}
