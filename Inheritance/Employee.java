package Inheritance;

public class Employee  extends  Person{
    private String company;

    public Employee(String name, String address) {
        super(name, address);
        this.company = null;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
