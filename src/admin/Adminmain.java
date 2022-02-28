package admin;

public class Adminmain {

	public static void main(String[] args) {
		Login_Dao_Implementation logcheck = new Login_Dao_Implementation();
		Admin admin = new Admin("admin","admin123","","");
		System.out.println(logcheck.Login(admin));
	}

}
