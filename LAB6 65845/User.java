import java.io.Serializable;

public class User implements Serializable {
    private String firstname;
    private String lastname;
    private String birthdate;
    private double salary;
    private String gender; 
    private String division;
    private String workPosition;

    public User(String firstname, String lastname, String birthdate, double salary, String gender, String division, String workPosition) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.salary = salary;
        this.gender = gender;
        this.division = division;
        this.workPosition = workPosition;
    }

    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }

    public String getBirthdate() { return birthdate; }
    public void setBirthdate(String birthdate) { this.birthdate = birthdate; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getDivision() { return division; }
    public void setDivision(String division) { this.division = division; }

    public String getWorkPosition() { return workPosition; }
    public void setWorkPosition(String workPosition) { this.workPosition = workPosition; }
}
