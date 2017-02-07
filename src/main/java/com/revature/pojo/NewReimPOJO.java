package com.revature.pojo;

public class NewReimPOJO {
	private double amount;
	private String desc;
	private int type;
	public NewReimPOJO(double amount, String desc, int type) {
		super();
		this.amount = amount;
		this.desc = desc;
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "NewReimPOJO [amount=" + amount + ", desc=" + desc + ", type=" + type + "]";
	}
	

}
