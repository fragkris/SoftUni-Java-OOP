package Polymorphism.Animals;

public abstract class Animal {

    private String name;
    private String favouriteFood;

    protected Animal (String name, String favouriteFood){
        this.name=name;
        this.favouriteFood=favouriteFood;
    }

    public String explainSelf(){
        return "I am " + getName() + " and my favourite food is "
                + getFavouriteFood();
    }

    protected String getName() {
        return name;
    }

    protected String getFavouriteFood() {
        return favouriteFood;
    }
}
