package com.supermercado.VentasSuperMercado.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class VentaDTO {
    //datos de la venta
    private Long id;
    private LocalDate fecha;
    private String estado;

    //datos de la sucursal
    private Long idSucursal;

    //Lista de detalles
    private List<DetalleVentaDTO> detalle;

    //total de la venta
    private Double total;

}
