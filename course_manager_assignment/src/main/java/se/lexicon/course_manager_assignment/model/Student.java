package se.lexicon.course_manager_assignment.model;

import java.util.Objects;

public class Student {


    private int Id;
    private String name;
    private String email;
    private String address;


    public Student() {
    }

    public Student(String name, String email, String address) {

        this.name = name;
        this.email = email;
        this.address = address;
    }

    public Student(int Id, String name, String email, String address) {
        this.Id = Id;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Id == student.Id && Objects.equals(name, student.name) && Objects.equals(email, student.email) && Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name, email, address);
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
