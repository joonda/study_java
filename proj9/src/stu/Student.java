package stu;

public class Student {
	private String name;
	private int grade;
	
	public Student(String _name) {
		name = _name;
	}
	
	public Student() {}
	
	public String getName() {
		return name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setName(String _name) {
		name = _name;
	}
	
	public void setGrade(int _grade) {
		grade = _grade;
	}
	
	public class StudentTest {
		public static void main(String[] args) {
			Student s= new Student();
			Student s2 = new Student("홍길동");
			
			s.setName("이순신");
			String name = s.getName();
			int grade = s.getGrade();
			System.out.println("첫 번째 학생의 이름은 " + name + ", 학년은 " + grade);
			
			name = s2.getName();
			grade = s2.getGrade();
			System.out.println("두 번째 학생의 이름은 "+ name +", 학년은 "+grade);
		}
	}

}
