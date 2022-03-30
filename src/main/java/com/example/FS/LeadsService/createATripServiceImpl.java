package com.example.FS.LeadsService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FS.Controller.Entities.createATrip;
import com.example.FS.Dao.createTripsDAO;

@Service
public class createATripServiceImpl implements CreateATripp {

	@Autowired
	private createTripsDAO ctd;
	
	public createATripServiceImpl() {}

	
	
	@Override
	public List<createATrip> getLeads() {

		return ctd.findAll();
//		return ctd.findAll();
	}
	
	
	
	@Override
	public createATrip fetchTrips(long leadid) {
//		Leads3 ld = null;
//		for(Leads3 lead:list) {
//			if(lead.getLeadid()==leadid) {
//				ld=lead;
//				break;
//			}
//		}
		return ctd.getOne(leadid);
	}
	
	
//createATrip
	@Override
	public createATrip addtrips(createATrip addATrip) {
		// TODO Auto-generated method stub
//		list.add(addlead);
		ctd.save(addATrip);
		return addATrip;
	}
	
}

