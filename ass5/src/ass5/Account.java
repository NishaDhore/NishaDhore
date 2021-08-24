package ass5;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

public class Account implements Serializable
{
	int AccId;
	String pass;
	String AccName;
	String MiddleName;
	String LastName;
	String DOB;
	String Pan;
	String Address;
	String State;
	String City;
	int Zip;
	double AccBal;
	int status;
	
	
	
	public int getAccId() {
		return AccId;
	}

	public void setAccId(int accId) {
		AccId = accId;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getAccName() {
		return AccName;
	}

	public void setAccName(String accName) {
		AccName = accName;
	}
	
	

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getPan() {
		return Pan;
	}

	public void setPan(String pan) {
		Pan = pan;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public int getZip() {
		return Zip;
	}

	public void setZip(int zip) {
		Zip = zip;
	}

	public double getAccBal() {
		return AccBal;
	}

	public void setAccBal(double accBal) {
		AccBal = accBal;
	}

	
	
	
	
}
