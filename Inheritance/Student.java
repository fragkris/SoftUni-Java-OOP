package Inheritance;

public class Student extends Person {
    private String school;

    public Student(String name, String address) {
        super(name, address);
        this.school = null;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
