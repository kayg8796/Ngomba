package school_management_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) {
	
	Teacher lizzy = new Teacher(1,10000,"lizzy");
	Teacher minet = new Teacher(2,20000,"minet");
	Teacher lora = new Teacher (3,52000,"lora");
	
	List<Teacher> teachers = new ArrayList<>();
	teachers.add(lizzy);
	teachers.add(lora);
	teachers.add(minet);
	
	Student mbua = new Student(1,"mbua",5);
	Student gerald = new Student(2,"gerald",2);
	Student romeo = new Student(2,"romeo",6);
	
	List<Student> students = new ArrayList<>();
	students.add(mbua);
	students.add(romeo);
	students.add(gerald);
	
	
	Skul ghs = new Skul(teachers,students);
	System.out.println("ghs has earned the following money:"+ghs.getTotalMoneyEarned());
	
	mbua.updateFeesPaid(5000);
	System.out.println("the amount left for him to pay is :"+mbua.getRemainingFees());
	
	Skul.updateTotalMoneyEarned(5000); //accessing a static method can be done directly without the use of an object. same with a static field.
	
	
}
}
