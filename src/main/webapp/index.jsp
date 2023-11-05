<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My Fraction Number App</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<div class="container my-4">
    <div class="row">
        <div class="col-6">
            <p class="lead">Enter two fractions and press submit to calculate the mixed number.</p>
            <form method="POST" action="fractionconvert">
                <select name="choice" class="form-select" aria-label="Select a time period">
                    <option>Select a time period</option>
                    <option name="simplify" value="simplify">Simplify Convert</option>
                    <option name="mixednumber" value="mixednumber">Mixed Number Convert</option>
                </select>

                <label for="num1">Fraction Example (1/2)</label>
                <div>
                    <label for="num1">Fraction:</label>
                </div>
                <input name="num1" type="text" class="form-control" id="num1">
                <p>Results: ${results.get("results")}</p>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
    <head>
        <title>JSP - Hello World</title>
    </head>
        <body>
        <h1>Java 2 Kirkwood Monday-Wednesday Calculators</h1>
        <br/>
        <a href="kate_compound_interest">
            Kate's Compound Interest Calculator
        </a>
        <br/>
        <a href="james-measuring-conversion">Measuring Conversions - James</a>
        <br/>
        <a href="jared_volume_conversion">
            Jared's Volume Converter
        </a>
        <br/>
        <a href="tyler-calculator">Tyler's Calculator</a>
        <br/>
        <a href="mitchellservlet">Mitchell's Calculator</a>
        <br/>
        <a href="Darryl_miles_meters">Darryl's Calculator</a>
        <br/>
        <a href="/Open_Source_2023_mon_wed_war_exploded/convert-fraction">Mohmed's Fraction Converter</a>
        <br/>
        <a href="uscs-calculator">Ben's US Customary System Conversion Calculator</a>
        <br/>
        <a href="time-convert-akoi">Akoi's Time Converter</a>
        <br/>
        <a href="everett-metric-calculator">
            Everett's Metric Conversion Calculator
        </a>
        <br/>
        <a href="julien_measure_converter">
            Julien's Measurement Calculator
        </a>
        <br/>
        <a href="distance-convert">Christivie's Calculator</a>
        <br/>
        <a href="chrisFutureValue">Chris's Future Value Calculator</a>
    </body>
</html>