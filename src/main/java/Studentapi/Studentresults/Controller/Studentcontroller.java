package Studentapi.Studentresults.Controller;

import Studentapi.Studentresults.DTO.StudentDto;
import Studentapi.Studentresults.Entity.StudentEntity;
import Studentapi.Studentresults.Service.Studentserviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//store and check => login

@CrossOrigin//=>b=>f
@RestController
public class Studentcontroller {
    @Autowired
    private Studentserviceimpl studentserviceimpl;//impl

    @PostMapping("/student-register")
    public StudentEntity RegisterApi(@RequestBody StudentDto studentDto){
        return  studentserviceimpl.Regsiterlogic(studentDto);
    }

    @PostMapping(path = "/Login")
    public ResponseEntity<String>   LoginApi(@RequestBody StudentDto studentDto){
        if(studentserviceimpl.Loginlogic(studentDto.getReg(),studentDto.getPassword()))//true=>1
        {
            return ResponseEntity.ok("Login Successful");
        }else{
            return ResponseEntity.ok("your data not present in the database");//false
        }
    }
    @GetMapping(path = "/display/{reg}")
    public List<StudentDto> DisplayStudentApi(@PathVariable(name = "reg") String reg){
        return studentserviceimpl.Displaylogic(reg);
    }
}
