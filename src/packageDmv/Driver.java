package packageDmv;

import java.sql.Date;

public class Driver {
	
	
	private String Liesence;
	
	private	Date DOB;
	
	private	String name;
	
	private	String address;
	
	private	int age;

	public String getLiesence() {
		return Liesence;
	}

	public void setLiesence(String liesence) {
		Liesence = liesence;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "\nDriver [Liesence=" + Liesence + ", DOB=" + DOB + ", name=" + name + ", address=" + address + ", age="
				+ age + "]";
	}

	public void setDOB(int i, int j, int k) {
		// TODO Auto-generated method stub
		
	}

	public char[] getDateOfBirth() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
	
