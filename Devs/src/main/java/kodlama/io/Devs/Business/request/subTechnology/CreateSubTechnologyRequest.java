package kodlama.io.Devs.Business.request.subTechnology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateSubTechnologyRequest {//istek
    private String subName;
    private int id;//LANGUAGE
    private String name;//LANGUAGE
}
