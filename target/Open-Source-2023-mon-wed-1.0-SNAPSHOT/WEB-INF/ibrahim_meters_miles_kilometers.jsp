
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Ibrahim's Conversion Calculator (Meters, Miles, Kilometers)</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
    <div class="container my-4">
        <h1> Meters-Miles-Kilometers Convertor </h1>
        <br/>
        <h2>Choose a Conversion Unit</h2>
        <form method="POST" action="ibrahim_meters_miles_kilometers">
            <select name="unitOfMeasure" class="form-select">

                <option>
                    Select a Unit Measure
                </option>

                <option ${results.unitOfMeasure == 'm' ? 'selected' : ''} value="m">
                    Meters
                </option>

                <option ${results.unitOfMeasure == 'mi' ? 'selected' : ''} value="mi">
                    Miles
                </option>

                <option ${results.unitOfMeasure == 'km' ? 'selected' : ''} value="km">
                    Kilometers
                </option>

            </select>
            <br/>
            <h2>Select Unit to Convert to</h2>

            <select name="toConvertedUnitOfMeasure" class="form-select">

                <option>
                    Select a Unit Measure
                </option>

                <option ${results.toConvertedUnitOfMeasure == 'm' ? 'selected' : ''} value="m">
                    Meters
                </option>

                <option ${results.toConvertedUnitOfMeasure == 'mi' ? 'selected' : ''} value="mi">
                    Miles
                </option>

                <option ${results.toConvertedUnitOfMeasure == 'km' ? 'selected' : ''} value="km">
                    Kilometers
                </option>

            </select>
            <br/>
            <div class="form-group mb-2">
                <label for="convertUnitOfMeasure"> Value to Convert:</label>
                <input type="text" class="form-control" id="convertUnitOfMeasure" name="convertUnitOfMeasure" value="${results.convertUnitOfMeasure}">
            </div>
            <br/>
            <button type="submit" class="btn-primary">
                Submit
            </button>

        </form>
        <c:if test="${!results.measureError.isEmpty()}">
            <p>
                    ${results.measureError}
            </p>
        </c:if>

        <c:if test="${!results.invalidInputError.isEmpty()}">
            <p>
                    ${results.invalidInputError}
            </p>
        </c:if>
        <c:if test="${!results.miValue.isEmpty()}">
            <p>
                    ${results.miValue}
            </p>
        </c:if>
        <c:if test="${!results.mValue.isEmpty()}">
            <p>
                    ${results.mValue}
            </p>
        </c:if>
        <c:if test="${!results.kmValue.isEmpty()}">
            <p>
                    ${results.kmValue}
            </p>
        </c:if>




    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
            crossorigin="anonymous">
    </script>
</body>
</html>
