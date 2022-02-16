package InterfacesAndAbstraction.CarShopExtendedTODO;
//created by J.M.

public class Seat implements Car, Sellable {

    private final String model;
    private final String color;
    private final Integer horsePower;
    private final String countryProduced;
    private Double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced, Double price) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
        this.price = price;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String countryProduced() {
        return this.countryProduced;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires",getModel(),countryProduced(),TIRES);
    }

    @Override
    public Double getPrice() {
        return price;
    }
}