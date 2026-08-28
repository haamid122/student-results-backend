package Studentapi.Studentresults.Repostiory;
//=>jpa=> query

import Studentapi.Studentresults.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface Studentrepostiory extends JpaRepository<StudentEntity,Long> {
    //save, findall,findbyid
    //orm=>table method
    // Optional=> true //false
    Optional<StudentEntity>  findByRegAndPassword(String reg,String password);//select *from StudentEntity where reg=? and password=?;
List<StudentEntity> findByReg(String reg);
}
