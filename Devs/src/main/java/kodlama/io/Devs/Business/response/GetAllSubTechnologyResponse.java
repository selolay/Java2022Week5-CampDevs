package kodlama.io.Devs.Business.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllSubTechnologyResponse {//yanıt
    private int subId;
    private String subName;
}
