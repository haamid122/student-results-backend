package Studentapi.Studentresults.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student-register")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//12345678.....
    private Long id;//=>primary key
    private String reg;//=>class use not=>???
    private String name;
    private String password;
    private String year;
    private String clg;

    public StudentEntity(String reg, String name, String password, String year, String clg) {
        this.reg = reg;
        this.name = name;
        this.password = password;
        this.year = year;
        this.clg = clg;
    }

    public StudentEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getClg() {
        return clg;
    }

    public void setClg(String clg) {
        this.clg = clg;
    }
}
