package com.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int bid;
	private String bname;
	private long bnumber;
	private String bemail;
	private long bprice;
	private String pid;
	private String uname;
	
	public Booking() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	public Booking(int bid, String bname, long bnumber, String bemail, long bprice, String pid, String uname) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bnumber = bnumber;
		this.bemail = bemail;
		this.bprice = bprice;
		this.pid = pid;
		this.uname = uname;
	}




	public int getBid() {
		return bid;
	}


	public void setBid(int bid) {
		this.bid = bid;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public long getBprice() {
		return bprice;
	}


	public void setBprice(long bprice) {
		this.bprice = bprice;
	}


	public String getPid() {
		return pid;
	}


	public void setPid(String pid) {
		this.pid = pid;
	}


	public long getBnumber() {
		return bnumber;
	}


	public void setBnumber(long bnumber) {
		this.bnumber = bnumber;
	}


	public String getBemail() {
		return bemail;
	}


	public void setBemail(String bemail) {
		this.bemail = bemail;
	}
 

	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	@Override
	public String toString() {
	
		
		return "\n \t Booking :Booking ID=" + bid  + ", \n Name=" + bname + ", \n Number=" + bnumber + ", \n email=" + bemail + ",\n  Price="
				+ bprice + ", \n Package ID=" + pid;
	}
	
	


	


	

}
