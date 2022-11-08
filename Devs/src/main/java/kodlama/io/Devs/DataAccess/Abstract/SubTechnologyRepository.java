package kodlama.io.Devs.DataAccess.Abstract;


import kodlama.io.Devs.Business.request.subTechnology.UpdateSubTechnologyRequest;
import kodlama.io.Devs.Business.response.GetAllSubTechnologyResponse;
import kodlama.io.Devs.Entities.SubTechnology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubTechnologyRepository extends JpaRepository<SubTechnology,Integer> {
    void add(GetAllSubTechnologyResponse response);

    void update(UpdateSubTechnologyRequest updateSubTechnologyRequest);
}
