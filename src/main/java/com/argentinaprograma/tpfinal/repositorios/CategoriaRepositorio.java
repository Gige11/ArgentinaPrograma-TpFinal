package com.argentinaprograma.tpfinal.repositorios;

import com.argentinaprograma.tpfinal.dominio.Categoria;
import com.argentinaprograma.tpfinal.dominio.Cliente;
import java.util.List;

public interface CategoriaRepositorio {
    
    Categoria obtenerCategoriaPorID(long id_categoria);
    List<Categoria> obtenerTodasLasCategorias ();
    void guardarCategoria(Categoria categoria);
    void eliminarCategoria(Long id_categoria);
    
}
