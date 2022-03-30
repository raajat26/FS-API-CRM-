package com.example.FS.LeadsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FS.Controller.Entities.Leads3;
import com.example.FS.Dao.AddLeadsDao;
//import com.example.FS.Dao.Autowired;

@Service
public class LeadsSrvcImpl implements LeadsService {


	@Autowired 
	private AddLeadsDao ald;

//	List<Leads3> list;
	public LeadsSrvcImpl() {
//		list=new ArrayList<>();
//			list.add(new Leads3(1111,1221,151515,"Lead 1 Puru","Yamunanagar Ka"));
//			list.add(new Leads3(2222,11112,151514,"Lead 2 Himanshu","Faridabad Ka"));
//			list.add(new Leads3(3333,11113,151516,"Lead 3 Divyanshu","Delhi Ka"));

	}


	@Override
	public List<Leads3> getLeads() {

		return ald.findAll();
	}


	@Override
	public Leads3 fetchLeads(long leadid) {
//		Leads3 ld = null;
//		for(Leads3 lead:list) {
//			if(lead.getLeadid()==leadid) {
//				ld=lead;
//				break;
//			}
//		}
		return ald.getOne(leadid);
	}


	@Override
	public Leads3 addlead(Leads3 addlead) {
		// TODO Auto-generated method stub
//		list.add(addlead);
		ald.save(addlead);
		return addlead;
	}


}
