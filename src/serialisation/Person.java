package serialisation;

import java.io.Serializable;

public class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4841958884456811087L;
	private String firstName;
	private String lastName;
	private String birthDay;

	public Person(String... personInfo) {
		this.firstName = personInfo[0];
		this.lastName = personInfo[1];
		this.birthDay = personInfo[2];
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	
	

}
