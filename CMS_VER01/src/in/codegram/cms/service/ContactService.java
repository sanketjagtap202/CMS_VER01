package in.codegram.cms.service;

import java.util.List;

import in.codegram.cms.domain.Contact;

public interface ContactService {
/**
 * addContact method will add a contact.
 * Ideally if contact is already exist, then it should throw existingContactException.
 * @param contact to be add
 */
	void addContact(Contact contact);
	List<Contact> showAllContacts();
	void removeContact(int id);
	void editContact(Contact contact);
}
