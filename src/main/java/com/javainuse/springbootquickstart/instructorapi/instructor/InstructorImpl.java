package com.javainuse.springbootquickstart.instructorapi.instructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InstructorImpl implements Instructor {
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	

	public InstructorImpl(String id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}


	public InstructorImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	/* (non-Javadoc)
	 * @see com.javainuse.springbootquickstart.instructorapi.instructor.Instructor#toString()
	 */
	@Override
	public String toString() {
		return "Instructors [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ "]";
	}
	/* (non-Javadoc)
	 * @see com.javainuse.springbootquickstart.instructorapi.instructor.Instructor#getId()
	 */
	@Override
	public String getId() {
		return id;
	}
	/* (non-Javadoc)
	 * @see com.javainuse.springbootquickstart.instructorapi.instructor.Instructor#getFirstName()
	 */
	@Override
	public String getFirstName() {
		return firstName;
	}
	/* (non-Javadoc)
	 * @see com.javainuse.springbootquickstart.instructorapi.instructor.Instructor#getLastName()
	 */
	@Override
	public String getLastName() {
		return lastName;
	}
	/* (non-Javadoc)
	 * @see com.javainuse.springbootquickstart.instructorapi.instructor.Instructor#getEmail()
	 */
	@Override
	public String getEmail() {
		return email;
	}

}
