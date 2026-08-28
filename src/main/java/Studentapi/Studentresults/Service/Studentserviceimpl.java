package Studentapi.Studentresults.Service;

import Studentapi.Studentresults.DTO.StudentDto;
import Studentapi.Studentresults.Entity.StudentEntity;
import Studentapi.Studentresults.Repostiory.Studentrepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Studentserviceimpl{
    @Autowired
    private Studentrepostiory studentrepostiory;//Studentr obj = new studentr();

    public StudentEntity  Regsiterlogic(StudentDto studentDto){
        StudentEntity store= new StudentEntity(studentDto.getReg(),studentDto.getName(), studentDto.getPassword(), studentDto.getYear(),studentDto.getClg());
        return studentrepostiory.save(store);// store insert
    }
//1=>true
    public boolean  Loginlogic(String reg, String password){
        Optional<StudentEntity>  check = studentrepostiory.findByRegAndPassword(reg, password);//4004,123=>1
        return check.isPresent();//1/0
    }
    public List<StudentDto>   Displaylogic(String reg){
        List<StudentEntity>  getdata= studentrepostiory.findByReg(reg);
        List<StudentDto> transfer= new ArrayList<>();
        for(StudentEntity getdatas:getdata){
            StudentDto setdata= new StudentDto();
            setdata.setReg(getdatas.getReg());
            setdata.setName(getdatas.getName());//e==> dto
            setdata.setClg(getdatas.getClg());
            setdata.setYear(getdatas.getYear());
            transfer.add(setdata);
        }
        return transfer;
    }
}
