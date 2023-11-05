<%--
  Created by IntelliJ IDEA.
  User: jared
  Date: 10/31/2023
  Time: 4:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Volume Converter</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<div class="container my-4">
    <div class="row">
        <div class="col-6">
            <h1>Volume Converter</h1>
            <p class="lead">
                <br />Press the "Convert" button below.</p>
            <form method="POST" action="jared_volume_conversion">
                <p>Converting from: </p>
                <select name="startingUnit" aria-label="Select the unit to convert from: ">
                    <option ${results.startingUnit == 'ounces' ? 'selected' : ''} value="ounces">Ounces</option>
                    <option ${results.startingUnit == 'cups' ? 'selected' : ''} value="cups">Cups</option>
                    <option ${results.startingUnit == 'pints' ? 'selected' : ''} value="pints">Pints</option>
                    <option ${results.startingUnit == 'quarts' ? 'selected' : ''} value="quarts">Quarts</option>
                    <option ${results.startingUnit == 'gallons' ? 'selected' : ''} value="gallons">Gallons</option>
                </select>
                <p>To: </p>
                <select name="resultingUnit" aria-label="Select the unit to convert to: ">
                    <option ${results.resultingUnit == 'ounces' ? 'selected' : ''} value="ounces">Ounces</option>
                    <option ${results.resultingUnit == 'cups' ? 'selected' : ''} value="cups">Cups</option>
                    <option ${results.resultingUnit == 'pints' ? 'selected' : ''} value="pints">Pints</option>
                    <option ${results.resultingUnit == 'quarts' ? 'selected' : ''} value="quarts">Quarts</option>
                    <option ${results.resultingUnit == 'gallons' ? 'selected' : ''} value="gallons">Gallons</option>
                </select>

                <div class="form-group mb-2">
                    <label for="inputNumber">Number:</label>
                    <input value="${results.inputNumber}" type="text" class="form-control" id="inputNumber" name="inputNumber">
                </div>

                <button type="submit" class="btn btn-primary">Convert</button>
            </form>

            <c:if test="${results.resultingValue != ''}">
                <p>${results.resultingValue}</p>
            </c:if>
            <c:if test="${results.conversionError != ''}">
                <p>${results.conversionError}</p>
            </c:if>
        </div>
    </div>
</div>
</body>
</html>
