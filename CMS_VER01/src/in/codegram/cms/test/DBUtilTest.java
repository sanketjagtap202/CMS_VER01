package in.codegram.cms.test;

import java.sql.PreparedStatement;
import in.codegram.cms.util.DBUtil;

public class DBUtilTest {

	public static void main(String[] args) {

		DBUtil dbUtil = new DBUtil();
		// 5. Execute a Querry
		String sql = "insert into contacts(name,phone,email,address,grp) values (?,?,?,?,?)";
		PreparedStatement pstmt = dbUtil.prepareStatement(sql);
		
		try {
			
			pstmt.setString(1, "Steve Mark");
			pstmt.setNString(2, "856958674");
			pstmt.setString(3, "steve@gmail.com");
			pstmt.setString(4, "Punjab");
			pstmt.setString(5, "Family");
			pstmt.execute();
			System.out.println("Contact Added Successfully");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			dbUtil.closePreparedStatement();
			
		}

	}

}
