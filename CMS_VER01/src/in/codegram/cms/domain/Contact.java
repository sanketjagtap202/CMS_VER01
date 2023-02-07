package in.codegram.cms.domain;

/**
 * Contact domain is used as a data transfer object between layers.
 * 
 * @author USER
 *
 */
public class Contact {
	/**
	 * id of contact. its a primery kek (PK)
	 */
	private int id;
	/**
	 * name of contact, should not be blank
	 */
	private String name;
	/**
	 * phone of the contact
	 */
	private String phone;
	/**
	 * email of the contact.
	 */
	private String email;
	/**
	 * address of the contact
	 */
	private String address;
	/**
	 * group of the contact to which he is belonging
	 */
	private String grp;

	/**
	 * setter and getters of above variables;
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGrp() {
		return grp;
	}

	public void setGrp(String grp) {
		this.grp = grp;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", address=" + address
				+ ", grp=" + grp + "]";
	}
	
	

}
