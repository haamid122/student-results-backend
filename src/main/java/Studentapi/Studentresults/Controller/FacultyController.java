package Studentapi.Studentresults.Controller;

import Studentapi.Studentresults.DTO.FacultyDTO;
import Studentapi.Studentresults.Entity.FacultyEntity;
import Studentapi.Studentresults.Service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class FacultyController {
    @Autowired
    private FacultyService callthelogic;
    @PostMapping("/facultyregister")
    public FacultyEntity Savethecustomer(@RequestBody FacultyDTO calltherequest){
        return callthelogic.savethefaculty(calltherequest);
    }
    @PostMapping("/faculty-Login")
    public ResponseEntity<String> Login(@RequestBody FacultyDTO calltherequest){
        if (callthelogic.Loginlogic(calltherequest.getFacultyid(), calltherequest.getPassword())){
            return ResponseEntity.ok("Login Successful");
        }
        else {
            return ResponseEntity.ok("Login Failed");
        }
    }
}
