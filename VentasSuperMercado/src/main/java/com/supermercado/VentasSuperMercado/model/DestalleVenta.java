package com.supermercado.VentasSuperMercado.model;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DestalleVenta {
    private Long id;
    private Integer cantidad;
    private Double precio;

    // Relacion de detalle del producto con la venta
    @ManyToOne
    private Venta venta;

    //Relacion de detalle con el producto
    @ManyToOne
    private Producto producto;

}
