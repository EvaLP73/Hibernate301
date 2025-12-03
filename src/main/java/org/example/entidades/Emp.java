package org.example.entidades;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "emps")
public class Emp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_emp")
    private long id;
    @NonNull
    private String nombre;
    @NonNull
    private String puesto;
    @NonNull
    private double sueldo;
    @NonNull
    private int edad;
    @NonNull
    private String DNI;
    @NonNull
    private boolean esJefe;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "dpto_id")
    private Dpto dptoElement;
}