package com.supermercado.VentasSuperMercado.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fecha;
    private String estado;
    private Double total;

    //estamos verificando que puede tener muchas ventas una sucursal
    @ManyToOne
    private  Sucursal sucursal;

    @OneToMany(mappedBy = "venta")
    private List<DestalleVenta> detalle = new ArrayList<>();
}
