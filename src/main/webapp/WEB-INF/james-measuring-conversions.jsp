<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>


<%-- This is called a page directive. Use to import java files--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- Scriplets contain Java code embedded within HTML --%>
<%--Comment for push2 --%>

<html>
<head>
    <title>My Calculator App</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<div class="container my-4">
    <div class="row">
        <div class="col-8">
            <h1>Let's Convert!</h1>

            <form method="POST" action="james-measuring-conversions">
                <div class="form-group mb-2 border p-2">
                    <h3>Original Amount: </h3>
                    <input name="amount" value="${results.amount}" type="text" class="form-control my-3" id="amount">
                    <select name="og-type" class="form-select" aria-label="Original Amount:">
                        <option ${results.og_type == 'og-cups' ? 'selected' : ''} value="og-cups">Cups</option>
                        <option ${results.og_type == 'og-pints' ? 'selected' : ''} value="og-pints">Pints</option>
                        <option ${results.og_type == 'og-quarts' ? 'selected' : ''} value="og-quarts">Quarts</option>
                        <option ${results.og_type == 'og-gallons' ? 'selected' : ''} value="og-gallons">Gallons</option>
                    </select>
                </div>
                <div class="form-group mb-2 border p-2">
                    <h3>Convert to:</h3>
                    <select name="new-type" class="form-select" aria-label="Conversion:">
                        <option ${results.new_type == 'new-cups' ? 'selected' : ''} value="new-cups">Cups</option>
                        <option ${results.new_type == 'new-pints' ? 'selected' : ''} value="new-pints">Pints</option>
                        <option ${results.new_type == 'new-quarts' ? 'selected' : ''} value="new-quarts">Quarts</option>
                        <option ${results.new_type == 'new-gallons' ? 'selected' : ''} value="new-gallons">Gallons</option>
                    </select>
                </div>
                <button type="submit" class="btn btn-success">Convert</button>
            </form>

            <c:if test="${results.conversion != ''}">
                <h4>${results.conversion}</h4>
            </c:if>
            <c:if test="${results.invalidNumber != ''}">
                <h3>${results.invalidNumber}</h3>
            </c:if>
            <c:if test="${results.typeError != ''}">
                <h3>${results.typeError}</h3>
            </c:if>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>
