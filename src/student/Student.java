package student;

public class Student {

	private String name, email, course, address, city, state, country ,contact;
	private int fee, paid, due, studentno;

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	


	public Student(String name, String email, String course, String address, String city, String state, String country,
			String contact, int fee, int paid, int due) {
		super();
		this.name = name;
		this.email = email;
		this.course = course;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.contact = contact;
		this.fee = fee;
		this.paid = paid;
		this.due = due;
	}


	public int getStudentno() {
		return studentno;
	}


	public Student(String name, String email, String course, String address, String city, String state, String country,
			String contact, int fee, int paid, int due, int studentno) {
		super();
		this.name = name;
		this.email = email;
		this.course = course;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.contact = contact;
		this.fee = fee;
		this.paid = paid;
		this.due = due;
		this.studentno = studentno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public int getPaid() {
		return paid;
	}

	public void setPaid(int paid) {
		this.paid = paid;
	}

	public int getDue() {
		return due;
	}

	public void setDue(int due) {
		this.due = due;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "["+ name + " " + email + " " + course + " " + address + " "
				+ city + " " + state + " " + country + " " + contact + " " + fee
				+ " " + paid + " " + due + " " + studentno +"]";
	}

	

}
