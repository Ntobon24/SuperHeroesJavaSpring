package udem.edu.co.superheroes.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.type.descriptor.jdbc.NVarcharJdbcType;

import java.util.List;

@Setter
@Getter
@Entity

@AllArgsConstructor
@NoArgsConstructor
@Table(name="SUPERHERO")

public class SuperHeroes {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idSuper;
    private String name;
    private String nickName;
    private String age;
    private String description;
    private String suitColor;
    private String photoSuper;
    @OneToMany(targetEntity = Power.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "cp_fk", referencedColumnName = "idSuper")
    private List<Power> powers;

}
