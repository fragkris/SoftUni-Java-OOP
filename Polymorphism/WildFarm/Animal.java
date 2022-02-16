package Polymorphism.WildFarm;

public abstract class Animal {
    private String animalType;
    private String animalName;
    private double weight;
    private int foodEaten;

    public Animal(String animalType, String animalName, double weight) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.weight = weight;
    }

    public abstract void makeSound();
    public abstract void eat(Food food);

    public String getAnimalType() {
        return animalType;
    }

    public String getAnimalName() {
        return animalName;
    }

    public double getWeight() {
        return weight;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFoodEaten(int foodEaten) {
        this.foodEaten = foodEaten;
    }

    public int getFoodEaten() {
        return foodEaten;
    }
}
