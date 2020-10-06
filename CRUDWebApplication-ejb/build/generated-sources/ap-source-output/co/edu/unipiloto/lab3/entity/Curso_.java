package co.edu.unipiloto.lab3.entity;

import co.edu.unipiloto.lab3.entity.StudentCurso;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-06T13:22:15")
@StaticMetamodel(Curso.class)
public class Curso_ { 

    public static volatile SingularAttribute<Curso, Integer> codigoCurso;
    public static volatile SingularAttribute<Curso, Integer> numeroEstudiantesAdmitidos;
    public static volatile SingularAttribute<Curso, Integer> numeroCreditos;
    public static volatile ListAttribute<Curso, StudentCurso> studentCursoList;
    public static volatile SingularAttribute<Curso, String> nombreCurso;
    public static volatile SingularAttribute<Curso, Integer> semestre;

}