package com.argentinaprograma.tpfinal.servicios;

import com.argentinaprograma.tpfinal.config.HibernateUtil;
import com.argentinaprograma.tpfinal.dominio.Cliente;
import com.argentinaprograma.tpfinal.dominio.Incidencia;
import com.argentinaprograma.tpfinal.repositorios.IncidenciaRepositorio;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class IncidenciaServicio implements IncidenciaRepositorio{

    @Override
    public List<Incidencia> obtenerTodasLasIncidencia() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Incidencia> incidencias = null;
        
        session.beginTransaction();
        
        incidencias = session.createQuery("FROM incidencias", Incidencia.class).getResultList();
        
        return incidencias;
        
        //Probar
    }

    @Override
    public void guardarIncidencia(Incidencia incidencia) {
        
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        
        session.save(incidencia);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        
    }

    @Override
    public void eliminarIncidencia(Long id_incidencia) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        
        Incidencia incidencia = session.get(Incidencia.class, id_incidencia);
        
        if(incidencia != null){
            session.delete(incidencia);
            session.getTransaction().commit();
        } else {
            System.out.println("No se puede eliminar");
        }
        
        session.close();
    }

    @Override
    public List<Incidencia> obtenerIncidenciaPorFecha(Date fechaInicial, Date fechaFinal) {
        
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction(); 
        
        String consulta = "FROM incidencias WHERE fecha_incidencia BETWEEN :fechaInicial AND :fechaFinal";
        
            
        List<Incidencia> incidencias = session.createQuery(consulta,Incidencia.class)
                .setParameter("fechaInicial",fechaInicial)
                .setParameter("fechaFinal",fechaFinal)
                .getResultList();
        
             
        session.getTransaction().commit();
        session.close();
        
        return incidencias;
        
        //posible problema por session cerrada 
        
    }
    
}
