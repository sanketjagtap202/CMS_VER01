package in.codegram.cms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * DBUtil Class is used for performing DB related operations like getting
 * connection, preparedStatement, & releasing resources
 * 
 * @author USER
 *
 */

public class DBUtil {

	// 1. Gather DB Information

	private String url = "jdbc:mysql://localhost/cmsdb";
	private String user = "root";
	private String password = "admin";

	// 2. Register Driver and Load Driver & // 3. Create Connection Object

	String driverClassName = "com.mysql.cj.jdbc.Driver";
	private Connection conn = null;
	private PreparedStatement pstmt = null;

/**
 * Connect is a helper method to give the connection object for preparedStatement Object	
 * @return conn object
 */
	
	private Connection connect() {

		try {

			Class c = Class.forName(driverClassName);
			conn = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return conn;
	}

	// 4. Create a preparedStatement Using conn

/**
 * This will give the preparedStatement object for executing the sql Statement	
 * @param sql is the sql query that you want to execute in Database
 * @return preparedStatement object that will be execute on client end
 */
	
	public PreparedStatement prepareStatement(String sql) {

		try {
			pstmt = connect().prepareStatement(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return pstmt;
	}

	// 6. Close Resources

/**
 * This will release the resources like preparedStatement & connection both	
 */
	
	public void closePreparedStatement() {
		try {
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
