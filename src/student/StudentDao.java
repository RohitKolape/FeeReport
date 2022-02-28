package student;

import java.util.*;

public interface StudentDao {

	String addStudent(Student student);
	String updateStudent(int student_Number,Student student);
	List<Student> ShowAllStudent();
	Student selectUserById(int student_number);
	List<Student> dueFeeStudent();

}
