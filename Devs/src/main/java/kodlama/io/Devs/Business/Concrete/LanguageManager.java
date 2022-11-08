package kodlama.io.Devs.Business.Concrete;

import kodlama.io.Devs.Business.Abstract.LanguageService;
import kodlama.io.Devs.Business.request.language.CreateLanguageRequest;
import kodlama.io.Devs.Business.request.language.DeleteLanguageRequest;
import kodlama.io.Devs.Business.request.language.UpdateLanguageRequest;
import kodlama.io.Devs.Business.response.GetAllLanguagesResponse;
import kodlama.io.Devs.DataAccess.Abstract.LanguageRepository;
import kodlama.io.Devs.Entities.Language;


import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;

    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    List<Language>  languages= languageRepository.findAll();


    @Override
    public List<GetAllLanguagesResponse> getAll() {
        List<GetAllLanguagesResponse> languagesResponse= new ArrayList<GetAllLanguagesResponse>();

        for (Language language : languageRepository.findAll()) {
            GetAllLanguagesResponse  responseItem= new GetAllLanguagesResponse();
            responseItem.setId(language.getId());
            responseItem.setName(language.getName());


            languagesResponse.add(responseItem);
        }
        return  languagesResponse;

    }

    @Override
    public Language getById(int id) {
        return languageRepository.getReferenceById(id);
    }



    @Override
    public void add(CreateLanguageRequest createLanguageRequest) {
        Language language= new Language();
        if(!CheckName(createLanguageRequest.getName())){
            language.setName(createLanguageRequest.getName());
            this.languageRepository.save(null);
        }

    }

    @Override
    public void delete(DeleteLanguageRequest deleteLanguageRequest) {
        languageRepository.deleteById(deleteLanguageRequest.getId());
    }

    @Override
    public void update(UpdateLanguageRequest updateLanguageRequest) {

        for(Language lang : languages){
            if(updateLanguageRequest.getId()==lang.getId()){
                lang.setName(updateLanguageRequest.getName());
            }
        }
        languageRepository.update(updateLanguageRequest);

    }





    @Override
    public boolean Check(Language language)  {
        if(!CheckName(language.getName())){
            return false;
        }
        if(!CheckId(language.getId())){
            return false;
        }

        return true;
    }

    public boolean CheckId(int id){

        for(Language langId: languageRepository.findAll()){
            if(langId.getId()==id){
                return false;
            }
        }
        return true;
    }
    public boolean CheckName(String language){
        for (Language lang : languageRepository.findAll()) {

            if (language.isEmpty()) {
                return false;
            }
            if (lang.getName().equalsIgnoreCase(language)) {
                return false;
            }
        }
        return true;
    }
}