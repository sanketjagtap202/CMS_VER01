package in.codegram.cms.serviceimpl;

import java.util.List;

import in.codegram.cms.dao.ContactDAO;
import in.codegram.cms.daoimpl.ContactDAOImpl;
import in.codegram.cms.domain.Contact;
import in.codegram.cms.service.ContactService;

public class ContactServiceImpl  implements ContactService {

	private ContactDAO contactDao;
	
	public ContactServiceImpl() {
	contactDao=new ContactDAOImpl();
	}
	
	
	
	@Override
	public void addContact(Contact contact) {
		contactDao.save(contact);
		
	}

	@Override
	public List<Contact> showAllContacts() {
		
		return contactDao.findAll();
	}

	@Override
	public void removeContact(int id) {
		contactDao.delete(id);
		
	}

	@Override
	public void editContact(Contact contact) {
		
		contactDao.update(contact);
		
	}

}
