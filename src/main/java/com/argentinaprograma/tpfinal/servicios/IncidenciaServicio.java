package com.argentinaprograma.tpfinal.servicios;

import com.argentinaprograma.tpfinal.config.HibernateUtil;
import com.argentinaprograma.tpfinal.dominio.Cliente;
import com.argentinaprograma.tpfinal.dominio.Incidencia;
import com.argentinaprograma.tpfinal.repositorios.IncidenciaRepositorio;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class IncidenciaServicio implements IncidenciaRepositorio {

    @Override
    public List<Incidencia> obtenerTodasLasIncidencia() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Incidencia> incidencias = null;

        session.beginTransaction();

        incidencias = session.createQuery("FROM Incidencia", Incidencia.class).getResultList();

        session.close();

        return incidencias;

        //Probar
    }

    @Override
    public void guardarIncidencia(Incidencia incidencia) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        if (incidencia.getId_cliente() == null) {
            JOptionPane.showMessageDialog(null, "No se encontro un cliente asociado al DNI");
        } else {
            
            session.save(incidencia);
            //session.persist(incidencia);
            
            
            session.getTransaction().commit();
            session.close();
            
            JOptionPane.showMessageDialog(null,"Se ha agregado una incidencia correctamente.");
        }

    }

    @Override
    public void eliminarIncidencia(Long id_incidencia) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        Incidencia incidencia = session.get(Incidencia.class, id_incidencia);

        if (incidencia != null) {
            session.delete(incidencia);
            session.getTransaction().commit();
        } else {
            System.out.println("No se puede eliminar");
        }

        session.close();
    }

    @Override
    public List<Incidencia> obtenerIncidenciaPorFecha(LocalDate fechaInicial, LocalDate fechaFinal) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        String consulta = "FROM Incidencia WHERE fecha_incidencia BETWEEN :fechaInicial AND :fechaFinal";

        List<Incidencia> incidencias = session.createQuery(consulta, Incidencia.class)
                .setParameter("fechaInicial", fechaInicial)
                .setParameter("fechaFinal", fechaFinal)
                .getResultList();

        session.getTransaction().commit();
        session.close();

        return incidencias;

    }

}
