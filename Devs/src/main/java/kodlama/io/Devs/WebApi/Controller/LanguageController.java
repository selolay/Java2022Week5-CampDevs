package kodlama.io.Devs.WebApi.Controller;

import kodlama.io.Devs.Business.Abstract.LanguageService;
import kodlama.io.Devs.Business.request.language.CreateLanguageRequest;
import kodlama.io.Devs.Business.request.language.DeleteLanguageRequest;
import kodlama.io.Devs.Business.request.language.UpdateLanguageRequest;
import kodlama.io.Devs.Business.response.GetAllLanguagesResponse;
import kodlama.io.Devs.Entities.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/language")
public class LanguageController {

    private LanguageService languageService;

    @Autowired
    public LanguageController(LanguageService languageService) {
        super();
        this.languageService = languageService;
    }


    @GetMapping("/getall")
    public List<GetAllLanguagesResponse> getAll() {
        return languageService.getAll();
    }

    @PostMapping("/add")
    public void add(CreateLanguageRequest createLanguageRequest) {
        languageService.add(createLanguageRequest);
    }

    @GetMapping("/getById/{id}")
    public Language getById(@PathVariable int id) {
        return languageService.getById(id);
    }



    @DeleteMapping("/delete/{id}")
    public void delete(DeleteLanguageRequest deleteLanguageRequest) {
        this.languageService.delete(deleteLanguageRequest);
    }

    @PutMapping("/update/{id}")
    public void update(UpdateLanguageRequest updateLanguageRequest) {
        languageService.update(updateLanguageRequest);
    }
}
