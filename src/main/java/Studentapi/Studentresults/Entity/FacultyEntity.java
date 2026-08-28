package Studentapi.Studentresults.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Faculty_List")
public class FacultyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String facultyid;
    private String facultyname;
    private String password;
    private String department;

    public  FacultyEntity(){

    }

    public FacultyEntity(String facultyid, String facultyname, String password, String department) {
        this.facultyid = facultyid;
        this.facultyname = facultyname;
        this.password = password;
        this.department = department;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFacultyid() {
        return facultyid;
    }

    public void setFacultyid(String facultyid) {
        this.facultyid = facultyid;
    }

    public String getFacultyname() {
        return facultyname;
    }

    public void setFacultyname(String facultyname) {
        this.facultyname = facultyname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


}
