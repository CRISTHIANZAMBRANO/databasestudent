/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.lab3;

import co.edu.unipiloto.lab3.entity.Curso;
import co.edu.unipiloto.lab3.entity.Student;
import co.edu.unipiloto.lab3.entity.StudentCursoPK;
import co.edu.unipiloto.lab3.session.CursoFacadeLocal;
import co.edu.unipiloto.lab3.session.StudentDaoLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author crist
 */
@WebServlet(name = "StudentServlet", urlPatterns = {"/StudentServlet"})
public class StudentServlet extends HttpServlet {

    @EJB
    private CursoFacadeLocal cursoFacade;

    @EJB
    private StudentDaoLocal studentDao;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          Curso( request, response);   
        /*String action = request.getParameter("action");
        String studentIdStr = request.getParameter("studentId");
        int studentId = 0;
        if (studentIdStr != null && !studentIdStr.equals("")) {
            studentId = Integer.parseInt(studentIdStr);
        }
        String firstname = request.getParameter("firstname");
        String lasttname = request.getParameter("lastname");
        String yearLevelStr = request.getParameter("yearLevel");
        int yearLevel = 0;
        if (yearLevelStr != null && !yearLevelStr.equals("")) {
            yearLevel = Integer.parseInt(yearLevelStr);
        }
        Student student = new Student(studentId, firstname, lasttname, yearLevel);

        if ("Add".equalsIgnoreCase(action)) {
            studentDao.añadirStudent(student);
        } else if ("Edit".equalsIgnoreCase(action)) {
            studentDao.editarStudent(student);
        } else if ("Delete".equalsIgnoreCase(action)) {
            studentDao.eliminarStudent(studentId);
        } else if ("Search".equalsIgnoreCase(action)) {
            student = studentDao.traerStudent(studentId);
        }
        request.setAttribute("stud", student);
        request.setAttribute("allStudents", studentDao.traerAllStudents());
        request.getRequestDispatcher("studentinfo.jsp").forward(request, response);*/
    }

    public void Curso(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
            
        String action = request.getParameter("action");
        String cursoIdStr = request.getParameter("idc");
        int cursoId = 0;
        if (cursoIdStr != null && !cursoIdStr.equals("")) {
           cursoId = Integer.parseInt(cursoIdStr);
        }
        String nombre_curso = request.getParameter("nombreCurso");
        String numero_creditosStr = request.getParameter("ncreditos");
        int numero_creditos=0;
        if (numero_creditosStr != null && !numero_creditosStr.equals("")) {
            numero_creditos = Integer.parseInt(numero_creditosStr);
        }
        String semestreStr = request.getParameter("semestre");
        int semestre=0;
        if (semestreStr != null && !semestreStr.equals("")) {
            semestre= Integer.parseInt(semestreStr);
        }
        String estadStr = request.getParameter("nestudadmit");
        int estad = 0;
        if (estadStr != null && !estadStr.equals("")) {
            estad = Integer.parseInt(estadStr);
        }
        Curso curso=new Curso(cursoId, nombre_curso,numero_creditos, semestre, estad);
        /*PrintWriter out = response.getWriter();
        String str=""+cursoId+ nombre_curso+numero_creditos+semestre+estad;
        out.println(str);*/
        if ("Add".equalsIgnoreCase(action)) {
           cursoFacade.create(curso);
        } else if ("Edit".equalsIgnoreCase(action)) {
            cursoFacade.edit(curso);
        } else if ("Delete".equalsIgnoreCase(action)) {
            cursoFacade.remove(cursoId);
        } else if ("Search".equalsIgnoreCase(action)) {
            curso = cursoFacade.find(estad);
        }
        request.setAttribute("curso", curso);
        request.setAttribute("allCursos", cursoFacade.findAll());
        request.getRequestDispatcher("curso.jsp").forward(request, response);
    }
    
       
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
