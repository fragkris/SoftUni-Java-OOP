package InterfacesAndAbstraction.MilitaryEliteTODO.Entities;

import InterfacesAndAbstraction.MilitaryEliteTODO.Enums.Corps;
import InterfacesAndAbstraction.MilitaryEliteTODO.Interfaces.Commando;
import InterfacesAndAbstraction.MilitaryEliteTODO.Interfaces.Mission;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    private List<Mission>missions;

    public CommandoImpl(int id, String firstName, String lastname, double salary, Corps corps) {
        super(id, firstName, lastname, salary, corps);
        this.missions=new ArrayList<>();
    }

    @Override
    public void addMission(Mission mission) {
        this.missions.add(mission);
    }

    @Override
    public Collection<Mission> getMissions() {
        return Collections.unmodifiableCollection(this.missions);
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder(super.toString());
        out.append(System.lineSeparator()).append("Missions:").append(System.lineSeparator());
        for (Mission mission : this.missions) {
            out.append("  ").append(mission.toString()).append(System.lineSeparator());
        }
        return out.toString().trim();
    }
}
