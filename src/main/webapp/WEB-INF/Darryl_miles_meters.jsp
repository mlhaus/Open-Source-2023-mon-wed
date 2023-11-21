<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Darryl's Mile to Meter Calculator</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
    <div class="container my-4">
        <h1>Darryl's Mile to Meter Calculator</h1>
        <p>Choose a Type of distance between miles, kilometers, or meters, pick an amount, and convert to one of the other types to get your new distance!</p>
        <form method="POST" action="Darryl_miles_meters">
            <select name="DistanceType" class="form-select" aria-label="Select a Distance Type">
                <option>
                    Select a Distance Type.
                </option>
                <option ${results.DistanceType == 'Miles' ? 'selected' : ''} value="Miles">
                    Miles
                </option>
                <option ${results.DistanceType == 'Kilometers' ? 'selected' : ''} value="Kilometers">
                    Kilometers
                </option>
                <option ${results.DistanceType == 'Meters' ? 'selected' : ''} value="Meters">
                    Meters
                </option>
            </select>
            <div class="form-group mb-2">
                <label for="Distance">Input Distance:</label>
                <input name="Distance" value="${results.get("Distance")}" type="text" class="form-control" id="Distance">
            </div>
            <select name="DistanceType2" class="form-select" aria-label="Select a 2nd Distance Type to convert to">
                <option>
                    Select a 2nd Distance Type to convert to
                </option>
                <option ${results.DistanceType2 == 'Miles' ? 'selected' : ''} value="Miles">
                    Miles
                </option>
                <option ${results.DistanceType2 == 'Kilometers' ? 'selected' : ''} value="Kilometers">
                    Kilometers
                </option>
                <option ${results.DistanceType2 == 'Meters' ? 'selected' : ''} value="Meters">
                    Meters
                </option>
            </select>

            <button type="submit" class="btn btn-primary">
                Submit
            </button>
        </form>
        <c:if test="${!results.NewDistance.isEmpty()}">
            <p>
                    ${results.NewDistance}
            </p>
        </c:if>
        <c:if test="${!results.DistanceError1.isEmpty()}">
            <p>
                    ${results.DistanceError1}
            </p>
        </c:if>
        <c:if test="${!results.DistanceError2.isEmpty()}">
            <p>
                    ${results.DistanceError2}
            </p>
        </c:if>
        <c:if test="${!results.IncorrectInput.isEmpty()}">
            <p>
                    ${results.IncorrectInput}
            </p>
        </c:if>




    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>
