package Studentapi.Studentresults.Repostiory;

import Studentapi.Studentresults.Entity.MarkEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarkRepository extends JpaRepository<MarkEntity,Long> {
    List<MarkEntity> findByReg(String reg);
}
