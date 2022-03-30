package com.example.FS.Controller.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class createATrip {
	@Id
	private long leadid;
	private long leadnum;
	private long leadaddrs;
	private String leadName;
	private String leadrmks;
	private String leadEmail;
	private String arrivalDate;
	private String departureDate;
	private String roomCategory;
	private String transferType;
	private String paxx;
	
	
	public createATrip (long leadid, long leadnum, long leadaddrs, String leadName, String leadrmks, String leadEmail, String arrivalDate, String departureDate, String roomCategory, String transferType, String paxx  ) {
		super();
		this.leadid = leadid;
		this.leadnum = leadnum;
		this.leadaddrs = leadaddrs;
		this.leadName = leadName;
		this.leadrmks = leadrmks; 
		this.leadEmail = leadEmail;
		this.arrivalDate = arrivalDate;
		this.departureDate=departureDate;
		this.roomCategory=roomCategory;
		this.transferType=transferType;
		this.paxx=paxx;
		
		
		
	}

	@Override
	public String toString() {
		return "Leads [leadid=" + leadid + ","
				+ " leadnum=" + leadnum + ","
				+ " leadaddrs=" + leadaddrs + ","
				+ " leadName=" + leadName + ","
				+ " leadrmks=" + leadrmks + ","
				+ ", leadEmail=" + leadEmail +","
				+ ", arrivalDate=" + arrivalDate +","
				+ ", departureDate=" + departureDate +","
				+ ", roomCategory=" + roomCategory +","
				+ ", transferType=" + transferType +","
				+ ", paxx=" + paxx +
				"]";
	}
//leadnum,leadaddrs,leadName,leadrmks,leadEmail,arrivalDate,departureDate,roomCategory,transferType,transferType
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

	public String getLeadEmail() {
		return leadEmail;
	}

	public void setLeadEmail(String leadEmail) {
		this.leadEmail = leadEmail;
	}

	public String getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getRoomCategory() {
		return roomCategory;
	}

	public void setRoomCategory(String roomCategory) {
		this.roomCategory = roomCategory;
	}

	public String getTransferType() {
		return transferType;
	}

	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}

	public String getPaxx() {
		return paxx;
	}

	public void setPaxx(String paxx) {
		this.paxx = paxx;
	}

	public void setLeadrmks(String leadrmks) {
		this.leadrmks = leadrmks;
	}

	public createATrip() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
