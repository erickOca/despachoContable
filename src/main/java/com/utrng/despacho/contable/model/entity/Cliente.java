package com.utrng.despacho.contable.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcliente;

    private String nombre;
    private String rfc;

    private String claveCiecf;
    private String contraseniaFiel;
    private String actividadEconomica;
    private String clientecol;

    private String contraseniaSellos;

    private String contraseniaImss;

    @ManyToOne
    @JoinColumn(name = "idContador")
    private Contador contador;

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public Contador getContador() {
        return contador;
    }

    public void setContador(Contador contador) {
        this.contador = contador;
    }

    public String getClaveCiecf() {
        return claveCiecf;
    }

    public void setClaveCiecf(String claveCiecf) {
        this.claveCiecf = claveCiecf;
    }

    public String getContraseniaFiel() {
        return contraseniaFiel;
    }

    public void setContraseniaFiel(String contraseniaFiel) {
        this.contraseniaFiel = contraseniaFiel;
    }

    public String getActividadEconomica() {
        return actividadEconomica;
    }

    public void setActividadEconomica(String actividadEconomica) {
        this.actividadEconomica = actividadEconomica;
    }

    public String getClientecol() {
        return clientecol;
    }

    public void setClientecol(String clientecol) {
        this.clientecol = clientecol;
    }

    public String getContraseniaSellos() {
        return contraseniaSellos;
    }

    public void setContraseniaSellos(String contraseniaSellos) {
        this.contraseniaSellos = contraseniaSellos;
    }

    public String getContraseniaImss() {
        return contraseniaImss;
    }

    public void setContraseniaImss(String contraseniaImss) {
        this.contraseniaImss = contraseniaImss;
    }
}