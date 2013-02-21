<%-- 
    Document   : manager
    Created on : Aug 8, 2011, 8:18:29 AM
    Author     : SENATEUR
--%>

<%@page import="hibernate.Manager"%>
<%@page import="java.util.List"%>
<%@page import="hibernate.LogisticHelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP</title>
    </head>
    <body>
         <hr>
        <div align="center">
            <font color="green" ><h1>LIST MANAGER</h1></font>
        </div>
        <hr>
         <br><br><br><br><br><br><br><br><br>
                    Liste des Manager :
                    <table align="center" border="0" cellspacing="0" cellpadding="0">
                        <tr>

                             <td width="120px"><b>Nom</b></td>
                            <td width="120px"><b>Prénom</b></td>
                            <td width="120px"><b>Login</b></td>
                            <td width="120px"><b>Adresse</b></td>
                             <td width="120px"><b>Telephone</b></td>
                            <td width="120px">email<b></b></td>
                                                                             
                        </tr>
                        <%
                            LogisticHelper pHelper = new LogisticHelper();
                            List <Manager> lst = pHelper.getListAbonnee();
                            for(int i=0; lst != null && i < lst.size(); i++){
                                if(i%2==0){
                        %>
                        <tr bgcolor="#F5F5F5"></tr>
                        <%
                            }
                                else {
                        %>
                        <tr>
                        <%
                            }
                        %>
                            <td><%= i+1 %></td>
                            <td><%= lst.get(i).getNom() %></td>
                            <td><%= lst.get(i).getPrenom() %></td>
                            <td><%= lst.get(i).getLogin() %></td>
                             <td><%= lst.get(i).getAdresse() %></td>
                            <td><%= lst.get(i).getTel() %></td>
                            <td><%= lst.get(i).getEmail() %></td>
                            <td bgcolor="white" align="center"></td>
                            <%
                            }
                            %>
                        </tr>
                    
          </table>

    </body>
</html>

    </body>
</html>
