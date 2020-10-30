package school_management_system;

public class Teacher {

	private int id;
	private int salary;
	private String name;
	private int salaryEarned;
	
	public Teacher(int id,int salary , String name) {
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.salaryEarned  =0 ;
		
	}
	
	public void receiveSalary(int salary) {
		this.salaryEarned += salary;
		Skul.updateTotalMoneySpent(salary);
	}

	public int getId() {
		return id;
	}



	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

}
