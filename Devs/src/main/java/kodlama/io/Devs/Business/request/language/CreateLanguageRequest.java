package kodlama.io.Devs.Business.request.language;

import kodlama.io.Devs.Business.response.GetAllLanguagesResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CreateLanguageRequest {//istek
    private String name;
}
