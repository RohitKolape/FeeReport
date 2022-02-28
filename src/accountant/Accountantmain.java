package accountant;

public class Accountantmain {

	public static void main(String[] args) {
		Login_DAO_Implementation acccheck =new Login_DAO_Implementation();
		Accountant acc = new Accountant("RohtKolape","abc","kolaperohit71@gmail.com","9359442028");
		System.out.println(acccheck.Login(acc));
	}

}
