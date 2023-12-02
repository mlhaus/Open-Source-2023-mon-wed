<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Measure Converter</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<div class="container my-4">
    <div class="row">
        <div class="col-6">
            <h1>Convert Measure</h1>
            <p class="lead">Please select the options that you would like to convert between
                <br /> Hit enter to preform the operation</p>
            <form method="POST" action="wyatt_conversion">
                <div class="btn-group mb-2" role="group" aria-label="Basic radio toggle button group">
                    <select name="fromConversion" class="form-select" aria-label="Select a time period">
                        <option>Select a measurement</option>
                        <option ${results.fromConversion == 'pt' ? 'selected' : ''} value="pt">Pint</option>
                        <option ${results.fromConversion == 'c' ? 'selected' : ''} value="c">Cup</option>
                        <option ${results.fromConversion == 'qrt' ? 'selected' : ''} value="qrt">Quart</option>
                    </select>
                    <br />
                    <select name="toConversion" class="form-select" aria-label="Select a time period">
                        <option>Select a measurement</option>
                        <option ${results.toConversion == 'pt' ? 'selected' : ''} value="pt">Pint</option>
                        <option ${results.toConversion == 'c' ? 'selected' : ''} value="c">Cup</option>
                        <option ${results.toConversion == 'qrt' ? 'selected' : ''} value="qrt">Quart</option>
                    </select>
                </div>
                <div class="form-group mb-2">
                    <label for="amount">Amount:</label>
                    <input value="${results.amount}" type="text" class="form-control" id="amount" name="amount">
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
            <c:if test="${results.amountConverted != ''}">
                <p>${results.amountConverted}</p>
            </c:if>
            <c:if test="${results.fromConversionError != ''}">
                <p>${results.fromConversionError}</p>
            </c:if>
            <c:if test="${results.toConversionError != ''}">
                <p>${results.toConversionError}</p>
            </c:if>
            <c:if test="${results.amountError != ''}">
                <p>${results.amountError}</p>
            </c:if>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
    crossorigin="anonymous"></script>
</body>
</html>
