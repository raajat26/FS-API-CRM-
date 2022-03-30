package com.example.FS.Controller.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Leads3 {
	@Id
	private long leadid;
	private long leadnum;
	private long leadaddrs;
	private String leadName;
	private String leadrmks;
	
	public Leads3 (long leadid, long leadnum, long leadaddrs, String leadName, String leadrmks) {
		super();
		this.leadid = leadid;
		this.leadnum = leadnum;
		this.leadaddrs = leadaddrs;
		this.leadName = leadName;
		this.leadrmks = leadrmks; 
		
		
	}

	@Override
	public String toString() {
		return "Leads [leadid=" + leadid + ", leadnum=" + leadnum + ", leadaddrs=" + leadaddrs + ", leadName="
				+ leadName + ", leadrmks=" + leadrmks + "]";
	}

	public long getLeadid() {
		return leadid;
	}

	public void setLeadid(long leadid) {
		this.leadid = leadid;
	}

	public long getLeadnum() {
		return leadnum;
	}

	public void setLeadnum(long leadnum) {
		this.leadnum = leadnum;
	}

	public long getLeadaddrs() {
		return leadaddrs;
	}

	public void setLeadaddrs(long leadaddrs) {
		this.leadaddrs = leadaddrs;
	}

	public String getLeadName() {
		return leadName;
	}

	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}

	public String getLeadrmks() {
		return leadrmks;
	}

	public void setLeadrmks(String leadrmks) {
		this.leadrmks = leadrmks;
	}

	public Leads3() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
