package accountant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.GetConnection;

public class Login_DAO_Implementation implements loginDao {

	private static String login_accountant = "select * from Accountant where acc_name = ? and pass = ?";

	GetConnection getcon = new GetConnection();
	
	@Override
	public String Login(Accountant acc) {
		String flag ="";
		
		Connection con;
		try {
			con = getcon.getConnection();
			
			PreparedStatement pst = con.prepareStatement(login_accountant);
			pst.setString(1, acc.getName());
			pst.setString(2, acc.getPassword());
			
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				flag = "Login successful";
			} else {
				flag = "Login failed";
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
	}

	@Override
	public String Logout() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
