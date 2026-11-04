package com.supermercado.VentasSuperMercado.repository;

import com.supermercado.VentasSuperMercado.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
