package com.revature.enums;

public enum StatusEnum {
		
		PENDING(1,"Pending"),
		APPROVED(2,"Approved"),
		DENIED(3, "Denied");
		
		private final int id;
		private final String name;
		
		private StatusEnum(int id, String name){
			this.id = id;
			this.name= name;
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}	

	}

