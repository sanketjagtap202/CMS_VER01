package in.codegram.cms.test;

import java.util.List;

import in.codegram.cms.dao.ContactDAO;
import in.codegram.cms.daoimpl.ContactDAOImpl;
import in.codegram.cms.domain.Contact;

/**
 * This class will test the methods in ContactDAOImpl class
 * 
 * @author USER
 *
 */
public class ContactDAOImplFindAllOperationTest {

	public static void main(String[] args) {

		ContactDAO contactDAO = new ContactDAOImpl(); // Animal-dog concept in oops

	List<Contact> contacts =	contactDAO.findAll();
	
	for (Contact contact : contacts) {
		
		System.out.println(contact);
	}

	}

}
