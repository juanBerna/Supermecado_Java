package com.supermercado.VentasSuperMercado.repository;

import com.supermercado.VentasSuperMercado.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Long> {
}
