package kodlama.io.Devs.WebApi.Controller;

import kodlama.io.Devs.Business.Abstract.SubTechnologyService;
import kodlama.io.Devs.Business.request.subTechnology.CreateSubTechnologyRequest;
import kodlama.io.Devs.Business.request.subTechnology.DeleteSubTechnologyRequest;
import kodlama.io.Devs.Business.request.subTechnology.UpdateSubTechnologyRequest;
import kodlama.io.Devs.Business.response.GetAllSubTechnologyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/language")
public class SubTechnologyController {
    private SubTechnologyService subTechnologyService;

    @Autowired
    public SubTechnologyController(SubTechnologyService subTechnologyService) {
        super();
        this.subTechnologyService = subTechnologyService;
    }

    @GetMapping("/getall")
    public List<GetAllSubTechnologyResponse> getAll(){
        return  subTechnologyService.getAll();
    }

    @PostMapping("/add")
    public void add (CreateSubTechnologyRequest createSubTechnologyRequest){
        subTechnologyService.add(createSubTechnologyRequest);
    }
    @DeleteMapping("/delete/{subId}")
    public  void delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest){
       this.subTechnologyService.delete(deleteSubTechnologyRequest);
    }
    @PutMapping("/udpate/{subId}")
    public void update(UpdateSubTechnologyRequest updateSubTechnologyRequest){
        subTechnologyService.update(updateSubTechnologyRequest);
    }
}
