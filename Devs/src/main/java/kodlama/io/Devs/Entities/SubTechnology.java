package kodlama.io.Devs.Entities;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="subTechnology")


public class SubTechnology {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="subId")
    private  int subId;

    @Column(name="subName")
    private String subName;

    @ManyToOne
    @JoinColumn(name = "id")
    private Language language;


}
