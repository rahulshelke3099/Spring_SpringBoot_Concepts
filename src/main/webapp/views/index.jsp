<%@page language="java" %>
<html>
<head>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<h2>Calculator</h2>
<p> Welcome to ${course} world !!!</p>

<form action="add">
                <label for="num1">Enter 1st Number :</label>
                <input type="text" id=num1" name="num1"><br>
                <label for="num2">Enter 2nd Number :</label>
                <input type="text" id="num2" name="num2"><br>
                <input type="submit" value="Submit">
</form>

<form action="addAlien">
<label for="aid">Enter Id :</label>
<input type="text" id="aid" name="aid"><br>
<label for="aname">Enter Name :</label>
<input type="text" id="aname" name="aname"><br>
<input type="submit" value="Submit">
</form>

</body>
</html>