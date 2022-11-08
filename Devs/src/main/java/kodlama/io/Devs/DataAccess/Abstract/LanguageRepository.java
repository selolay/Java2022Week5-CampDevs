package kodlama.io.Devs.DataAccess.Abstract;

import kodlama.io.Devs.Business.request.language.UpdateLanguageRequest;
import kodlama.io.Devs.Entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LanguageRepository extends JpaRepository<Language,Integer> {
    void update(UpdateLanguageRequest updateLanguageRequest);

}
