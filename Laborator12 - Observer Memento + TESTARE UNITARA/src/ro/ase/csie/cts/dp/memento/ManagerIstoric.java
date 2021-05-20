package ro.ase.csie.cts.dp.memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerIstoric {

	List<MementoErou> salvari=new ArrayList<>();
	
	public void adaugaSalvare(MementoErou memento) {
		this.salvari.add(memento);
	}
	
	public MementoErou getUltimaSalvare() {
		if(this.salvari.size()>0) {
			MementoErou ultimaSalvare=this.salvari.get(this.salvari.size()-1);
            this.salvari.remove(ultimaSalvare);
            return ultimaSalvare;
		}
		else
		{
			return null;
		}
	}
}
