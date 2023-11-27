package com.argentinaprograma.tpfinal.servicios;

import com.argentinaprograma.tpfinal.config.HibernateUtil;
import com.argentinaprograma.tpfinal.dominio.Categoria;
import com.argentinaprograma.tpfinal.dominio.Cliente;
import com.argentinaprograma.tpfinal.repositorios.CategoriaRepositorio;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CategoriaServicio implements CategoriaRepositorio{

    @Override
    public Categoria obtenerCategoriaPorID(int id_categoria) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Categoria categoria = null;
        
        try {
            session.beginTransaction();
            
            categoria = session.createQuery("FROM Categoria WHERE id_categoria = :id_categoria", Categoria.class)
                    .setParameter("id_categoria",id_categoria)
                    .uniqueResult();
            
            session.getTransaction().commit();
            
        } catch (Exception e) {
            System.out.println("La categoria no se encuentra");
        } finally {
            session.close();
        }
      
        return categoria;
    }

    @Override
    public void guardarCategoria(Categoria categoria) {
        
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        
        session.save(categoria);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }

    @Override
    public void eliminarCategoria(Long id_categoria) {
        
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        
        Categoria categoria = session.get(Categoria.class, id_categoria);
        
        if(categoria != null){
            session.delete(categoria);
            session.getTransaction().commit();
        } else {
            System.out.println("No existe esta categoria");
        }
        
        session.close();
    }
          
}
