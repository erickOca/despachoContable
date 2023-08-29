package com.utrng.despacho.contable.model.repository;

import com.utrng.despacho.contable.model.entity.Contador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContadorRepository extends JpaRepository<Contador, Integer> {
}
