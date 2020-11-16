package test;
import java.sql.*;
import java.util.*;
public class DBCon9 {
public static void main(String a[])
{
	try {
		Scanner s=new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe");
		System.out.println("Enter bookcode:");
		String bCode=s.nextLine();
		PreparedStatement ps=con.prepareStatement("update bookdetails28 set price=2900 where bcode=?");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
