package Studentapi.Studentresults.Service;

import Studentapi.Studentresults.DTO.Markdto;
import Studentapi.Studentresults.Entity.MarkEntity;
import Studentapi.Studentresults.Repostiory.MarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Markserviceimpl{
    @Autowired
    private MarkRepository markRepository;

    public MarkEntity Addmarklogic(Markdto markdto){
        MarkEntity store = new MarkEntity(markdto.getReg(),markdto.getName(),markdto.getSubjectcode(),markdto.getSubject(),markdto.getGrade(),markdto.getMark(),markdto.getResult());
        return markRepository.save(store);
    }

    public List<Markdto>  Displaylogic(String reg){
        List<MarkEntity> getdata= markRepository.findByReg(reg);
        List<Markdto>  transfer= new ArrayList<>();
        for(MarkEntity getdatas:getdata){
            Markdto setdata= new Markdto();
            setdata.setReg(getdatas.getReg());
            setdata.setName(getdatas.getName());
            setdata.setSubject(getdatas.getSubject());
            setdata.setSubjectcode(getdatas.getSubjectcode());
            setdata.setGrade(getdatas.getGrade());
            setdata.setMark(getdatas.getMark());
            setdata.setResult(getdatas.getResult());
            transfer.add(setdata);
        }
        return transfer;
    }
    public List<Markdto>  DisplayallLogic(){
        List<MarkEntity> getdata= markRepository.findAll();
        List<Markdto>  transfer= new ArrayList<>();
        for(MarkEntity getdatas:getdata){
            Markdto setdata= new Markdto();
            setdata.setReg(getdatas.getReg());
            setdata.setName(getdatas.getName());
            setdata.setSubject(getdatas.getSubject());
            setdata.setSubjectcode(getdatas.getSubjectcode());
            setdata.setGrade(getdatas.getGrade());
            setdata.setMark(getdatas.getMark());
            setdata.setResult(getdatas.getResult());
            transfer.add(setdata);
        }
        return transfer;
    }

}
