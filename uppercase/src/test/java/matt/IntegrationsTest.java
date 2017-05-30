package matt;

import org.junit.Test;
import domain.Resident;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import service.*;
import java.util.*;
public class IntegrationsTest{
	List<Resident> LR = new ArrayList<Resident>();
	
	@SuppressWarnings("deprecation")
	@Test
	public void IntegrationTest() throws ResidentServiceException {
		ResidentRepositoryStub stub = new ResidentRepositoryStub();
		Resident hans = new Resident("Hans","Walter","Fakestr.","Fakecity",new Date(1992,12,12));
		stub.newResident(hans);
		
		Resident franz = new Resident("Franz","Mueller","Breitestr.","Falschestadt", new Date(1982,11,11));
		stub.newResident(franz);
		
		Resident jockel = new Resident("Jockel","Dockel","Kurzestr.","Richtigestadt", new Date(1911,3,3));
		stub.newResident(jockel);
		
		Resident bernd = new Resident("Bernd","Hansel","Wasserstr.","UnterWasser", new Date(1954,9,9));
		stub.newResident(bernd);
		
		BaseResidentService BRS = new BaseResidentService();
		BRS.setResidentRepository(stub);
		LR.add(hans);
		assertEquals(LR,BRS.getFilteredResidentsList(hans));
		
		LR.remove(hans);
		LR.add(bernd);
		assertEquals(LR,BRS.getFilteredResidentsList(bernd));
		
		LR.remove(bernd);
		LR.add(franz);
		assertEquals(LR,BRS.getFilteredResidentsList(franz));
		
		
		assertEquals(hans,BRS.getUniqueResident(hans));
		assertEquals(franz,BRS.getUniqueResident(franz));
		assertEquals(jockel,BRS.getUniqueResident(jockel));
		
		
		
	}
}
