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
<h1>The div element</h1>

<div class="myDiv">
  <h2>Choose From the below package  </h2>
  <p>Book Now to avail 10% discount</p>
</div>

<br>
<br>

<div class="myDiv">
<h1>Golden Amritsar Package</h1>
<p>4 Days 3Night(Breakfast, Lunch, Included)</p>
<p>Day 1 - Rest At 5 start Hotel</p>
<p>Day 2 - Visit to Golden Temple and taste of the Langar</p>
<p>Day 3 - Reteriving memory from 1919 at Jaliawala Bagh</p>
<p>Day 4 - Invoking Patrotism while watching Prade at Bagha Border </p>
<p>Avail All this at Just Rs</p>
<form action="offers" >
<input type="hidden" name ="pid" value="1234">
<input type="submit" name="book" value="6000" >
</form>
</div>


<br>
<br>

<div class="myDiv">
<h1>Summery Goa Package</h1>
<p>2 Days 1Night(Breakfast, Lunch, Included)</p>
<p>5 Star Hotel Stay</p>
<p>RAve Party</p>
<p>Booze and Bone FIre PArty</p>
<p>Avail All this at Just Rs</p>
<form action="offers" >
<input type="submit" name="book" value="5000" >
</form>
</div>


<br>
<br>

<div class="myDiv">
<h1>Chilli Kashmir PAckage</h1>
<p>4 Days 3Night(Breakfast, Lunch, Included)</p>
<p>Stay at 5 Star Hotel</p>
<p>One day Boat House Stay</p>
<p>Visting at Valleys</p>
<p>Snow Fight </p>
<p>Avail All this at Just Rs</p>
<form action="offers">
<input type="submit" name="book" value=8000 >
</form>
</div>

<p>This is some text outside the div element.</p>
</body>
</html>