package entity;

import java.io.Serializable;
import java.util.Objects;

public class Project implements Serializable {

    private Integer id;
    private String name;
    private String description;
    private Student[] students;

    public Project() {
    }

    public Project(Integer id, String name, String description, Student[] students) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.students = students;
    }

    public Integer getId() {
        return id;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Project [id=" + id + ", name=" + name + ", description=" + description + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Project other = (Project) obj;
        return Objects.equals(description, other.description) &&
               Objects.equals(id, other.id) &&
               Objects.equals(name, other.name);
    }
}