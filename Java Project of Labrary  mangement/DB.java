import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	public static Connection getConnection()
	{
		Connection con=null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","mysql");
			if (con==null)
			{
				System.out.println("TRY");
				
			}
			else
			{
				System.out.println("Done");
			}
		}catch(Exception e){System.out.println(e);}
		return con;
	}

}
