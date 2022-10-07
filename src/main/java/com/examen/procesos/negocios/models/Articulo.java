package com.examen.procesos.negocios.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@Table(name = "articulo")

public class Articulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 20, nullable = false, unique = true)
    private String codigo;
    @Column(length = 100, nullable = false)
    private String nombre;
    @Column(nullable = false)
    private Date fecha_registro;

    @ManyToOne
    @JoinColumn(name = "categorias_id_ctg")
    private Categoria categoria;

    @Column(nullable = false)
    private int stock;
    @Column(nullable = false,scale = 2)
    private Double precio_venta;
    @Column(nullable = false,scale = 2)
    private Double precio_compra;

}
