/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.lab3.session;

import co.edu.unipiloto.lab3.entity.Student;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author crist
 */
@Local
public interface StudentDaoLocal {

    void añadirStudent(Student student);

    void editarStudent(Student student);

    void eliminarStudent(Integer studentId);

    Student traerStudent(Integer StudentId);

    List<Student> traerAllStudents();
    
}
