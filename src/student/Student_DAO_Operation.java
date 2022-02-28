package student;

import java.util.*;
import java.sql.*;
import connection.GetConnection;

public class Student_DAO_Operation implements StudentDao {

	private static String insert_student = "insert into Student(student_name, email, course, address, city, state, country, fee, paid, due, contact)values(?,?,?,?,?,?,?,?,?,?,?)";
	private static String update_student = "update Student set student_name = ?, email = ?, course = ?, address = ?, city = ?, state = ?, country = ?, fee = ?, paid = ?, due = ?, contact = ? where student_id = ?";
	private static String select_all_students = "select * from Student";
	private static String select_student_by_id = "Select * from student where student_id = ?";
//	private static String delete_student = "delete from student where student_no = ?";
	private static String due_fee_student = "select * from Student where due = 0";
	GetConnection cn = new GetConnection();

	@Override
	public String addStudent(Student student) {
		String flag = "";
		try {
			Connection con = cn.getConnection();
			PreparedStatement pst = con.prepareStatement(insert_student);

			pst.setString(1, student.getName());
			pst.setString(2, student.getEmail());
			pst.setString(3, student.getCourse());
			pst.setString(4, student.getAddress());
			pst.setString(5, student.getCity());
			pst.setString(6, student.getState());
			pst.setString(7, student.getCountry());
			pst.setInt(8, student.getFee());
			pst.setInt(9, student.getPaid());
			pst.setInt(10, student.getDue());
			pst.setString(11, student.getContact());

			int x = pst.executeUpdate();

			if (x != 0) {
				flag = "Inserted Sucess";
			} else {
				flag = "insert Failed";
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return flag;
	}

	@Override
	public List<Student> dueFeeStudent() {
		List<Student> students = new ArrayList<Student>();

		try {
			Connection con = cn.getConnection();
			PreparedStatement pst = con.prepareStatement(due_fee_student);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				int studentno = rs.getInt(1);
				String studentname = rs.getString(2);
				String email = rs.getString(3);
				String course = rs.getString(4);
				String address = rs.getString(5);
				String city = rs.getString(6);
				String state = rs.getString(7);
				String country = rs.getString(8);
				int fee = rs.getInt(9);
				int paid = rs.getInt(10);
				int due = rs.getInt(11);
				String contact = rs.getString(12);

				Student student = new Student(studentname, email, course, address, city, state, country, contact, fee,
						paid, due, studentno);
				students.add(student);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return students;

	}

	@Override
	public Student selectUserById(int student_number) {
		Student student = null;
		try {
			Connection con = cn.getConnection();
			PreparedStatement pst = con.prepareStatement(select_student_by_id);

			pst.setInt(1, student_number);

			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				int studentno = rs.getInt(1);
				String studentname = rs.getString(2);
				String email = rs.getString(3);
				String course = rs.getString(4);
				String address = rs.getString(5);
				String city = rs.getString(6);
				String state = rs.getString(7);
				String country = rs.getString(8);
				int fee = rs.getInt(9);
				int paid = rs.getInt(10);
				int due = rs.getInt(11);
				String contact = rs.getString(12);

				student = new Student(studentname, email, course, address, city, state, country, contact, fee, paid,
						due, studentno);

			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return student;
	}

	@Override
	public List<Student> ShowAllStudent() {
		List<Student> students = new ArrayList<Student>();

		try {
			Connection con = cn.getConnection();
			PreparedStatement pst = con.prepareStatement(select_all_students);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				int studentno = rs.getInt(1);
				String studentname = rs.getString(2);
				String email = rs.getString(3);
				String course = rs.getString(4);
				String address = rs.getString(5);
				String city = rs.getString(6);
				String state = rs.getString(7);
				String country = rs.getString(8);
				int fee = rs.getInt(9);
				int paid = rs.getInt(10);
				int due = rs.getInt(11);
				String contact = rs.getString(12);

				Student student = new Student(studentname, email, course, address, city, state, country, contact, fee,
						paid, due, studentno);
				students.add(student);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return students;

	}

	@Override
	public String updateStudent(int student_Number, Student student) {
		String updateFlag = "";

		try {
			Connection con = cn.getConnection();
			PreparedStatement pst = con.prepareStatement(update_student);
			pst.setString(1, student.getName());
			pst.setString(2, student.getEmail());
			pst.setString(3, student.getCourse());
			pst.setString(4, student.getAddress());
			pst.setString(5, student.getCity());
			pst.setString(6, student.getState());
			pst.setString(7, student.getCountry());
			pst.setInt(8, student.getFee());
			pst.setInt(9, student.getPaid());
			pst.setInt(10, student.getDue());
			pst.setString(11, student.getContact());
			pst.setInt(12, student_Number);

			int rowUpdated = pst.executeUpdate();
			if (rowUpdated > 0) {
				updateFlag = "Student updated successfully!";
			} else {
				updateFlag = "Student is not updated";
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return updateFlag;
	}

}
