package co.edu.unipiloto.lab3.entity;

import co.edu.unipiloto.lab3.entity.Curso;
import co.edu.unipiloto.lab3.entity.Student;
import co.edu.unipiloto.lab3.entity.StudentCursoPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-13T13:10:53")
@StaticMetamodel(StudentCurso.class)
public class StudentCurso_ { 

    public static volatile SingularAttribute<StudentCurso, Student> student;
    public static volatile SingularAttribute<StudentCurso, Curso> curso;
    public static volatile SingularAttribute<StudentCurso, StudentCursoPK> studentCursoPK;
    public static volatile SingularAttribute<StudentCurso, Integer> estudiantesTomandoCurso;

}