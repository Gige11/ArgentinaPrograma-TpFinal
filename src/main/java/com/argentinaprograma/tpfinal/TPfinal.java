package com.argentinaprograma.tpfinal;

import com.argentinaprograma.tpfinal.dominio.Cliente;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import servicios.ClienteServicio;

public class TPfinal {

    public static void main(String[] args) {


        // Crear un nuevo cliente y guardarlo en la base de datos
        Cliente cliente = new Cliente();
        cliente.setDni_cliente(21018589);
        cliente.setDireccion_cliente("Cordoba 1010");
        cliente.setNombre_cliente("NombreCliente");
        cliente.setMail_cliente("correo@ejemplo.com");
        
        ClienteServicio clienteServicio = new ClienteServicio();
        clienteServicio.guardarCliente(cliente);
    }
}
