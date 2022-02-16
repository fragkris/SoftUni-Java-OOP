package Polymorphism.WildFarm;

import java.text.DecimalFormat;

public class Cat extends Felime  {
    private String breed;

    public Cat(String animalType, String animalName, double weight, String livingRegion, String breed) {
        super(animalType, animalName, weight, livingRegion);
        this.breed=breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
            super.eat(food);
    }
    @Override
    public String toString(){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        return String.format("%s[%s, %s, %s, %s, %d]",
                this.getClass().getSimpleName(),
                this.getBreed(),
                this.getAnimalName(),
                decimalFormat.format(this.getWeight()),
                this.getLivingRegion(),
                this.getFoodEaten());
    }

    public String getBreed() {
        return breed;
    }
}
