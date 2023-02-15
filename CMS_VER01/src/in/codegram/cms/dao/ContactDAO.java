package in.codegram.cms.dao;

import java.util.List;

import in.codegram.cms.domain.Contact;

/**
 * This ContactDAO will perform all the CRUD Operations on Contact
 * 
 * @author USER
 */

public interface ContactDAO {

	/**
	 * save() method will save the given contact to DB
	 * 
	 * @param contact to be saved
	 */
	void save(Contact contact);

	/**
	 * This findAll() method will return all the contacts from DB.
	 * 
	 * @return List of contacts if Found, otherwise null
	 */

	List<Contact> findAll();

	/**
	 * This delete() method will delete a contact from DB based on id.
	 * 
	 * @param id of the Contact to be deleted.
	 */

	void delete(int id);

	/**
	 * This update() method will update provided detail of contact
	 * 
	 * @param contact to be updated
	 */

	void update(Contact contact);

}
