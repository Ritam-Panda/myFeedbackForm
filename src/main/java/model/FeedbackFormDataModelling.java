package model;
import java.sql.*;

public class FeedbackFormDataModelling {
	static final String jdbc_driver ="com.mysql.cj.jdbc.Driver";
	static final String db_url = "jdbc:mysql://127.0.0.1:3306/feed";
	static final String user="root";
	static final String pass="@Ritam69";
	
public void insertFeedbackData(Feedback f ) {
	Connection conn = null;
	Statement stmt = null; 
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(db_url,user,pass);
		stmt = conn.createStatement(); 
		
		String sql =String.format("insert into feedback values ( '%s','%s','%s' )", f.getName(), f.getContactno(), f.getFeedback()); 
		stmt.executeUpdate(sql);
		
		stmt.close();
		conn.close();
		System.out.println("connection established"+f.getName());	
		}
	catch(SQLException se) {
		se.printStackTrace();                                                
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		
	}
}
public void selectFeedbackData(String contactno)  {
	Connection conn = null;
	Statement stmt = null; 
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(db_url,user,pass);
		stmt = conn.createStatement(); 
		
		String sql = "select * from feedback where contactno='"+contactno+"'"; 
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println("name is"+rs.getString("fullname"));
		}
		}
	catch(SQLException se) {
		se.printStackTrace();
	}
	catch(Exception e) {
		e.printStackTrace(); 
	}
	finally {
		
	}
}
}

