package InterfacesAndAbstraction.MilitaryEliteTODO.Entities;

import InterfacesAndAbstraction.MilitaryEliteTODO.Interfaces.Soldier;

public class SoldierImpl implements Soldier {
    private int id;
    private String firstName;
    private String lastname;

    protected SoldierImpl(int id, String firstName, String lastname) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastname;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %d", this.getFirstName(), this.getLastName(), this.getId());
    }
}
