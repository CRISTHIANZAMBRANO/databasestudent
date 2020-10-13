/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.lab3.session;

import co.edu.unipiloto.lab3.entity.Curso;
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
public class CursoFacade extends AbstractFacade<Curso> implements CursoFacadeLocal {

    @PersistenceContext(unitName = "CRUDWebApplication-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CursoFacade() {
        super(Curso.class);
    }
    @Override
    public void create(Curso curso) {
        em.persist(curso);
    }

    @Override
    public void edit(Curso curso) {
        em.merge(curso);
    }

    @Override
    public void remove(Integer cursoId ) {
        em.remove(find(cursoId));
    }

    @Override
    public Curso find(Integer cursoId) {
        return em.find(Curso.class,cursoId);
    }

    @Override
    public List<Curso> findAll() {
        return em.createNamedQuery("Curso.findAll").getResultList();
    }

   
    
}
