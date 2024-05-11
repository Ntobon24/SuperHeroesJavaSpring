package udem.edu.co.superheroes.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="POWER")
public class Power {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idPower;
    private String name;
    private String description;

}
