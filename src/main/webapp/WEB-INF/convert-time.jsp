<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Time Converter</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<div class="container my-4">
    <div class="row">
        <div class="col-6">
            <h1>Convert Time</h1>
            <p class="lead">Select the type of conversion you would like to perform and enter a number.
                <br />Press enter to see the result.</p>
            <form method="post" action="convert-time">
                <select name="timePeriod" class="form-select" aria-label="Select a time period">
                    <option>Select a conversion type</option>
                    <option ${results.timePeriod == 'SectoMin' ? 'selected' : ''} value="SectoMin" name="conversion" id="SectoMin">Seconds to Minute</option>
                    <option ${results.timePeriod == 'SectoHours' ? 'selected' : ''} value="SectoHours" name="conversion" id="SectoHr">Seconds to Hours</option>
                    <option ${results.timePeriod == 'MintoSec' ? 'selected' : ''} value="MintoSec" name="conversion" id="MintoSec">Minutes to Seconds</option>
                    <option ${results.timePeriod == 'MintoHr' ? 'selected' : ''} value="MintoSHr" name="conversion" id="MintoHr">Minutes to Hours</option>
                    <option ${results.timePeriod == 'HrtoSec' ? 'selected' : ''} value="HrtoSec" name="conversion" id="HrtoSec">Hours to Seconds</option>
                    <option ${results.timePeriod == 'HrtoMin' ? 'selected' : ''} value="HrtoMin" name="conversion" id="HrtoMin">Hours to Minutes</option>
                </select>
                <div class="form-select">
                    <%--@declare id="num"--%><label for="num"> Enter a number: </label>
                    <input value="${results.num}" type="text" id="num" name="number">
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form>

            <c:if test="${results.numConverted != ''}">
                <p> ${results.numConverted}</p>
            </c:if>
            <c:if test="${results.conversionError != ''}">
                <p> ${results.conversionError}</p>
            </c:if>
            <c:if test="${results.numError != ''}">
                <p> ${results.numError}</p>
            </c:if>

        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>
</html>