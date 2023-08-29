package com.utrng.despacho.contable.controller;

import com.utrng.despacho.contable.model.entity.Contador;
import com.utrng.despacho.contable.service.ContadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contadores")
public class ContadorController {

    @Autowired
    private ContadorService contadorService;

    @PostMapping("/newC")
    public ResponseEntity<Contador> createContador(@RequestParam String nombre) {
        Contador nuevoContador = contadorService.createContador(nombre);
        return new ResponseEntity<>(nuevoContador, HttpStatus.CREATED);
    }
}
