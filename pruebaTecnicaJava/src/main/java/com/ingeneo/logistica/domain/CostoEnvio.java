package com.ingeneo.logistica.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(schema="public", name="COSTO_DE_ENVIO")
public class CostoEnvio {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_costoEnvio;

    @NotNull
    @Column(name="costoEnvio")
    private Float costoEnvio;

    public Float getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(Float costoEnvio) {
        this.costoEnvio = costoEnvio;
    }


}
