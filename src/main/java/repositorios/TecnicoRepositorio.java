package repositorios;

import com.argentinaprograma.tpfinal.dominio.Tecnico;



public interface TecnicoRepositorio {
    
    Tecnico obtenerTecnicoPorID(int id_tecnico);
    void guardarTecnico(Tecnico tecnico);
    void eliminarTecnico(Long id_tecnico);
    
}
