package in.codegram.cms.util;

import java.util.List;
import java.util.Scanner;

import in.codegram.cms.domain.Contact;
import in.codegram.cms.service.ContactService;
import in.codegram.cms.serviceimpl.ContactServiceImpl;

public class ContactMenu {
	
	ContactService contactservice;
	public ContactMenu() {
	contactservice = new ContactServiceImpl();
	}

	public void start() {
		Scanner sc = new Scanner(System.in);
		String contiChoice;

		do {
			showMenu();
			System.out.println("Enter yur choice: ");
			int menuChoice = sc.nextInt();
			switch (menuChoice) {
			case 1:
				createContact(sc);
				break;
			case 2:
				showContacts();
			break;
			case 3:
				System.out.println("Delete Contact");
				break;
			case 4:
				System.out.println("Update Contact Details:");
				break;
			case 0:
				System.out.println("Thanks for Visiting!!!");
				System.exit(0);

			default:
				System.out.println("Wrong choice");
				break;
			}

			System.out.println("Do you want to continue:(yes/no)");
			contiChoice = sc.next();

		} while (contiChoice.equals("yes"));
	}

	private void showContacts() {
		System.out.println("List of Contact Details:");
List<Contact> contacts =	contactservice.showAllContacts();
		for (Contact contact : contacts) {
			System.out.println(contact);
		}
	}

	private void createContact(Scanner sc) {
		System.out.println("Enter Contact details below");
		Contact contact = new Contact();
		System.out.println("Enter Name");
		contact.setName(sc.next());
		System.out.println("Enter Phone");
		contact.setPhone(sc.next());
		System.out.println("Enter Email");
		contact.setEmail(sc.next());
		System.out.println("Enter address");
		contact.setAddress(sc.next());
		System.out.println("Enter group");
		contact.setGrp(sc.next());
		contactservice.addContact(contact);
		System.out.println("Success!! Contact added.");
	}

	private void showMenu() {

		System.out.println("-----Contact Main Menu------");
		System.out.println("1.Add Contact");
		System.out.println("2.List Contact");
		System.out.println("3.Delete Contact");
		System.out.println("4.Update Contact");

	}

}
