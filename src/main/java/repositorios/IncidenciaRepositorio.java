package repositorios;
import com.argentinaprograma.tpfinal.dominio.Incidencia;
import java.util.Date;
import java.util.List;


public interface IncidenciaRepositorio {
    
    List<Incidencia> obtenerTodasLasIncidencia();
    Incidencia obtenerIncidenciaPorId(Long id_incidencia);
    void guardarIncidencia(Incidencia incidencia);
    void eliminarIncidencia(Long id_incidencia);
    List<Incidencia> obtenerIncidenciaPorFecha(Date fechaInicial, Date fechaFinal);
    
}
