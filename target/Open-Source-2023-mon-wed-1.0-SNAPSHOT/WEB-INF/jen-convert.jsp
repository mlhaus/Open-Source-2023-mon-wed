<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: jnice
  Date: 11/1/2023
  Time: 3:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Jennifer's Measurement Conversion Calculator</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
    <div class="container my-4">
        <div class="row">
            <div class="col-6">
                <h1>Conversion Calculator</h1>
                <p class="lead">Enter the beginning quantity in whole numbers<br />or decimals (no fractions) and then select
                    <br />the units of conversion you would like to perform.
                    <br />
                    <br />Press the submit button to see the result.</p>
                <br>
                <form method="POST" action="jen-convert">
                    <div class="form-group mb-2">
                        <label for="quantity">Original numeric quantity:</label>
                        <input type="text" value="${results.quantity}"  class="form-control" id="quantity" name="quantity">
                    </div>
                    <br>
                    <div>
                        <select name="conversion" class="form-select" id="conversion"  aria-label="Select a measurement to convert from:">
                            <option>Select a measurement to convert from:             </option>
                            <option ${results.conversion == 'OtoC' ? 'selected' : ''} value="OtoC">From Ounces to Cups</option>
                            <option ${results.conversion == 'OtoP' ? 'selected' : ''} value="OtoP">From Ounces to Pints</option>
                            <option ${results.conversion == 'CtoO' ? 'selected' : ''} value="CtoO">From Cups to Ounces</option>
                            <option ${results.conversion == 'CtoP' ? 'selected' : ''} value="CtoP">From Cups to Pints</option>
                            <option ${results.conversion == 'PtoC' ? 'selected' : ''} value="PtoC">From Pints to Cups</option>
                            <option ${results.conversion == 'PtoO' ? 'selected' : ''} value="PtoO">From Pints to Ounces</option>
                        </select>
                    </div>
                    <br>
                    <br>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </form>
                <br>
                <br>
                <c:if test="${results.quantityConverted !=''}">
                   <p>${results.quantityConverted}</p>
                </c:if>
                <c:if test="${results.conversionError !=''}">
                    <p>${results.conversionError}</p>
                </c:if>
                <c:if test="${results.quantityError !=''}">
                    <p>${results.quantityError}</p>
                </c:if>
            </div>
        </div>
    </div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>
</html>
