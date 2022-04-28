package entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "tipo_jjoo")

public class Type_jjooEntity {
    @Id
    private int id_tipo_jjoo;
    @Column(name = "descripcion_tipo", nullable = false)
    private String type_description;

    @ManyToMany(mappedBy = "types")
    private List<Campus_jjooEntity> campus_jjoo = new ArrayList<>();
}
