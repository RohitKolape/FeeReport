package accountant;

public class Accountant {

	private String name;
	private String password;
	private String email;
	private String contact;
	private int accountant_no;
	
	public Accountant(String name, String password, String email, String contact) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.contact = contact;
	}

	public Accountant(String name, String password, String email, String contact, int accountant_no) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.contact = contact;
		this.accountant_no = accountant_no;
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

	public int getAccountant_no() {
		return accountant_no;
	}

	
	
	
	
	
}
