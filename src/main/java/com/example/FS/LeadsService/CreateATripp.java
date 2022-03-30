package com.example.FS.LeadsService;
import java.util.List;
import com.example.FS.Controller.Entities.createATrip;


public interface CreateATripp {
//createATrip
	public List<createATrip> getLeads();
	
	public createATrip fetchTrips(long leadid);
	
	public createATrip addtrips(createATrip addtrips);
		//this method adds the leads
	
}
