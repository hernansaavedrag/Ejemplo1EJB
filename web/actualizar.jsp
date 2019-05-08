<%-- 
    Document   : actualizar
    Created on : 07-05-2019, 21:38:34
    Author     : sistemas
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
  <html>
    <head>
      <!--Import Google Icon Font-->
      <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
      <!--Import materialize.css-->
      <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>

      <!--Let browser know website is optimized for mobile-->
      <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    </head>

    
    
                    <h4 class="center-align">Actualizar</h4>
                    <form action="control.do" method="post">

                        <div class="input-field">
                            <input id="rut" type="text" name="rut" value="${param.rut}" readonly>
                            <label for="rut">Rut</label>
                        </div>
                        
                        <div class="input-field">
                            <input id="nombre" type="text" name="nombre" value="${param.nombre}">
                            <label for="nombre">Nombre</label>
                        </div>
                        <div class="input-field">
                            <input id="apellido" type="text" name="apellido" value="${param.apellido}">
                            <label for="apellido">Apellido</label>
                        </div>
                            <button name = "boton" value="actualizar" type="submit" class="btn right blue">
                            Actualizar
                        </button>
                        <br><br>
                    </form>
                </div>
            </div>
        </div>
        
        
        
      <!--Import jQuery before materialize.js-->
      <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
      <script type="text/javascript" src="js/materialize.min.js"></script>
    </body>
  </html>
