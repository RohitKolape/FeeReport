package admin;
import java.sql.*;
import connection.GetConnection;


public class Login_Dao_Implementation implements loginDao {

	private static String login_admin = "select * from Admin1 where admin_name = ? and pass = ?";

	GetConnection getcon = new GetConnection();

	@Override
	public String Login(Admin admin) {
		String flag = "";
		Connection con;
		try {
			con = getcon.getConnection();
			
			PreparedStatement pst = con.prepareStatement(login_admin);
			pst.setString(1, admin.getName());
			pst.setString(2, admin.getPassword());
			
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
