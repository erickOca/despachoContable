package com.utrng.despacho.contable.service;

import com.utrng.despacho.contable.model.entity.Contador;
import com.utrng.despacho.contable.model.repository.ContadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContadorServiceImpl implements ContadorService {

    @Autowired
    private ContadorRepository contadorRepository;

    @Override
    public Contador createContador(String nombre) {
        Contador contador = new Contador();
        contador.setNombre(nombre);
        return contadorRepository.save(contador);
    }
}
