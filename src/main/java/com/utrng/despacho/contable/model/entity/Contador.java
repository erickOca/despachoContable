package com.utrng.despacho.contable.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "contadores")
public class Contador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContador;

    private String nombre;

    public int getIdContador() {
        return idContador;
    }

    public void setIdContador(int idContador) {
        this.idContador = idContador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
