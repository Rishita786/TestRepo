<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.myDiv {
  border: 5px outset red;
  background-color: lightblue;    
  text-align: center;
}
</style>
</head>
<body>
package selected: ${ans}
<div class="myDiv">
<form action=test>
<!--  Enter your id: <input type="text" name="bid"><br>-->
Enter your name: <input type="text" name="bname"><br>
Enter your Phone number:<input type="text" name="bnumber"><br>
Enter your email:<input type="text" name="bemail"><br>
<input type="submit">
</form>
</div>

</body>
</html>