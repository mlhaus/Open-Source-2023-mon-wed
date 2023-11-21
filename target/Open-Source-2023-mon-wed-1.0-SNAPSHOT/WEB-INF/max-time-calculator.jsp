<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Pc
  Date: 11/12/2023
  Time: 8:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Time Conversion</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<div class="container my-4">
    <div class="row">
        <div class="col-6">
            <h1>Time Converter</h1>
            <p class="lead">Please choose what units of time to convert, and input an amount of time.
                <br />Press enter to see the conversion.</p>
            <form method="POST" action="max-time-calculator">
                <select class="form-select mb-4" name ="convertFrom" aria-label="Convert from:">
                    <option>Select a time to convert</option>
                    <option ${results.convertFrom == 'second' ? 'selected': ''} value="second">Seconds</option>
                    <option ${results.convertFrom == 'minute' ? 'selected': ''} value="minute">Minutes</option>
                    <option  ${results.convertFrom == 'hour' ? 'selected': ''} value="hour">Hours</option>
                </select>
                <select class="form-select mb-4" name ="convertTo" aria-label="Convert to:">
                    <option>Select a time to convert</option>
                    <option ${results.convertTo == 'second' ? 'selected': ''} value="second">Seconds</option>
                    <option ${results.convertTo == 'minute' ? 'selected': ''} value="minute">Minutes</option>
                    <option  ${results.convertTo == 'hour' ? 'selected': ''} value="hour">Hours</option>
                </select>
                <div class="form-group mb-2">
                    <label for="timeToConvert"> Enter the time to convert</label>
                    <input value="${results.timeToConvert}" type="text" class="form-control" id="timeToConvert" name="timeToConvert">
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
                <c:if test="${results.converted != ''}">
                    <p>${results.converted}</p>
                </c:if>
                <c:if test="${results.convertError != ''}">
                    <p>${results.convertError}</p>
                </c:if>
                <c:if test="${results.timeToConvertError != ''}">
                    <p>${results.timeToConvertError}</p>
                </c:if>
            </form>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>
</html>
