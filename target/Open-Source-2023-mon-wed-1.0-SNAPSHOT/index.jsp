<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>

<html>
<head>
    <title>Conversion Calculator</title>
</head>
<body>

<h1>Conversion Calculator</h1>

<form action="conversionCalculator" method="GET">

<%--    <select name="unit" class="form-select" aria-label="Select a unit of measurement">--%>
<%--        <option ${conversionResults.unit == 'meters' ? 'selected' : ''} value="meters">Meters</option>--%>
<%--        <option ${conversionResults.unit == 'kilometers' ? 'selected' : ''} value="kilometers">Kilometers</option>--%>
<%--        <option ${conversionResults.unit == 'miles' ? 'selected' : ''} value="miles">Miles</option>--%>
<%--    </select>--%>

<%--    <input type="number" name="value" placeholder="Enter a value to convert">--%>

<%--    <input type="submit" value="Convert">--%>

</form>

<c:if test="${not empty conversionResults}">
    <h2>Converted Value: ${conversionResults.convertedValue}</h2>
</c:if>

</body>
</html>