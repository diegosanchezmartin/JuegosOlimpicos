package entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "ciudad")
// SCHEMA // TABLA
public class CityEntity {
    @Id
    private int id;
    @Column(name = "nombre_ciudad", nullable = false)
    private String city_name;
    @Column(name = "id_pais", nullable = false)
    private int id_country;
    @Column(name = "valor_ciudad")
    private Integer value;

    @ManyToOne
    private CountryEntity country;

    @OneToMany(mappedBy = "city")
    private List<Campus_jjooEntity> campusTimes = new ArrayList<>();
}
