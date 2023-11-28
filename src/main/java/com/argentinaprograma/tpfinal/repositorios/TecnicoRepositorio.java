package com.argentinaprograma.tpfinal.repositorios;

import com.argentinaprograma.tpfinal.dominio.Tecnico;
import java.util.List;

public interface TecnicoRepositorio {
    
    List<Tecnico> obtenerTodosLosTecnicos();
    Tecnico obtenerTecnicoPorID(long id_tecnico);
    void guardarTecnico(Tecnico tecnico);
    void eliminarTecnico(Long id_tecnico);
    
}
