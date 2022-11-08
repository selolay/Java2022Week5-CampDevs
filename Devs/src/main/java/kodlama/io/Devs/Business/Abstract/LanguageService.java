package kodlama.io.Devs.Business.Abstract;

import kodlama.io.Devs.Business.request.language.CreateLanguageRequest;
import kodlama.io.Devs.Business.request.language.DeleteLanguageRequest;
import kodlama.io.Devs.Business.request.language.UpdateLanguageRequest;
import kodlama.io.Devs.Business.response.GetAllLanguagesResponse;
import kodlama.io.Devs.Entities.Language;

import java.util.List;

public interface LanguageService {
    List<GetAllLanguagesResponse> getAll();
    Language getById(int id);
    void add(CreateLanguageRequest createLanguageRequest);
    void delete(DeleteLanguageRequest deleteLanguageRequest);
    void update(UpdateLanguageRequest updateLanguageRequest);

    boolean Check(Language language) ;
}
