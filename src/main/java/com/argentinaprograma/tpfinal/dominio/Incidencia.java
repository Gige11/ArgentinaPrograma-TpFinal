package com.argentinaprograma.tpfinal.dominio;

import jakarta.persistence.*;
import java.util.Date;
import org.hibernate.annotations.Type;

@Entity
public class Incidencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_incidencia;
    
    @Column
    private String descripcion_incidencia;
    
    @Column
    private double costo_incidencia;
    
    @Column
    private Date fecha_incidencia;
    
    @Column
    private String estado_incidencia;
    
    @JoinColumn
    @ManyToOne(cascade = CascadeType.ALL)
    private Cliente id_cliente;
    
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Categoria id__categoria;
    

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Tecnico id_tecnico;

    public Incidencia() {
    }

    public Incidencia(long id_incidencia, String descripcion_incidencia, double costo_incidencia, Date fecha_incidencia, String estado_incidencia, Cliente id_cliente, Categoria id__categoria, Tecnico id_tecnico) {
        this.id_incidencia = id_incidencia;
        this.descripcion_incidencia = descripcion_incidencia;
        this.costo_incidencia = costo_incidencia;
        this.fecha_incidencia = fecha_incidencia;
        this.estado_incidencia = estado_incidencia;
        this.id_cliente = id_cliente;
        this.id__categoria = id__categoria;
        this.id_tecnico = id_tecnico;
    }

    public long getId_incidencia() {
        return id_incidencia;
    }

    public void setId_incidencia(long id_incidencia) {
        this.id_incidencia = id_incidencia;
    }

    public String getDescripcion_incidencia() {
        return descripcion_incidencia;
    }

    public void setDescripcion_incidencia(String descripcion_incidencia) {
        this.descripcion_incidencia = descripcion_incidencia;
    }

    public double getCosto_incidencia() {
        return costo_incidencia;
    }

    public void setCosto_incidencia(double costo_incidencia) {
        this.costo_incidencia = costo_incidencia;
    }

    public Date getFecha_incidencia() {
        return fecha_incidencia;
    }

    public void setFecha_incidencia(Date fecha_incidencia) {
        this.fecha_incidencia = fecha_incidencia;
    }

    public String getEstado_incidencia() {
        return estado_incidencia;
    }

    public void setEstado_incidencia(String estado_incidencia) {
        this.estado_incidencia = estado_incidencia;
    }

    public Cliente getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Cliente id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Categoria getId__categoria() {
        return id__categoria;
    }

    public void setId__categoria(Categoria id__categoria) {
        this.id__categoria = id__categoria;
    }

    public Tecnico getId_tecnico() {
        return id_tecnico;
    }

    public void setId_tecnico(Tecnico id_tecnico) {
        this.id_tecnico = id_tecnico;
    }
    
    
    
}
