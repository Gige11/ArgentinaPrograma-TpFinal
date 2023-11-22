package com.argentinaprograma.tpfinal.repositorios;

import com.argentinaprograma.tpfinal.dominio.Categoria;
import com.argentinaprograma.tpfinal.dominio.Cliente;

public interface CategoriaRepositorio {
    
    Categoria obtenerCategoriaPorID(int id_categoria);
    void guardarCategoria(Categoria Categoria);
    void eliminarCategoria(Long id_categoria);
    
}
