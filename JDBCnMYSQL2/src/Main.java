import java.sql.SQLException;



public class Main {

	public static void main(String[] p) throws ClassNotFoundException, SQLException
	{
	Student m = new Student();
	String name = "jaaa";
	int roll = 10;
	String sql = "insert into Student values(?,?)";
	m.setName(name);
	m.setRoll(roll);
	
	StudentDao dao = new StudentDao();
	
	try {
		int i = dao.addStudent(m, sql);
		if(i!=0)
		{
			System.out.print("VALUES INSETED");
		}
		else
		{
			System.out.print("VALUES NOT INSETED");
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
