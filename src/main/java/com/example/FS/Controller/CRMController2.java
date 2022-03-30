package com.example.FS.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FS.Controller.Entities.Leads3;
import com.example.FS.Controller.Entities.createATrip;
import com.example.FS.LeadsService.CreateATripp;
import com.example.FS.LeadsService.LeadsService;

@RestController

public class CRMController2 {
	@Autowired
	public LeadsService ls;
	@Autowired
	public CreateATripp cat;

	@GetMapping("/try")
	public String home() {
		return "Returning Message From Controller -- This is to track logs";
		//Level 1 UT Logs for Basic  Efforts
	}
	
	@GetMapping("/Leads")
	public List<Leads3> getLeads()
	{		
		//this functions gets all the leads
		return this.ls.getLeads();
	}
	@GetMapping("/Leads/{leadid}")
	public Leads3 fetchLeads(@PathVariable String leadid) {
		//	@PostMapping(path="/Leads", consumes="application/JSON")

		return this.ls.fetchLeads(Long.parseLong(leadid));
	} 
	@PostMapping("/Leads")
	public Leads3 addlead(@RequestBody Leads3 addlead) {
		return this.ls.addlead(addlead); 
		//idea #1 is to prepare a Resort wise display console of leads
	}
	
	@PostMapping("/CreateATrip")
	public createATrip addlead(@RequestBody createATrip addtrips) {
		return this.cat.addtrips(addtrips); 
	}
	
	@GetMapping("/ViewTrips")
	public List<createATrip> fetchTrips()
	{		
		//this functions gets all the leads
		return this.cat.getLeads();
	}
}
