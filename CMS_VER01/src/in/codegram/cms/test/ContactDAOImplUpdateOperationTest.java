package in.codegram.cms.test;

import java.util.List;

import in.codegram.cms.dao.ContactDAO;
import in.codegram.cms.daoimpl.ContactDAOImpl;
import in.codegram.cms.domain.Contact;

/**
 * This class will update the methods in ContactDAOImpl class
 * 
 * @author USER
 *
 */
public class ContactDAOImplUpdateOperationTest {

	public static void main(String[] args) {

		ContactDAO contactDAO = new ContactDAOImpl(); // Animal-dog concept in oops

		Contact contact = new Contact();
		contact.setName("Virat kohli");
		contact.setAddress("Benglore");
		contact.setEmail("viratk18@gmail.com");
		contact.setId(8);
		contactDAO.update(contact);
		System.out.println("Contact updated Successfully!!!!");

	}

}
