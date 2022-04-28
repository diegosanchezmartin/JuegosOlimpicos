package entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "pais")

public class CountryEntity {
    @Id
    private int id_pais;
    @Column(name = "nombre_pais", nullable = false)
    private String country_name;
    @Column(name = "codigo_pais", nullable = false)
    private String country_code;
    @Column(name = "valor_pais", nullable = false)
    private int country_value;

    @OneToMany(mappedBy = "country")
    private List<CityEntity> cities = new ArrayList<>();
    ///lista de ciudades
}
