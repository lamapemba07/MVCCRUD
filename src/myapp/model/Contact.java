package myapp.model;

public class Contact {
   String empID, empName, homeNum, mobileNum, offNum, email;

public Contact(String empID, String empName, String homeNum, String mobileNum, String offNum, String email) {
	super();
	this.empID = empID;
	this.empName = empName;
	this.homeNum = homeNum;
	this.mobileNum = mobileNum;
	this.offNum = offNum;
	this.email = email;
}

public String getEmpID() {
	return empID;
}

public void setEmpID(String empID) {
	this.empID = empID;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public String getHomeNum() {
	return homeNum;
}

public void setHomeNum(String homeNum) {
	this.homeNum = homeNum;
}

public String getMobileNum() {
	return mobileNum;
}

public void setMobileNum(String mobileNum) {
	this.mobileNum = mobileNum;
}

public String getOffNum() {
	return offNum;
}

public void setOfficeNum(String offNum) {
	this.offNum = offNum;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
}
