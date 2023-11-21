<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Distance Converter</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<div class="container my-4">
    <div class="row">
        <div class="col-6">
            <h1>Convert Distance</h1>
            <p class="lead">Select the type of conversion you would like to perform and enter the distance.
                <br />Press enter to see the result.</p>
            <form method="POST" action="convert-dis">
                <select name="conversion" class="form-select" aria-label="Select a conversion">
                    <option>Select a type of conversion</option>
                    <option ${results.conversion == 'InchToFeet' ? 'selected' : ''} value="InchToFeet">Inches to Feet</option>
                    <option ${results.conversion == 'FeetToInch' ? 'selected' : ''} value="FeetToInch">Feet to Inches</option>
                    <option ${results.conversion == 'FeetToYards' ? 'selected' : ''} value="FeetToYards">Feet to Yards</option>
                    <option ${results.conversion == 'YardsToFeet' ? 'selected' : ''} value="YardsToFeet">Yards to Feet</option>
                    <option ${results.conversion == 'InchToYards' ? 'selected' : ''} value="InchToYards">Inches to Yards</option>
                    <option ${results.conversion == 'YardsToInch' ? 'selected' : ''} value="YardsToInch">Yards to Inches</option>
                </select>

                <div class="form-group mb-2">
                    <label for="distance">Distance:</label>
                    <input value="${results.distance}" type="text" class="form-control" id="distance" name="distance">
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form>


            <c:if test="${results.distance != ''}">
                <p>${results.distanceConverted}</p>
            </c:if>
            <c:if test="${results.conversionError != ''}">
                <p>${results.conversionError}</p>
            </c:if>
            <c:if test="${results.distanceError != ''}">
                <p>${results.distanceError}</p>
            </c:if>


        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>
</html>