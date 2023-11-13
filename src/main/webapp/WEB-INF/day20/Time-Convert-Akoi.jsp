<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
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
      <h1> Convert Time</h1>
      <p class="lead">Select the type of conversion you would like to perform and the time.
        <br />Press enter to see the result.</p>
      <form method="POST" action="time-convert-akoi">
        <select class="form-select mb-4" name ="timeconvert" aria-label="select a time to convert">
          <option>Select a time to convert</option>
          <option ${results.timeconvert == 'sec' ? 'selected': ''} value="sec">Second</option>
          <option ${results.timeconvert == 'min' ? 'selected': ''} value="min">Minute</option>
          <option  ${results.timeconvert == 'hr' ? 'selected': ''} value="hr">Hour</option>
        </select>
        <div class="form-group mb-2">
          <label for="timevalue"> Enter the time in seconds</label>
          <input value="${results.timevalue}" type="text" class="form-control" id="timevalue" name="timevalue">
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
        <c:if test="${results.converted != ''}">
          <p>${results.converted}</p>
        </c:if>
        <c:if test="${results.timeconverterror != ''}">
          <p>${results.timeconverterror}</p>
        </c:if>
        <c:if test="${results.timevalueerror != ''}">
          <p>${results.timevalueerror}</p>
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