package com.argentinaprograma.tpfinal.repositorios;

import com.argentinaprograma.tpfinal.dominio.Tecnico;

public interface TecnicoRepositorio {
    
    Tecnico obtenerTecnicoPorID(long id_tecnico);
    void guardarTecnico(Tecnico tecnico);
    void eliminarTecnico(Long id_tecnico);
    
}
