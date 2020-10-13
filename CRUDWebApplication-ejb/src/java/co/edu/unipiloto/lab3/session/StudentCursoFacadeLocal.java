/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.lab3.session;

import co.edu.unipiloto.lab3.entity.StudentCurso;
import co.edu.unipiloto.lab3.entity.StudentCursoPK;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author crist
 */
@Local
public interface StudentCursoFacadeLocal {

    void create(StudentCurso studentCurso);

    void edit(StudentCurso studentCurso);

    void remove(StudentCurso studentCurso);

    StudentCurso find(Object id);

    List<StudentCurso> findAll();

    List<StudentCurso> findRange(int[] range);
    int count();
    boolean insertarStudentCurso(Integer studentid,Integer codigo_curso,Integer estudiantes_tomando_curso);
    StudentCurso consultaStudentCurso(StudentCursoPK pk);
    public boolean eliminarClase(int studentid, int cursoid);
    
    
}
