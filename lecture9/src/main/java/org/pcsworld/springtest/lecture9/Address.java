package org.pcsworld.springtest.lecture9;

public class Address {
	private String street;
	private String postCode;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [street=" + street + ", postCode=" + postCode + "]";
	}

	public Address(String street, String postCode) {
		this.street = street;
		this.postCode = postCode;
	}
}
