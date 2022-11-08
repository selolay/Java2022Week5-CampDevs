package kodlama.io.Devs.Business.Abstract;



import kodlama.io.Devs.Business.request.subTechnology.CreateSubTechnologyRequest;
import kodlama.io.Devs.Business.request.subTechnology.DeleteSubTechnologyRequest;
import kodlama.io.Devs.Business.request.subTechnology.UpdateSubTechnologyRequest;
import kodlama.io.Devs.Business.response.GetAllSubTechnologyResponse;

import java.util.List;

public interface SubTechnologyService {
    List<GetAllSubTechnologyResponse> getAll();

    void add(CreateSubTechnologyRequest createSubTechnologyRequest);
    void delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest);
    void update(UpdateSubTechnologyRequest updateSubTechnologyRequest);

}
