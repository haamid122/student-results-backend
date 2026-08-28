package Studentapi.Studentresults.Repostiory;

import Studentapi.Studentresults.Entity.FacultyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FacultyRepository extends JpaRepository<FacultyEntity,Long> {
        Optional<FacultyEntity> findByFacultyidAndPassword(String facultyid, String password);


}
