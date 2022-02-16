package InterfacesAndAbstraction.MilitaryEliteTODO.Entities;

import InterfacesAndAbstraction.MilitaryEliteTODO.Interfaces.LieutenantGeneral;
import InterfacesAndAbstraction.MilitaryEliteTODO.Interfaces.Private;

import java.util.ArrayList;
import java.util.List;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {
    private List<Private>privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastname, double salary) {
        super(id, firstName, lastname, salary);
        this.privates = new ArrayList<>();
    }

    @Override
    public void addPrivate(Private priv) {
        this.privates.add(priv);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder(super.toString());
        output.append(System.lineSeparator()).append("Privates:").append(System.lineSeparator());
        for (Private soldier : this.privates) {
            output.append("  ").append(soldier.toString()).append(System.lineSeparator());
        }
        return output.toString().trim();
    }
}
