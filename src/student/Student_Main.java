package student;
import java.util.*;
public class Student_Main {

	public static void main(String[] args) {
		
//		String name = "Ashok Jagdale";
//		String email = "ashokjagdale@gmail.com";
//		String course = "C++";
//		String address = "Shitole Nagar";
//		String city = "Banglore";
//		String state = "Tamil Nadu";
//		String country = "Saudi Arebia";
//		int fee = 1000;
//		int paid = 300;
//		int due = 700;
//		String contact = "8942348467";
		
//		Student student = new Student(name,email,course,address,city,state,country,contact,fee,paid,due);
//		
		//StudentAdd
		Student_DAO_Operation showstudent = new Student_DAO_Operation();
//		String Answer = Addstudent.addStudent(student);
//		System.out.println(Answer);
		
		//view AllStudent
		List<Student> allStudents = showstudent.ShowAllStudent();
		System.out.println(allStudents);
		
		
		//Student Updation
//		Student_DAO_Operation updateStudent = new Student_DAO_Operation();
//		System.out.println(updateStudent.updateStudent(2,student));

		
		//Due Fee Student
//		Student_DAO_Operation duefeestudent = new Student_DAO_Operation();
//		List<Student>Due_fee_student = duefeestudent.dueFeeStudent();
//		System.out.println(Due_fee_student);
//	
		
		
		
		
		
		
		
		
		
		
		
	}

}
