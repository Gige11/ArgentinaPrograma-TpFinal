package servicios;

import com.argentinaprograma.tpfinal.dominio.Cliente;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import repositorios.ClienteRepositorio;
import org.hibernate.cfg.Configuration;

public class ClienteServicio implements ClienteRepositorio {

    @Override
    public Cliente obtenerClientePorDNI(int dni_cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void guardarCliente(Cliente cliente) {
        
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // Obtener una sesión de la SessionFactory
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        session.save(cliente);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }

    @Override
    public void eliminarCliente(Long id_cliente) {
        
        
        
    }
    
}
