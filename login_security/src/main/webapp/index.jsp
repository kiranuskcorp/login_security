<%@ page import = "java.io.*,java.util.*" %>
<html>
   <head>
      <title>Navigate to </title>
   </head>
   
   <body>
     
      <%
         // New location to be redirected
         String site = new String("./login");
         response.setStatus(response.SC_MOVED_TEMPORARILY);
         response.setHeader("Location", site); 
      %>
   </body>
</html>