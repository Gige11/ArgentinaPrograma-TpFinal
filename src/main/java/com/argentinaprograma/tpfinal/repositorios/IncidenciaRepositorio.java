package com.argentinaprograma.tpfinal.repositorios;
import com.argentinaprograma.tpfinal.dominio.Incidencia;
import java.util.Date;
import java.util.List;


public interface IncidenciaRepositorio {
    
    List<Incidencia> obtenerTodasLasIncidencia();
    //ver si es necesario Incidencia obtenerIncidenciaPorId(Long id_incidencia); 
    void guardarIncidencia(Incidencia incidencia);
    void eliminarIncidencia(Long id_incidencia);
    List<Incidencia> obtenerIncidenciaPorFecha(Date fechaInicial, Date fechaFinal);
    
}
