package InterfacesAndAbstraction.MilitaryEliteTODO.Entities;

import InterfacesAndAbstraction.MilitaryEliteTODO.Interfaces.Spy;

public class SpyImpl extends SoldierImpl implements Spy {
    private String codeNumber;

    public SpyImpl(int id, String firstName, String lastname, String codeNumber) {
        super(id, firstName, lastname);
        this.codeNumber = codeNumber;
    }
    @Override
    public String toString() {
        return String.format("%s%nCode Number: %s", super.toString(), this.codeNumber);
    }
}
