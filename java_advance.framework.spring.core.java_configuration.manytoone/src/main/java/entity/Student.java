package entity;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {

    private Integer id;
    private String name;
    private String mailid;
    private Long contactNumber;
    private Project project;

    public Student() {}

    public Student(Integer id, String name, String mailid, Long contactNumber, Project project) {
        this.id = id;
        this.name = name;
        this.mailid = mailid;
        this.contactNumber = contactNumber;
        this.project = project;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMailid() {
        return mailid;
    }

    public Long getContactNumber() {
        return contactNumber;
    }

    public Project getProject() {
        return project;
    }

    @Override
    public String toString() {
        return "Student [id=" + id +
               ", name=" + name +
               ", mailid=" + mailid +
               ", contactNumber=" + contactNumber +
               ", project=" + project + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactNumber, id, mailid, name, project);
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
        return Objects.equals(contactNumber, other.contactNumber) &&
               Objects.equals(id, other.id) &&
               Objects.equals(mailid, other.mailid) &&
               Objects.equals(name, other.name) &&
               Objects.equals(project, other.project);
    }
}