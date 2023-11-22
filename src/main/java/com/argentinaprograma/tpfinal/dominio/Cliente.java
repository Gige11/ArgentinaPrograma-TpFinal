package com.argentinaprograma.tpfinal.dominio;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Cliente {
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id_cliente;
   
   @Column(unique = true)
   private int dni_cliente;
   
   @Column
   private String nombre_cliente;
   
   @Column
   private String direccion_cliente;
   
   @Column
   private String mail_cliente;
   
   @OneToMany(cascade = CascadeType.ALL, mappedBy="id_incidencia")
   private List<Incidencia> incidencias;

    public Cliente() {
    }

    public Cliente(long id_cliente, int dni_cliente, String nombre_cliente, String direccion_cliente, String mail_cliente, List<Incidencia> incidencias) {
        this.id_cliente = id_cliente;
        this.dni_cliente = dni_cliente;
        this.nombre_cliente = nombre_cliente;
        this.direccion_cliente = direccion_cliente;
        this.mail_cliente = mail_cliente;
        this.incidencias = incidencias;
    }

    public long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getDni_cliente() {
        return dni_cliente;
    }

    public void setDni_cliente(int dni_cliente) {
        this.dni_cliente = dni_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

    public String getMail_cliente() {
        return mail_cliente;
    }

    public void setMail_cliente(String mail_cliente) {
        this.mail_cliente = mail_cliente;
    }

    public List<Incidencia> getIncidencias() {
        return incidencias;
    }

    public void setIncidencias(List<Incidencia> incidencias) {
        this.incidencias = incidencias;
    }

    //Para probar su funcionamiento
    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + ", dni_cliente=" + dni_cliente + ", nombre_cliente=" + nombre_cliente + ", direccion_cliente=" + direccion_cliente + ", mail_cliente=" + mail_cliente + '}';
    }      
    
}
