<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>
            Andrew's Inches, Feet, and Yards, Calculator
        </title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
              crossorigin="anonymous">
    </head>
    <body>
    <div class="container my-3">
        <div class="row">
            <div class="col-6">
                <h1>Andrew's Inches, Feet, and Yards, Calculator</h1>
                <p>
                    Select a unit of measurement and input a valid number.
                </p>
                <form method="POST" action="andrew_inches_feet_yards">
                    <select name="unitOfMeasure" class="form-select">
                        <option>
                            Select a Unit of Measure.
                        </option>
                        <option ${results.unitOfMeasure == 'in' ? 'selected' : ''} value="in">
                            Inches
                        </option>
                        <option ${results.unitOfMeasure == 'ft' ? 'selected' : ''} value="ft">
                            Feet
                        </option>
                        <option ${results.unitOfMeasure == 'yd' ? 'selected' : ''} value="yd">
                            Yards
                        </option>
                    </select>
                    <div class="form-group mb-2">
                        <label for="convertUnitOfMeasure"> Unit to Convert:</label>
                        <input type="text" class="form-control" id="convertUnitOfMeasure" name="convertUnitOfMeasure" value="${results.convertUnitOfMeasure}">
                    </div>
                    <button type="submit" class="btn btn-primary">
                        Submit
                    </button>
                </form>
                <c:if test="${results.unitOfMeasureError != null}">
                    <p>${results.unitOfMeasureError}</p>
                </c:if>
                <c:if test="${results.invalidNumberError != null}">
                    <p>${results.invalidNumberError}</p>
                </c:if>
                <c:if test="${!results.inchesValue.isEmpty()}">
                    <p>
                        ${results.inchesValue}
                    </p>
                </c:if>
                <c:if test="${!results.feetValue.isEmpty()}">
                    <p>
                            ${results.feetValue}
                    </p>
                </c:if>
                <c:if test="${!results.yardsValue.isEmpty()}">
                    <p>
                            ${results.yardsValue}
                    </p>
                </c:if>
            </div>
        </div>
    </div>



    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
            crossorigin="anonymous">
    </script>
    </body>
</html>
