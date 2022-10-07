package com.examen.procesos.negocios.controllers;

import com.examen.procesos.negocios.repository.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class articuloController {

    @Autowired
    private ArticuloRepository articuloRepository;

}
