package kodlama.io.Devs.Business.Concrete;

import kodlama.io.Devs.Business.Abstract.SubTechnologyService;
import kodlama.io.Devs.Business.request.subTechnology.CreateSubTechnologyRequest;
import kodlama.io.Devs.Business.request.subTechnology.DeleteSubTechnologyRequest;
import kodlama.io.Devs.Business.request.subTechnology.UpdateSubTechnologyRequest;
import kodlama.io.Devs.Business.response.GetAllSubTechnologyResponse;
import kodlama.io.Devs.DataAccess.Abstract.SubTechnologyRepository;
import kodlama.io.Devs.Entities.SubTechnology;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SubTechnologyManager implements SubTechnologyService {

    private SubTechnologyRepository subTechnologyRepository;

    public SubTechnologyManager(SubTechnologyRepository subTechnologyRepository) {
        this.subTechnologyRepository = subTechnologyRepository;

    }

    List<SubTechnology> subTechnologies= subTechnologyRepository.findAll();


    @Override
    public List<GetAllSubTechnologyResponse> getAll() {
        List<GetAllSubTechnologyResponse> subTechnologyResponse= new ArrayList<GetAllSubTechnologyResponse>();

        for(SubTechnology subTechnology :subTechnologyRepository.findAll()){
            GetAllSubTechnologyResponse response = new GetAllSubTechnologyResponse();
            response.setSubId(subTechnology.getSubId());
            response.setSubName(subTechnology.getSubName());

            subTechnologyResponse.add(response);
        }
        return subTechnologyResponse;
    }
    SubTechnology subTechnology= new SubTechnology();
    @Override
    public void add(CreateSubTechnologyRequest createSubTechnologyRequest) {

        subTechnology.setSubName(createSubTechnologyRequest.getName());
        this.subTechnologyRepository.save(null);

    }

    @Override
    public void delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest) {
        subTechnologyRepository.deleteById(deleteSubTechnologyRequest.getSubId());
    }

    @Override
    public void update(UpdateSubTechnologyRequest updateSubTechnologyRequest) {
        for(SubTechnology technology: subTechnologies){
            if(subTechnology.getSubId()==technology.getSubId()){
                technology.setSubName(subTechnology.getSubName());
            }
        }


        subTechnologyRepository.update(updateSubTechnologyRequest);
    }
}
