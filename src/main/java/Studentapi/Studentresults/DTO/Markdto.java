package Studentapi.Studentresults.DTO;

public class Markdto {
    private String reg;
    private String name;
    private String subjectcode;
    private String subject;
    private String grade;
    private String mark;
    private String result;
//constructor ,get and set ,default constructor
    public Markdto(String reg, String name, String subjectcode, String subject, String grade, String mark, String result) {
        this.reg = reg;
        this.name = name;
        this.subjectcode = subjectcode;
        this.subject = subject;
        this.grade = grade;
        this.mark = mark;
        this.result = result;
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

    public String getSubjectcode() {
        return subjectcode;
    }

    public void setSubjectcode(String subjectcode) {
        this.subjectcode = subjectcode;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Markdto() {
    }
}
