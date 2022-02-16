package Polymorphism.WildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal{
    private String livingRegion;

    public Mammal(String animalType, String animalName, double weight,String livingRegion) {
        super(animalType, animalName, weight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }
    @Override
    public void eat(Food food){
        super.setFoodEaten(food.getQuantity());
    }

    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString(){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        return String.format("%s[%s, %s, %s, %d]",
                this.getClass().getSimpleName(),
                this.getAnimalName(),
                decimalFormat.format(this.getWeight()),
                this.getLivingRegion(),
                this.getFoodEaten());
    }
}
