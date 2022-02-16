package InterfacesAndAbstraction.MilitaryEliteTODO.Entities;

import InterfacesAndAbstraction.MilitaryEliteTODO.Interfaces.Private;

public class PrivateImpl extends SoldierImpl implements Private {
    private double salary;


    public PrivateImpl(int id, String firstName, String lastname, double salary) {
        super(id, firstName, lastname);
        this.salary=salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return String.format("%s Salary: %.2f", super.toString(), this.salary);
    }
}
