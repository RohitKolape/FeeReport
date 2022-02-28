package admin;


public class Admin{
	private String name;
	private String password;
	private String email;
	private String contact;
	private int admin_no;
	
	public Admin(String name, String password, String email, String contact) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.contact = contact;
	}

	public Admin(String name, String password, String email, String contact, int admin_no) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.contact = contact;
		this.admin_no = admin_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public int getAdmin_no() {
		return admin_no;
	}

	
	
	
}
