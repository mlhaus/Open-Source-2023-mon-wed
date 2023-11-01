<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title>My Calculator App</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<div class="container my-4">
  <div class="row">
    <div class="col-6">
      <h1>Add</h1>
      <p class="lead">Enter two numbers and press calculate inches, feet, yards.</p>
      <form method="POST" action="tyler-calculator">
        <div class="form-group mb-2">
          <label for="firstNumber">Inches:</label>
          <input name="num1" value="${results.get("num1")}" type="text" class="form-control" id="firstNumber">
        </div>
        <select name="timePeriod" class="form-select" aria-label="Select what to convert inches to">
          <option>Select a time period</option>
          <option ${results.timePeriod == 'inch' ? 'selected' : ''} value="inch">Inches</option>
          <option ${results.timePeriod == 'feet' ? 'selected' : ''} value="feet">Feet</option>
          <option ${results.timePeriod == 'yard' ? 'selected' : ''} value="yard">Yards</option>
        </select>
        <button type="submit" class="btn btn-primary">Submit</button>
      </form>
      <c:if test="${!results.convertOutput.isEmpty()}"><p>${results.num1} inch(es) equals ${results.convertOutput} ${results.timePeriod}</p></c:if>
    </div>
  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>
