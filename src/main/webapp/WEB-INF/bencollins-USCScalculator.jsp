<%--
  Created by IntelliJ IDEA.
  User: Ben Collins
  Date: 10/31/2023
  Time: 7:09 PM
--%>
<%--@elvariable id="results" type="com.kirkwood.bencollins.BenCollinsServlet"--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Ben's US Customary System Conversion Calculator</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    </head>
    <body>
    <div class="container my-4">
        <div class="row">
            <div class="col-6">
                <h1>Convert Measurements</h1>
                <p class="lead">Select the type of conversion you would like to perform and enter the measurement.
                    <br />Press enter to see the result.</p>
                <form method="POST" action="uscs-calculator">
                    <h4>Convert Measurement From:</h4>
                    <div class="btn-group mb-2" role="group" aria-label="Basic radio toggle button group">
                        <select name="conversionFrom" class="form-select" aria-label="Select a measurement unit">
                            <option>
                                Select a measurement unit
                            </option>
                            <option ${results.conversionFrom == 'fromYards' ? 'selected' : ''} value="fromYards" id="fromYard">
                                Yards
                            </option>
                            <option ${results.conversionFrom == 'fromFeet' ? 'selected' : ''} value="fromFeet" id="fromFeet">
                                Feet
                            </option>
                            <option ${results.conversionFrom == 'fromInches' ? 'selected' : ''} value="fromInches" id="fromInches">
                                Inches
                            </option>
                        </select>
                    </div>
                    <h4>Convert Measurement To:</h4>
                    <div class="btn-group mb-2" role="group" aria-label="Basic radio toggle button group">
                        <select name="conversionTo" class="form-select" aria-label="Select a measurement unit">
                            <option>
                                Select a measurement unit
                            </option>
                            <option ${results.conversionTo == 'toYards' ? 'selected' : ''} value="toYards" id="toYard">
                                Yards
                            </option>
                            <option ${results.conversionTo == 'toFeets' ? 'selected' : ''} value="toFeet" id="toFeet">
                                Feet
                            </option>
                            <option ${results.conversionTo == 'toInches' ? 'selected' : ''} value="toInches" id="toInches">
                                Inches
                            </option>
                        </select>
                    </div>

                    <div class="form-group mb-2">
                        <label for="valueInput">Enter the value:</label>
                        <input value="${results.valueInput}" type="text" class="form-control" id="valueInput" name="valueInput">
                    </div>

                    <button type="submit" class="btn btn-primary">Submit</button>
                </form>

                <c:if test="${!results.convertedValue.isEmpty()}">
                    <p>
                            ${results.convertedValue}
                    </p>
                </c:if>
                <c:if test="${!results.conversionFromNotSelectedError.isEmpty()}">
                    <p>
                            ${results.conversionFromNotSelectedError}
                    </p>
                </c:if>
                <c:if test="${!results.conversionToNotSelectedError.isEmpty()}">
                    <p>
                            ${results.conversionToNotSelectedError}
                    </p>
                </c:if>
                <c:if test="${!results.valueInputNotANumberError.isEmpty()}">
                    <p>
                            ${results.valueInputNotANumberError}
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
