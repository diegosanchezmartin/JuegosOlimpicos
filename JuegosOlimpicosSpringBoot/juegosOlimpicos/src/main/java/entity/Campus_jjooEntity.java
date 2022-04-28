package entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "sede_jjoo")
public class Campus_jjooEntity {
    @Id
    private int year;
    @Column(name = "id_tipo_jjoo", nullable = false)
    private int id_type_jjoo;
    @Column(name = "sede", nullable = false)
    private int campus;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Type_jjooEntity> types = new ArrayList<>();

    @ManyToOne
    private CountryEntity city;
}
