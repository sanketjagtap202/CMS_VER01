package in.codegram.cms.test;

import in.codegram.cms.dao.ContactDAO;
import in.codegram.cms.daoimpl.ContactDAOImpl;
import in.codegram.cms.domain.Contact;

/**
 * This class will test the methods in ContactDAOImpl class
 * 
 * @author USER
 *
 */
public class ContactDAOImplTest {

	public static void main(String[] args) {

		ContactDAO contactDAO = new ContactDAOImpl(); // Animal-dog concept in oops

		Contact contact = new Contact();
		contact.setName("Param Sharma");
		contact.setPhone("989898787");
		contact.setEmail("param@gmail.com");
		contact.setAddress("Nagpur");
		contact.setGrp("Bussiness");
		contactDAO.save(contact);
		System.out.println("Success!! Contact saved successfully!!");

	}

}
