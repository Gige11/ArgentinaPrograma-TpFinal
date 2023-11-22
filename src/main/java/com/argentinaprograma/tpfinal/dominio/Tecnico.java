package com.argentinaprograma.tpfinal.dominio;

import jakarta.persistence.*;

@Entity
public class Tecnico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_tecnico;
    
    @Column
    private String nombreApellido_tecnico;

    public Tecnico() {
    }

    public Tecnico(long id_tecnico, String nombreApellido_tecnico) {
        this.id_tecnico = id_tecnico;
        this.nombreApellido_tecnico = nombreApellido_tecnico;
    }

    public long getId_tecnico() {
        return id_tecnico;
    }

    public void setId_tecnico(long id_tecnico) {
        this.id_tecnico = id_tecnico;
    }

    public String getNombreApellido_tecnico() {
        return nombreApellido_tecnico;
    }

    public void setNombreApellido_tecnico(String nombreApellido_tecnico) {
        this.nombreApellido_tecnico = nombreApellido_tecnico;
    }
       
}
