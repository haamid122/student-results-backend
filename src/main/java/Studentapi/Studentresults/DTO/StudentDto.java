package Studentapi.Studentresults.DTO;

public class StudentDto {
    private String reg;
    private String name;
    private String password;
    private String year;
    private String clg;

    public StudentDto() {
    }

    public StudentDto(String reg, String name, String password, String year, String clg) {
        this.reg = reg;
        this.name = name;
        this.password = password;
        this.year = year;
        this.clg = clg;
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
