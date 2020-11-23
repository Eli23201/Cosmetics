package org.eli.brito.repository;

import org.eli.brito.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosRepository extends JpaRepository<Producto, Integer> {

}
