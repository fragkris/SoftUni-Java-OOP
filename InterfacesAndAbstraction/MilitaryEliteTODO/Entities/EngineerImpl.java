package InterfacesAndAbstraction.MilitaryEliteTODO.Entities;

import InterfacesAndAbstraction.MilitaryEliteTODO.Enums.Corps;
import InterfacesAndAbstraction.MilitaryEliteTODO.Interfaces.Engineer;
import InterfacesAndAbstraction.MilitaryEliteTODO.Interfaces.Repair;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {
    private List<Repair> repairs;


    public EngineerImpl(int id, String firstName, String lastname, double salary, Corps corps) {
        super(id, firstName, lastname, salary, corps);
        this.repairs=new ArrayList<>();
    }

    @Override
    public void addRepair(Repair repair) {
this.repairs.add(repair);
    }

    @Override
    public Collection<Repair> getRepairs() {
        return Collections.unmodifiableCollection(this.repairs);
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder(super.toString());
        out.append(System.lineSeparator()).append("Repairs:").append(System.lineSeparator());
        for (Repair repair : this.repairs) {
            out.append("  ").append(repair.toString()).append(System.lineSeparator());
        }
        return out.toString().trim();
    }
}
