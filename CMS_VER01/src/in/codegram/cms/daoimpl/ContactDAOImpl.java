package in.codegram.cms.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.codegram.cms.dao.ContactDAO;
import in.codegram.cms.domain.Contact;
import in.codegram.cms.util.DBUtil;

public class ContactDAOImpl extends DBUtil implements ContactDAO {

	@Override
	public void save(Contact contact) {

		String sql = "insert into contacts(name,phone,email,address,grp) values (?,?,?,?,?)";
		PreparedStatement pstmt = prepareStatement(sql);

		try {
			pstmt.setString(1, contact.getName());
			pstmt.setString(2, contact.getPhone());
			pstmt.setString(3, contact.getEmail());
			pstmt.setString(4, contact.getAddress());
			pstmt.setString(5, contact.getGrp());
			pstmt.execute();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			closePreparedStatement();
		}

	}

	@Override
	public List<Contact> findAll() {
		
		String sql ="select * from contacts";
		PreparedStatement pstmt = prepareStatement(sql);
		
		List<Contact> contacts = new ArrayList<>();
		Contact contact = null;
		  try {
			ResultSet rs =  pstmt.executeQuery();
			
			while(rs.next()) {
				contact = new Contact();
				contact.setId(rs.getInt("id"));
				contact.setName(rs.getString("name"));
				contact.setPhone(rs.getString("phone"));
				contact.setEmail(rs.getString("email"));
				contact.setAddress(rs.getString("address"));
				contact.setGrp(rs.getString("grp"));
				contacts.add(contact);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return contacts;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Contact contact) {
		// TODO Auto-generated method stub

	}

}
