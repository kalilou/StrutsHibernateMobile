
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="h" uri="http://struts.apache.org/tags-html"%>
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<!DOCTYPE html>


<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta content="en-us" http-equiv="Content-Language" />
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<title>MobileLogistic</title>
<style type="text/css">
.auto-style2 {
	text-align: center;
	font-size: xx-large;
	color: #8E8C1B;
}
.auto-style3 {
	margin-top: 0px;
}
.auto-style5 {
	color: #8E8C1B;
}
.auto-style6 {
	text-align: right;
}
.auto-style7 {
	text-align: center;
}
.auto-style8 {
	text-align: right;
	color: #8E8C1B;
	font-size: large;
}
.auto-style9 {
	text-align: right;
	color: #8E8C1B;
}
</style>
</head>

<body>

<h1 class="auto-style2"><strong>MobileLogistic </strong></h1>
<p><img alt="" height="112" src="images.jpg" width="100%" /></p>
<div style="width: 100%; height: 367px">
	<table align="center" style="width: 100%; height: 275px">
		<tr>
			<td style="width: 223px">
                            <h:form action="/AuthentificationAction" method="post" style="height: 122px; width: 224px">
				<table style="width: 29%">
					<tr>
						<td class="auto-style5" style="width: 115px"><strong>
						Login</strong></td>
						<td>
                                                    <h:text property="login" style="width: 153px" /></td>
					</tr>
					<tr>
						<td class="auto-style5" style="width: 115px"><strong>
						Password</strong></td>
						<td>
                                                    <h:password property="password" style="width: 153px; height: 22px" /></td>
					</tr>
					<tr>
						<td style="width: 115px">&nbsp;</td>
						<td class="auto-style6"><strong>
						<input class="auto-style5" name="Submit" style="width: 83px" type="submit" value="Connexion" /></strong></td>
					</tr>
					<tr>
						<td style="width: 115px">&nbsp;</td>
						<td class="auto-style6"><strong>
						<input class="auto-style5" name="Reset" style="width: 83px" type="reset" value="Reset" /></strong>&nbsp;</td>
					</tr>
				</table>
			</h:form>
                       
			</td>
                        
			<td class="auto-style7"><strong><span class="auto-style5">Bienvenue 
			sur la plateforme MobileLogistic</span><br/>
			<br  />
			<span class="auto-style5">La plateforme MobileLogstic est une 
			plateforme de gestion exclusive de toutes les activités de 
			l&#39;entreprise permettant ainsi une suivie à quasi temps reél des 
			ressource de l&#39;entreprise </span></strong></td>
			<td class="auto-style6">
                            
                            
                            <h:form action="/ManagerAction" method="post">
			<table align="right" >
				<tr >
                                    
				<td class="auto-style8"><strong>Inscription</strong></td>
				</tr>                                                            
                                 <br/>
                                
				
				<tr>
					<td class="auto-style9" ><strong>Nom</strong></td>
					<td><h:text  property="nom" style="width: 153px" /> </td>                                            
				</tr>
                                
				<tr>
					<td  class="auto-style9"><strong>Prenom</strong></td>
					<td><h:text  property="prenom" style="width: 153px" /> </td>                                            

				</tr>
				<tr>
					<td class="auto-style9" ><strong>Adresse</strong></td>
					<td><h:text  property="adresse" style="width: 153px" /> </td>                                            

				</tr>
				<tr>
					<td class="auto-style9"><strong>Téléphone</strong></td>
					<td><h:text  property="telephone" style="width: 153px" /> </td>                                            

				</tr>
				<tr>
					<td class="auto-style9" ><strong>Email</strong></td>
					<td><h:text  property="email" style="width: 153px" /> </td>                                            

				</tr>
				<tr>
					<td class="auto-style9" ><strong>Login</strong></td>
					<td><h:text  property="login" style="width: 153px" /> </td>                                            
				</tr>
				<tr>
					<td class="auto-style9"><strong>password</strong></td>
					<td><h:text  property="password" style="width: 153px" /> </td>                                            

				</tr>
				<tr>
					<td class="auto-style9" ><strong>Re-password</strong></td>
                                        <td><input type="password"  style="width: 153px" /> </td>                                            

				</tr>
				<tr>
                                                <td></td>
						<td class="auto-style6"><strong>
						<input class="auto-style5" name="Submit" style="width: 91px" type="submit" value="Inscrire" /></strong></td>
					</tr>
                                        <tr>	
                                            <td></td>
                                            <td class="auto-style6"><strong>
					    <input class="auto-style5"  name="Reset0" style="width: 88px" type="reset" value="Reset" /></strong>&nbsp;</td>
					</tr>
			</table>
                        </h:form>
			</td>
		</tr>
               
	</table>
    
</div>

  <% if(request.getAttribute("errorConnexion") != null ){ %>
                    
                <font color="red">              
                <strong>
                    Veuillez remplir tous les champs connexion
                </strong>
                </font>
                    
                     <% 
                   } 
                    %>
                    
                    <% if(request.getAttribute("errorInscription") != null ){ %>
                    
                <font color="blue">              
                <strong>
                    Veuillez remplir tous les champs inscription
                </strong>
                </font>
                    
                     <% 
                   } %>
                                   
                  
</body>
</html>
