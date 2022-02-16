package Polymorphism.WildFarm;

public class Zebra extends Mammal{
    public Zebra(String animalType, String animalName, double weight, String livingRegion) {
        super(animalType, animalName, weight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            super.eat(food);
        }else {
            throw new IllegalArgumentException("Zebras are not eating that type of food!");
        }
    }
}
