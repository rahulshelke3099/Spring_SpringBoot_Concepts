<%@page language="java" %>
<html>
<head>
<link rel="stylesheet" type="text/css" href="styles.css"/>
</head>
<body>
<!--     using plain Java
        <h2>Result is:<%= session.getAttribute("result") %></h2>  -->


       <!--  using jstl tags -->
        <h2>Result is: ${result}  </h2> -->
         <h2>Result is: ${alien}  </h2>

</body>
</html>