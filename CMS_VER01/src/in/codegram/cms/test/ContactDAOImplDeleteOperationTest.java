package in.codegram.cms.test;

import java.util.List;

import in.codegram.cms.dao.ContactDAO;
import in.codegram.cms.daoimpl.ContactDAOImpl;
import in.codegram.cms.domain.Contact;

/**
 * This class will delete the methods in ContactDAOImpl class
 * 
 * @author USER
 *
 */
public class ContactDAOImplDeleteOperationTest {

	public static void main(String[] args) {

		ContactDAO contactDAO = new ContactDAOImpl(); // Animal-dog concept in oops

			contactDAO.delete(32);
			System.out.println("Contact deleted Successfully!!!!");

	}

}
