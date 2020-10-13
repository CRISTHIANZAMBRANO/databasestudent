/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.lab3.session;

import co.edu.unipiloto.lab3.entity.Student;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author crist
 */

@Stateless
public class StudentDao extends AbstractFacade<Student> implements StudentDaoLocal  {

    @PersistenceContext
    private EntityManager em;

    public StudentDao() {
        super(Student.class);
    }
    
    @Override
    public void añadirStudent(Student student) {
        em.persist(student);
    }

    @Override
    public void editarStudent(Student student) {
        em.merge(student);
    }

    @Override
    public void eliminarStudent(Integer studentId ) {
        em.remove(traerStudent(studentId));
    }

    @Override
    public Student traerStudent(Integer studentId) {
        return em.find(Student.class,studentId);
    }

    @Override
    public List<Student> traerAllStudents() {
        return em.createNamedQuery("Student.getAll").getResultList();
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
