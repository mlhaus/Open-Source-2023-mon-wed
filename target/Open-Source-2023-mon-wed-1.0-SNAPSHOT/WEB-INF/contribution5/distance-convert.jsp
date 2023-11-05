<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <h1>Distance Conversion </h1>
            <p class="lead">Select the type of conversion you would like to perform and enter the distance.
                <br />Press enter to see the result.</p>
            <form method="POST" action="distance-convert">
                <div class="form-group mb2">
                    <label for="conversion"> Select Conversion :</label>
                    <select class="form-select" id="conversion" name="conversion">
                        <option selected>Select a conversion method</option>
                        <option ${results.conversion == 'MeterstoMiles' ? 'selected' : ''} value="MeterstoMiles">Meters to Miles</option>
                        <option ${results.conversion == 'MilestoMeters' ? 'selected' : ''} value="MilestoMeters">Miles to Meters</option>
                        <option ${results.conversion == 'MeterstoKilometers' ? 'selected' : ''} value="MeterstoKilometers">Meters to Kilometers</option>
                        <option ${results.conversion == 'KilometerstoMeters' ? 'selected' : ''} value="KilometerstoMeters">Kilometers to Meters</option>
                        <option ${results.conversion == 'MilestoKilometers' ? 'selected' : ''} value="MilestoKilometers">Miles to Kilometers</option>
                        <option ${results.conversion == 'KilometerstoMiles' ? 'selected' : ''} value="KilometerstoMiles">Kilometers to Miles</option>
                    </select>

                </div>
                <div class="form-group mb-2">
                    <label for="distance">Distance:</label>
                    <input value="${results.distance}" type="text" class="form-control" id="distance" name="distance">
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
            <c:if test="${results.distConvert != ''}">
                <p>${results.distConvert}</p>
            </c:if>
            <c:if test="${results.conversionError != ''}">
                <p>${results.conversionError}</p>
            </c:if>
            <c:if test="${results.DistanceError != ''}">
                <p>${results.DistanceError}</p>
            </c:if>

        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>
</html>

