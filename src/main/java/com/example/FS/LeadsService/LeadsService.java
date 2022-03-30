package com.example.FS.LeadsService;

import java.util.List;

import com.example.FS.Controller.Entities.Leads3;

public interface LeadsService {

	public List<Leads3> getLeads();
	
	public Leads3 fetchLeads(long leadid);
	
	public Leads3 addlead(Leads3 addlead);
		//this method adds the leads
	
}
