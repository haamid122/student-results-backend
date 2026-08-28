package Studentapi.Studentresults.Service;

import Studentapi.Studentresults.DTO.FacultyDTO;
import Studentapi.Studentresults.Entity.FacultyEntity;
import Studentapi.Studentresults.Repostiory.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FacultyService {
    @Autowired
    private FacultyRepository callthequerylogic;

    public FacultyEntity savethefaculty(FacultyDTO callthefrontendinformation) {
        FacultyEntity savethedata = new FacultyEntity(callthefrontendinformation.getFacultyid(),callthefrontendinformation.getFacultyname(),callthefrontendinformation.getPassword(),callthefrontendinformation.getDepartment());
        return callthequerylogic.save(savethedata);
    }
        public boolean Loginlogic(String facultyid,String password){
            Optional<FacultyEntity> check=callthequerylogic.findByFacultyidAndPassword(facultyid,password);
            return check.isPresent();
        }
}

