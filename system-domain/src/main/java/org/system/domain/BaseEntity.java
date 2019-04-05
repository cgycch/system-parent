package org.system.domain;

public class BaseEntity {
	private String name;
	private String phone;

	public BaseEntity(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
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

	@Override
	public String toString() {
		return "BaseEntity [name=" + name + ", phone=" + phone + "]";
	}

}
