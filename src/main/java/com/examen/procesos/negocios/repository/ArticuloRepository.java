package com.examen.procesos.negocios.repository;

import com.examen.procesos.negocios.models.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticuloRepository extends JpaRepository<Articulo, String> {

    List<Articulo> findAllByCodigoArticulo(String codigo);


}
