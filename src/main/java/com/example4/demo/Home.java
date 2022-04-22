package com.example4.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("prototype")
@Component

public class Home {

	private String owner;
	private int doorNo;
	@Autowired
	public InternetConnection ic;
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	
	public Home() {
		super();
		System.out.println("constructor ");
	}
	public void connect() {
//		InternetConnection ic = new InternetConnection(); // tight coupling.
		ic.switchOn();
		System.out.println("connection");
	}
}	

