package org.pcsworld.springtest.lecture9;

public class Person {
	private int id;
	private String name;
	private int taxId;
	private Address address;
 /**
	 * @return the taxId
	 */
	public int getTaxId() {
		return taxId;
	}
	/**
	 * @param taxId the taxId to set
	 */
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}
public Person() {
 }
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}



public void speak() {
	 System.out.println("Hello, I am a person");
	 
 }
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + "]";
}
/**
 * @param address the address to set
 */
public void setAddress(Address address) {
	this.address = address;
}

   
}
