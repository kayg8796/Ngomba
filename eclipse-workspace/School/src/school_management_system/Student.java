package school_management_system;
//this class is responsible for keeping track of 
//student's info like fees, name , id , grade etc
public class Student {
private int id; // protect some one from accessing this id outside the student class
private String name;
private int grade;
private int feesPaid;
private int feesTotal;

public Student(int id, String name , int grade) {
	
	/**
	 * @param id is the student id
	 * @param name is the student name 
	 * @param grade is the student grade
	 */
this.feesPaid = 0;
this.feesTotal = 30000;
this.id = id;
this.name = name;
this.grade = grade;
}

public int getRemainingFees() {
	return this.feesTotal - this.feesPaid;
}

public int getGrade() {
	return grade;
}

//used to upgrade the student's grade
public void setGrade(int grade) { 
	this.grade = grade;
}

public int getFeesPaid() {
	return feesPaid;
}

public void updateFeesPaid(int feesPaid) {
	this.feesPaid += feesPaid;
}

public int getId() {
	return id;
}


public String getName() {
	return name;
}



public int getFeesTotal() {
	return feesTotal;
}


}
