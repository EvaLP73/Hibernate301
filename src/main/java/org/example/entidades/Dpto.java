package org.example.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name="dptos")
public class Dpto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dpto_id")
    private int id;
    @NonNull
    private String nombre;
    @NonNull
    private String localidad;

    @OneToMany(mappedBy = "dptoElement", cascade = CascadeType.ALL)
    private List<Emp> empts = new ArrayList<Emp>();

    public void addEmps(Emp emp) {
        this.empts.add(emp);
        emp.setDptoElement(this);
    }
}
