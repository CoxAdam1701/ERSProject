package com.revature.pojo;

import java.sql.Blob;
import java.util.Date;

public class ReimPOJO {

	private int reimID;
	private double reimAmount;
	private String reimDesc;
	private Blob reimPic;
	private Date reimSubmitTime;
	private Date reimResolveTime;
	private int reimAuthor;
	private int reimResolver;
	private int reimType;
	private String reimStatus;
	public int getReimID() {
		return reimID;
	}
	public void setReimID(int reimID) {
		this.reimID = reimID;
	}
	public double getReimAmount() {
		return reimAmount;
	}
	public void setReimAmount(int reimAmount) {
		this.reimAmount = reimAmount;
	}
	public String getReimDesc() {
		return reimDesc;
	}
	public void setReimDesc(String reimDesc) {
		this.reimDesc = reimDesc;
	}
	public Blob getReimPic() {
		return reimPic;
	}
	public void setReimPic(Blob reimPic) {
		this.reimPic = reimPic;
	}
	public Date getReimSubmitTime() {
		return reimSubmitTime;
	}
	public void setReimSubmitTime(Date reimSubmitTime) {
		this.reimSubmitTime = reimSubmitTime;
	}
	public Date getReimResolveTime() {
		return reimResolveTime;
	}
	public void setReimResolveTime(Date reimResolveTime) {
		this.reimResolveTime = reimResolveTime;
	}
	public int getReimAuthor() {
		return reimAuthor;
	}
	public void setReimAuthor(int reimAuthor) {
		this.reimAuthor = reimAuthor;
	}
	public int getReimResolver() {
		return reimResolver;
	}
	public void setReimResolver(int reimResolver) {
		this.reimResolver = reimResolver;
	}
	public int getReimType() {
		return reimType;
	}
	public void setReimType(int reimType) {
		this.reimType = reimType;
	}
	public String getReimStatus() {
		return reimStatus;
	}
	public void setReimStatus(String reimStatus) {
		this.reimStatus = reimStatus;
	}
	public ReimPOJO(int reimID, double reimAmount, String reimDesc, Blob reimPic, Date reimSubmitTime,
			Date reimResolveTime, int reimAuthor, int reimResolver, int reimType, String reimStatus) {
		super();
		this.reimID = reimID;
		this.reimAmount = reimAmount;
		this.reimDesc = reimDesc;
		this.reimPic = reimPic;
		this.reimSubmitTime = reimSubmitTime;
		this.reimResolveTime = reimResolveTime;
		this.reimAuthor = reimAuthor;
		this.reimResolver = reimResolver;
		this.reimType = reimType;
		this.reimStatus = reimStatus;
	}
	@Override
	public String toString() {
		return "ReimPOJO [reimID=" + reimID + ", reimAmount=" + reimAmount + ", reimDesc=" + reimDesc + ", reimPic="
				+ reimPic + ", reimSubmitTime=" + reimSubmitTime + ", reimResolveTime=" + reimResolveTime
				+ ", reimAuthor=" + reimAuthor + ", reimResolver=" + reimResolver + ", reimType=" + reimType
				+ ", reimStatus=" + reimStatus + "]";
	}
	
}
