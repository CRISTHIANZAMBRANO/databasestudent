<%-- 
    Document   : curso
    Created on : 13/10/2020, 12:19:02 PM
    Author     : crist
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Curso</title>
    </head>
    <body>
        <h1>Curso</h1>
        <form action="./StudentServlet" method="POST">
            <div class="general">
              <div class="inputs">
                <h1><a href="index.jsp">CURSO</a></h1>
                <input class="inv" name="tipo" type="text" value="${2}">
                <input class="form-control" name="idc" type="text" value="${curso.codigoCurso}" placeholder="idc">
                <input class="form-control" name="nombrecurso" type="text" value="${curso.nombreCurso}" placeholder="NombreCurso">
                <input class="form-control" name="ncreditos" type="text" value="${curso.numeroCreditos}" placeholder="ncreditos">
                <input class="form-control" name="semestre" type="text" value="${curso.semestre}" placeholder="semestre">
                <input class="form-control" name="nestudadmit" type="text" value="${curso.numeroEstudiantesAdmitidos}" placeholder="nestudadmit">
              </div>
              <div class="botones">
                <input class="btn btn-success" name="action"  type="submit" value="Add">
                <input class="btn btn-danger" name="action"  type="submit" value="Delete">
                <input class="btn btn-primary" name="action"  type="submit" value="Edit">
                <input class="btn btn-secondary" name="action"  type="submit" value="Search">
              </div>
            </div>
        </form>
        <div>
          <div class="tabla">
            <table class="table">
              <thead class="thead-dark">
                <th>IDC</th>
                <th>NonbreCurso</th>
                <th>NCreditos</th>
                <th>Semestre</th>
                <th>NEstudAdmit</th>
              </thead>
              <tbody>
                <c:forEach items="${allCursos}" var="cur">
                  <tr>
                    <td>${cur.codigoCurso}</td>
                    <td>${cur.nombre_Curso}</td>
                    <td>${cur.numeroCreditos}</td>
                    <td>${cur.semestre}</td>
                    <td>${cur.numeroEstudiantesAdmitidos}</td>
                  </tr>
                </c:forEach>
              </tbody> 
            </table>
          </div>
        </div>
    </body>
</html>
