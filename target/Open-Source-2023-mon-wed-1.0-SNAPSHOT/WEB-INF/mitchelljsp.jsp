<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fraction conversion</title>
</head>
<body>
    <h3>Input the numerator and denominator here and click convert to get a mixed fraction (if applicable)</h3>
    <form method="post" action="mitchellservlet">
        <ul>
            <li><p><b>Numerator:</b>
                <input type = "text" name = "numerator">
            </p></li>
            <li><p><b>Denominator:</b>
                <input type = "text" name = "denominator">
            </p></li>
        </ul>
        <button id="Submit" type="submit" >Convert</button>
    </form>
    <p>${result.convertOutput}</p>
</body>
</html>
