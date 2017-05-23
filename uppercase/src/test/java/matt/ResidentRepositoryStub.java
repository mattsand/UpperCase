package matt;
import java.util.List;

import domain.Resident;
import repository.ResidentRepository;
import java.util.ArrayList;

public class ResidentRepositoryStub implements ResidentRepository{
	private List<Resident> lr = new ArrayList<Resident>();
	
	public void newResident(Resident r){
		lr.add(r);
	}

	public List<Resident> getResidents() {
		return lr;
	}

}
