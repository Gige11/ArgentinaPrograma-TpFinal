
package com.argentinaprograma.tpfinal.repositorios;

import com.argentinaprograma.tpfinal.dominio.Cliente;
import java.util.List;


public interface ClienteRepositorio {
    
    Cliente obtenerClientePorDNI(int dni_cliente);
    void guardarCliente(Cliente cliente);
    void eliminarCliente(int id_cliente);
    
}
