package school_management_system;

import java.util.List;

public class Skul {

	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	public Skul(List<Teacher> teacher, List<Student> student) {
		super();
		this.teachers = teacher;
		this.students = student;
		totalMoneyEarned=0;
		totalMoneySpent=0;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void addTeacher(Teacher teacher) {
		this.teachers.add(teacher);
	}

	public List<Student> getStudents() {
		return students;
	}

	public void addStudent(Student student) {
		this.students.add(student);
	}

	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}

	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	public static void updateTotalMoneySpent(int MoneySpent) {
		totalMoneySpent -= MoneySpent;
	}
	
	
}
