<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 10/30/2023
  Time: 1:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="jakarta.tags.core" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Future Value</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

</head>
<body>
<br />
    <div class="container col-md-6 m-6 border border-primary rounded-3">
        <form action="chrisFutureValue" method="post">
            <div class="row">
                <div class="col-md-5">
                    <h5 class="m-3">Input</h5>
                    <label class="form-label mx-3 mt-2" for="value">Present Value</label>
                    <input class="form-control mx-3" id="value" name="value" type="text"
                           value="${results.value}"/>

                    <label class="form-label mx-3 mt-2" for="rate">Annual Percentage Rate (0-100%)</label>
                    <input class="form-control mx-3" id="rate" name="rate" type="text"
                           value="${results.rate}"/>

                    <div class="row mx-2">
                        <div class="form-check mx-3 mt-2">
                            <input class="form-check-input" type="checkbox" name="eapr" id="eapr"
                                ${results.eapr == 'on' ? 'checked' : ''}/>
                            <label class="form-label" for="eapr">Effective APR</label>
                        </div>
                    </div>

                    <label class="form-label mx-3 mt-2" for="time">Time Period</label>
                    <input class="form-control mx-3" id="time" name="time" type="text"
                           value="${results.time}"/>

                    <label class="form-label mx-3 mt-2" for="increment"></label>
                    <select id="increment" name="increment" class="form-select mx-3" aria-label="Select a time period">
                        <option value="--">Select a time period</option>
                        <option ${results.increment == 'mo' ? 'selected' : ''} value="mo">Month</option>
                        <option ${results.increment == 'yr' ? 'selected' : ''} value="yr">Year</option>
                    </select>
                    <br />
                    <input class="btn btn-primary mx-3 mb-3" type="submit" name="submit" value="Future Value">
                </div>
                <div class="col-md-4">
                    <h5 class="m-3">Results</h5>
                    <c:if test="${results.fv != ''}">
                        <p class="m-3"><c:out value="${results.fv}"/></p>
                    </c:if>
                    <c:if test="${results.valueError != ''}">
                        <p class="m-3"><c:out value="${results.valueError}"/></p>
                    </c:if>
                    <c:if test="${results.rateError != ''}">
                        <p class="m-3"><c:out value="${results.rateError}"/></p>
                    </c:if>
                    <c:if test="${results.timeError != ''}">
                        <p class="m-3"><c:out value="${results.timeError}"/></p>
                    </c:if>
                    <c:if test="${results.incrementError != ''}">
                        <p class="m-3"><c:out value="${results.incrementError}"/></p>
                    </c:if>
                </div>
            </div>
        </form>
    </div>
</body>
</html>
