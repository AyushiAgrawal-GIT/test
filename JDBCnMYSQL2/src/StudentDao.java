import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDao {

	public int addStudent(Student m, String sql) throws ClassNotFoundException, SQLException {
		int i = 0;
		Connection con = null ;	
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","Jan_2019");  
		System.out.println("CONNECTED");
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, m.getName());
		pst.setInt(2, m.getRoll());
		i  = pst.executeUpdate();
		System.out.println(i+ "rows updated");
		return i;
		
		
	}

}
