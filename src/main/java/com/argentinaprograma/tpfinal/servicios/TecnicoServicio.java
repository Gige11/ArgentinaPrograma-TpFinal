package com.argentinaprograma.tpfinal.servicios;

import com.argentinaprograma.tpfinal.config.HibernateUtil;
import com.argentinaprograma.tpfinal.dominio.Tecnico;
import com.argentinaprograma.tpfinal.repositorios.TecnicoRepositorio;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TecnicoServicio implements TecnicoRepositorio{

    @Override
    public Tecnico obtenerTecnicoPorID(int id_tecnico) {
        
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Tecnico tecnico = null;
        
        try {
            session.beginTransaction();
            
            tecnico = session.createQuery("FROM Tecnico WHERE id_tecnico = :id_tecnico", Tecnico.class)
                    .setParameter("id_tecnico",id_tecnico)
                    .uniqueResult();
            
            session.getTransaction().commit();
            
        } catch (Exception e) {
            System.out.println("El cliente no se encuentra");
        } finally {
            session.close();
        }
              
        return tecnico;
    }

    @Override
    public void guardarTecnico(Tecnico tecnico) {
        
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        
        session.save(tecnico);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }

    @Override
    public void eliminarTecnico(Long id_tecnico) {
        
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        
        Tecnico tecnico = session.get(Tecnico.class, id_tecnico);
        
        if(tecnico != null){
            session.delete(tecnico);
            session.getTransaction().commit();
        } else {
            System.out.println("No se puede eliminar");
        }
        
        session.close();
    }
    
}