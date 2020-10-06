/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.lab3.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "STUDENT_CURSO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StudentCurso.findAll", query = "SELECT s FROM StudentCurso s"),
    @NamedQuery(name = "StudentCurso.findByStudentid", query = "SELECT s FROM StudentCurso s WHERE s.studentCursoPK.studentid = :studentid"),
    @NamedQuery(name = "StudentCurso.findByCodigoCurso", query = "SELECT s FROM StudentCurso s WHERE s.studentCursoPK.codigoCurso = :codigoCurso"),
    @NamedQuery(name = "StudentCurso.findByEstudiantesTomandoCurso", query = "SELECT s FROM StudentCurso s WHERE s.estudiantesTomandoCurso = :estudiantesTomandoCurso")})
public class StudentCurso implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected StudentCursoPK studentCursoPK;
    @Column(name = "ESTUDIANTES_TOMANDO_CURSO")
    private Integer estudiantesTomandoCurso;
    @JoinColumn(name = "CODIGO_CURSO", referencedColumnName = "CODIGO_CURSO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Curso curso;
    @JoinColumn(name = "STUDENTID", referencedColumnName = "STUDENTID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Student student;

    public StudentCurso() {
    }

    public StudentCurso(StudentCursoPK studentCursoPK, Integer estudiantesTomandoCurso) {
        this.studentCursoPK = studentCursoPK;
        this.estudiantesTomandoCurso = estudiantesTomandoCurso;
    }

    public StudentCurso(StudentCursoPK studentCursoPK) {
        this.studentCursoPK = studentCursoPK;
    }

    public StudentCurso(int studentid, int codigoCurso) {
        this.studentCursoPK = new StudentCursoPK(studentid, codigoCurso);
    }

    public StudentCursoPK getStudentCursoPK() {
        return studentCursoPK;
    }

    public void setStudentCursoPK(StudentCursoPK studentCursoPK) {
        this.studentCursoPK = studentCursoPK;
    }

    public Integer getEstudiantesTomandoCurso() {
        return estudiantesTomandoCurso;
    }

    public void setEstudiantesTomandoCurso(Integer estudiantesTomandoCurso) {
        this.estudiantesTomandoCurso = estudiantesTomandoCurso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentCursoPK != null ? studentCursoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudentCurso)) {
            return false;
        }
        StudentCurso other = (StudentCurso) object;
        if ((this.studentCursoPK == null && other.studentCursoPK != null) || (this.studentCursoPK != null && !this.studentCursoPK.equals(other.studentCursoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unipiloto.lab3.entity.StudentCurso[ studentCursoPK=" + studentCursoPK + " ]";
    }
    
}
