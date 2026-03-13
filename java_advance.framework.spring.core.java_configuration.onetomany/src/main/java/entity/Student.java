package entity;

import java.io.Serializable;
import java.util.Objects;


public class Student implements Serializable {
	private Integer id;
	private String name;
	private String mailid;
	private Long contactNumber;
	private Project[] projects;
	
	public Student() {
	}

	public Student(Integer id, String name, String mailid, Long contactNumber, Project[] projects) {
		this.id = id;
		this.name = name;
		this.mailid = mailid;
		this.contactNumber = contactNumber;
		this.projects = projects;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	
	public Project[] getProjects() {
		return projects;
	}

	public void setProjects(Project[] projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mailid=" + mailid + ", contactNumber=" + contactNumber + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(contactNumber, id, mailid, name, projects);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(contactNumber, other.contactNumber) && Objects.equals(id, other.id)
				&& Objects.equals(mailid, other.mailid) && Objects.equals(name, other.name)
				&& Objects.equals(projects, other.projects);
	}

	
	
	
	
}
