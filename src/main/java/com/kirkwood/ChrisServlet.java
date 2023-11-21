package com.kirkwood;

import com.kirkwood.utilities.Helpers;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "ChrisServlet", value = "/chrisFutureValue")
public class ChrisServlet extends HttpServlet {
  Map<String, String> results = new HashMap<>();
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.getRequestDispatcher("WEB-INF/chrisFutureValue.jsp").forward(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String value = request.getParameter("value");
    String rate = request.getParameter("rate");
    String time = request.getParameter("time");
    String increment = request.getParameter("increment");
    String eapr = request.getParameter("eapr");
    if(eapr == null){
      eapr = "off";
    }
    results.clear();
    results.put("value", value);
    results.put("rate", rate);
    results.put("time", time);
    results.put("increment", increment);
    results.put("eapr", eapr);
    calcFutureValue(value, rate, time, increment, eapr);
    request.setAttribute("results", results);
    request.getRequestDispatcher("WEB-INF/chrisFutureValue.jsp").forward(request, response);
  }

  private void calcFutureValue(String value, String rate, String time, String increment, String eapr){
    boolean error = false;
    if(!Helpers.isANumber(value) || Double.parseDouble(value) <= 0){
      results.put("valueError", "Please input a positive number.");
      error = true;
    }
    if(!Helpers.isANumber(rate) || Double.parseDouble(rate) <= 0){
      results.put("rateError", "Please input a valid APR.");
      error = true;
    }
    if(!Helpers.isANumber(time) || Integer.parseInt(time) <=0){
      results.put("timeError", "Please enter a whole number.");
      error = true;
    }
    if(!increment.equalsIgnoreCase("mo") && !increment.equalsIgnoreCase("yr")){
      results.put("incrementError", "Please select month or year.");
      error = true;
    }
    if(!error){
      double v = Double.parseDouble(value);
      double r = Double.parseDouble(rate)*.01;
      int p = Integer.parseInt(time);
      double fv = 0d;
      if(eapr.equals("on")){
        // FV = PV*(1+(Rate/12))^(12*Periods)
        if(increment.equalsIgnoreCase("mo")){
          fv = v*(Math.pow((1+(r/12)),(12*p)));
          results.put("fv", String.format("%,.2f", fv));
        } else {
          fv = v*(Math.pow((1+(r/12)),(12*(p*12))));
          results.put("fv", String.format("%,.2f", fv));
        }
      } else {
        // FV = PV*(1+Rate)^Periods
        if(increment.equalsIgnoreCase("mo")){
          fv = v*(Math.pow((1+r),(p)));
          results.put("fv", String.format("%,.2f", fv));
        } else {
          fv = v*(Math.pow((1+r),(p*12)));
          results.put("fv", String.format("%,.2f", fv));
        }
      }
    }
  }
}
