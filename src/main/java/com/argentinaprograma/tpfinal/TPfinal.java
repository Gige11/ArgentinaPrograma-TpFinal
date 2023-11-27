package com.argentinaprograma.tpfinal;

import com.argentinaprograma.tpfinal.dominio.Cliente;
import com.argentinaprograma.tpfinal.dominio.Incidencia;
import com.argentinaprograma.tpfinal.servicios.CategoriaServicio;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.argentinaprograma.tpfinal.servicios.ClienteServicio;
import com.argentinaprograma.tpfinal.servicios.IncidenciaServicio;
import java.util.List;

public class TPfinal {

    public static void main(String[] args) {

        // Crear un nuevo cliente y guardarlo en la base de datos
        /*
        Cliente cliente = new Cliente();
        cliente.setDni_cliente(1018589);
        cliente.setDireccion_cliente("Cordoba 1010");
        cliente.setNombre_cliente("NombreCliente");
        cliente.setMail_cliente("correo@ejemplo.com");
         */
//        ClienteServicio clienteServicio = new ClienteServicio();
        //clienteServicio.guardarCliente(cliente);
        //Eliminar cliente
        //clienteServicio.eliminarCliente(4);
        //obtenerClientePorDNI
//        clienteServicio.obtenerClientePorDNI(9018589);
//        
//        CategoriaServicio categoriaServicio = new CategoriaServicio();
//        
//        categoriaServicio.obtenerCategoriaPorID(3);
        IncidenciaServicio incidenciaServicio = new IncidenciaServicio();

        List<Incidencia> incidencias = incidenciaServicio.obtenerTodasLasIncidencia();

        for (Incidencia i : incidencias) {
            System.out.println(i);
        }

    }
}
