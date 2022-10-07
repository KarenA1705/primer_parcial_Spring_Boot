package com.examen.procesos.negocios.controllers;

import com.examen.procesos.negocios.models.Articulo;
import com.examen.procesos.negocios.repository.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class articuloController {

    @Autowired
    private ArticuloRepository articuloRepository;

    @GetMapping("/articulo/codigo/{codigo}")
    public ResponseEntity getArticuloCodigo(@PathVariable String codigo)
    {
        List<Articulo> articulo = articuloRepository.findAllByCodigoArticulo(codigo);
        if(articulo.isEmpty())
        {
            return ResponseEntity.notFound().build();
        }
        return new ResponseEntity(articulo, HttpStatus.OK);

    }


}
