<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Conversion Calculator</title>
</head>
<body>
<h1>Conversion Calculator</h1>
<form action="Conversion" method="get">
    <label for="inputValue">Enter Value:</label>
    <input type="text" id="inputValue" name="inputValue" placeholder="Enter a value" />

    <select name="unit" class="form-select" aria-label="Select a unit">
        <option value="meters" ${"meters".equals(requestScope.selectedUnit) ? 'selected' : ''}>Meters</option>
        <option value="miles" ${"miles".equals(requestScope.selectedUnit) ? 'selected' : ''}>Miles</option>
        <option value="kilometers" ${"kilometers".equals(requestScope.selectedUnit) ? 'selected' : ''}>Kilometers</option>
    </select>

    <input type="submit" value="Convert" />
</form>

<p>Result: <span>${result}</span></p>
</body>
</html>
