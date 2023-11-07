<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Temperature Converter</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<div class="container my-4">
    <div class="row">
        <div class="col-8">
            <h1>Convert Fraction</h1>
            <p class="lead">Select the type of conversion you would like to perform on the fraction then enter your
                fraction.
                <br/>Press enter to see the result.</p>
            <form method="POST" action="convert-fraction">
                <select name="conversion" class="form-select mb-2" aria-label="Select conversion type">
                    <option selected>Select conversion type</option>
                    <option ${results.convertion == 'Simplify' ? 'selected': ''} value="Simplify">Simplify</option>
                    <option ${results.convertion == 'MixedNumber' ? 'selected': ''} value="MixedNumber">Mixed Number
                    </option>
                </select>

                <div class="form-group mb-2">
                    <label for="numerator">Numerator:</label>
                    <input name="numerator" value="${results.get("numerator")}" type="text" class="form-control"
                           id="numerator">
                </div>
                <div class="form-group mb-2">
                    <label for="denominator">Denominator:</label>
                    <input name="denominator" value="${results.get("denominator")}" type="text" class="form-control"
                           id="denominator">
                </div>
                <button type="submit" class="btn btn-primary mt-2">Submit</button>
            </form>
            <div class="container my-4">
                <c:if test="${results.simplifiedFraction != ''}">
                    <p>${results.simplifiedFraction}</p>
                </c:if>
                <c:if test="${results.MixedNumberFraction != ''}">
                    <p>${results.MixedNumberFraction}</p>
                </c:if>
                <c:if test="${results.conversionError != ''}">
                    <p>${results.conversionError}</p>
                </c:if>
                <c:if test="${results.numeratorError != ''}">
                    <p>${results.numeratorError}</p>
                </c:if>
                <c:if test="${results.denominatorError != ''}">
                    <p>${results.denominatorError}</p>
                </c:if>

            </div>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>
</html>