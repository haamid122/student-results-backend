package Studentapi.Studentresults.Controller;

import Studentapi.Studentresults.DTO.Markdto;
import Studentapi.Studentresults.Entity.MarkEntity;
import Studentapi.Studentresults.Service.Markserviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class MarkController {
    @Autowired
    private Markserviceimpl markserviceimpl;

    @PostMapping("/addmark")
    public MarkEntity Markapi(@RequestBody Markdto markdto){
        return markserviceimpl.Addmarklogic(markdto);
    }
    //e=>dto=> reg
    @GetMapping("/display-mark/{reg}")
    public List<Markdto>  Markdisplayapi(@PathVariable(name = "reg") String reg){
        return markserviceimpl.Displaylogic(reg);
    }
    @GetMapping("/display-all-mark")
    public List<Markdto>  Markdisplayallapi(){
        return markserviceimpl.DisplayallLogic();
    }
}
