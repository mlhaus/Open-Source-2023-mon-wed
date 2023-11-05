<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>
            Kate's Compound Interest Calculator
        </title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
              crossorigin="anonymous">
    </head>
    <body>
    <div class="container my-4">
        <div class="row">
            <div class="col-6">
                <h1>
                    Kate's Compound Interest Calculator
                </h1>
                <p class="lead">
                    Choose a time period, then enter the present value, the annual interest rate percentage,
                    and the number of time periods your assets will be earning interest.
                    <br />
                    Press enter to see the result.
                </p>
                <form method="POST" action="kate_compound_interest">
                    <select name="timePeriod" class="form-select" aria-label="Select a time period">
                        <option>
                            Select a time period.
                        </option>
                        <option ${results.timePeriod == 'mo' ? 'selected' : ''} value="mo">
                            Month
                        </option>
                        <option ${results.timePeriod == 'yr' ? 'selected' : ''} value="yr">
                            Year
                        </option>
                    </select>
                    <div class="form-group mb-2">
                        <label for="presentValue">
                            Present Value:
                        </label>
                        <input value="${results.presentValue}" type="text" class="form-control" id="presentValue"
                               name="presentValue">
                    </div>
                    <div class="form-group mb-2">
                        <label for="annualInterestRate">
                            Annual Interest Rate:
                        </label>
                        <input value="${results.annualInterestRate}" type="text" class="form-control"
                               id="annualInterestRate" name="annualInterestRate">
                    </div>
                    <div class="form-group mb-2">
                        <label for="numberOfTimePeriods">
                            Number of Time Periods:
                        </label>
                        <input value="${results.numberOfTimePeriods}" type="text" class="form-control"
                               id="numberOfTimePeriods" name="numberOfTimePeriods">
                    </div>
                    <button type="submit" class="btn btn-primary">
                        Submit
                    </button>
                </form>
                <c:if test="${!results.futureValue.isEmpty()}">
                    <p>
                        ${results.futureValue}
                    </p>
                </c:if>
                <c:if test="${!results.timePeriodError.isEmpty()}">
                    <p>
                        ${results.timePeriodError}
                    </p>
                </c:if>
                <c:if test="${!results.presentValueError.isEmpty()}">
                    <p>
                        ${results.presentValueError}
                    </p>
                </c:if>
                <c:if test="${!results.interestRateError.isEmpty()}">
                    <p>
                        ${results.interestRateError}
                    </p>
                </c:if>
                <c:if test="${!results.numberOfTimePeriodsError.isEmpty()}">
                    <p>
                        ${results.numberOfTimePeriodsError}
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