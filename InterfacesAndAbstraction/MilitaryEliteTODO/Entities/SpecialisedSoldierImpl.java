package InterfacesAndAbstraction.MilitaryEliteTODO.Entities;

import InterfacesAndAbstraction.MilitaryEliteTODO.Enums.Corps;
import InterfacesAndAbstraction.MilitaryEliteTODO.Interfaces.SpecialisedSoldier;

public abstract class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {
    private Corps corps;



    public SpecialisedSoldierImpl(int id, String firstName, String lastname, double salary, Corps corps) {
        super(id, firstName, lastname, salary);
        this.corps = corps;
    }
    @Override
    public String toString() {
        return String.format("%s%nCorps: %s", super.toString(), this.corps);
    }
}
