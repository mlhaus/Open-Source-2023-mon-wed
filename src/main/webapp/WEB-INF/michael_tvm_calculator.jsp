<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Michael
  Date: 11/2/2023
  Time: 4:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Map<String, String> results = (HashMap<String, String>)request.getAttribute("results");
    if(results == null){
        results = new HashMap<>();
    }
//    String results = (String)request.getAttribute("results");
//    if(results == null){
//        results = "";
//    }
%>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
          crossorigin="anonymous">
    <title>TVM Calculator</title>
</head>
<body>
    <div class="container my-4">
        <div class="row">
            <div class="col-6">
                <h1>TVM Calculator</h1>
                <form method="POST" action="michael_tvm_calculator">
                    <div class="form-group mb-4">
                        <label for="presentValue">Present Value</label>
                        <div class="col-4">
                            <input name="presentValue" value="${results.get("presentValue")}" type="text"
                                   class="form-control"  id="presentValue">
                        </div>
                    </div>
                    <div class="form-group mb-2 col-6">
                        <label for="interestRate">Interest Rate (compounded by period)</label>
                        <br>
                        <div class="d-inline-block col-4">
                            <input name="interestRate" value="${results.get("interestRate")}" type="text"
                                   class="form-control" id="interestRate">
                        </div>

                        <div class="d-inline-block col-1">
                            <p>%</p>
                        </div>
                    </div>
                    <div class="form-group mb-2">
                        <div class="col-4 d-inline-block">
                            <label for="numberOfPeriods">Periods</label>
                            <input name="numberOfPeriods" value="${results.get("numberOfPeriods")}" type="text"
                                   class="form-control" id="numberOfPeriods">
                        </div>
                        <div class="col-3 d-inline-block">
                            <select name="usesMonths" id="usesMonths" class="form-select" area-label="select months or years">
                                <option value="months" ${results.get("usesMonths").equals("months") ? 'selected' : ''}>Months</option>
                                <option value="years" ${results.get("usesMonths").equals("years") ? 'selected' : ''}>Years</option>
                            </select>
                        </div>
                    </div>
                    <button type="submit", class="btn btn-primary">Calculate Future Value</button>
                </form>
                <div class="mb-2 col6">
                    <p>${results.get("futureValue")}</p>
                </div>
            </div>
        </div>

    </div>
    <br>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
            crossorigin="anonymous"></script>
</body>
</html>
