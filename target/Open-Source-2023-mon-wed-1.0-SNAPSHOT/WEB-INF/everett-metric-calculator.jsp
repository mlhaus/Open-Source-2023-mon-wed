<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Metric Conversion</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<div class="container my-4">
    <div class="row">
        <div class="col-6">
            <h1>Convert between meters, miles, and kilometers</h1>
            <p class="lead">Select the type of conversion you would like to perform and enter the unit of distance.
                <br />Press enter to see the result.</p>
            <form method="POST" action="everett-metric-calculator">
                <h4>Select a unit of Distance</h4>
                <select name="fromConversion" class="form-select" aria-label="Select a unit of measurement">
                    <option>
                        Select a unit of distance.
                    </option>
                    <option ${results.fromConversion == 'Miles' ? 'selected' : ''} value="Miles">
                        Miles
                    </option>
                    <option ${results.fromConversion == 'Meters' ? 'selected' : ''} value="Meters">
                        Meters
                    </option>
                    <option ${results.fromConversion == 'Kilometers' ? 'selected' : ''} value="Kilometers">
                        Kilometers
                    </option>
                </select>
                <br>
                <h4>Select Distance to Convert to</h4>
                <select name="toConversion" class="form-select" aria-label="Select conversion distance">
                    <option>
                        Select unit of distance to covert to.
                    </option>
                    <option ${results.toConversion == 'Miles' ? 'selected' : ''} value="Miles">
                        Miles
                    </option>
                    <option ${results.toConversion == 'Meters' ? 'selected' : ''} value="Meters">
                        Meters
                    </option>
                    <option ${results.toConversion == 'Kilometers' ? 'selected' : ''} value="Kilometers">
                        Kilometers
                    </option>
                </select>
                <br>
                <div class="form-group mb-2">
                    <label for="distance">Enter the Distance you want to convert:</label>
                    <input value="${results.distance}" type="text" class="form-control" id="distance" name="distance">
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form>

            <c:if test="${!results.alteredValue.isEmpty()}">
                <p>
                        ${results.alteredValue}
                </p>
            </c:if>
            <c:if test="${!results.fromConversionError.isEmpty()}">
                <p>
                        ${results.fromConversionError}
                </p>
            </c:if>
            <c:if test="${!results.toConversionError.isEmpty()}">
                <p>
                        ${results.toConversionError}
                </p>
            </c:if>
            <c:if test="${!results.distanceError.isEmpty()}">
                <p>
                        ${results.distanceError}
                </p>
            </c:if>

        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>
</html>