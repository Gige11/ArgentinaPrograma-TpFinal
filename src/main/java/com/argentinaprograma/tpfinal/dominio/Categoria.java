package com.argentinaprograma.tpfinal.dominio;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Categoria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_categoria;
    
    @Column
    private String descripcion_categoria;
    
    @OneToMany(mappedBy = "id_categoria", cascade = CascadeType.ALL)
    private List<Incidencia> incidencias;

    public Categoria() {
    }

    public Categoria(long id_categoria, String descripcion_categoria) {
        this.id_categoria = id_categoria;
        this.descripcion_categoria = descripcion_categoria;
    }

    public Categoria(String descripcion_categoria) {
        this.descripcion_categoria = descripcion_categoria;
    }

    public long getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(long id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getDescripcion_categoria() {
        return descripcion_categoria;
    }

    public void setDescripcion_categoria(String descripcion_categoria) {
        this.descripcion_categoria = descripcion_categoria;
    }

    @Override
    public String toString() {
        return descripcion_categoria;
    }
    
    
        
}
