package com.kirkwood;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet(name = "michaelServlet", value = "/michael_tvm_calculator")
public class MichaelServlet extends HttpServlet {
//    private static String results;
//
//    private String presentValue;
//    private String interestRate;
//    private String numberOfPeriods;
//    private String usesMonths;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/michael_tvm_calculator.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String presentValue = req.getParameter("presentValue");
        String interestRate = req.getParameter("interestRate");
        String numberOfPeriods = req.getParameter("numberOfPeriods");
        String usesMonths = req.getParameter("usesMonths");
        String results = "";
        results = calculateFutureValue(presentValue, interestRate, numberOfPeriods, usesMonths);
        req.setAttribute("results", results);
        req.getRequestDispatcher("WEB-INF/michael_tvm_calculator.jsp").forward(req, resp);

    }

    @Override
    public void init() throws ServletException {
        super.init();
    }

    public String calculateFutureValue(String present, String interest, String periods, String usesMonths){
        double value;
        double rate;
        int numPeriods;
        double numYears;
        int periodsPerYear;

        // bubble bubble
        try{
            value = validateRoundNumber(present);
            rate = validateRoundNumber(interest) * .01;
            numPeriods = validateRoundPeriods(validateRoundNumber(periods));
        }
        catch (Exception e) {
            return e.getMessage();
        }
        // apply selected period
        if(usesMonths.equals("months")){
            periodsPerYear = 12;
            numYears = numPeriods / 12.0;
        } else{
            periodsPerYear = 1;
            numYears = numPeriods;
        }
        // TVM Formula
        double futureValue = value * Math.pow((1 + (rate /periodsPerYear)), (periodsPerYear * numYears));
        return String.format("$%,.2f", futureValue);
    }
    // Trying out some exception bubbling
    public Double validateRoundNumber(String number) throws Exception {
        double validNumber;
        try{
            validNumber = Double.parseDouble(number);
        }
        catch (Exception e) {
            throw new Exception("Inputs must be numbers.");
        }
        return Math.round(validNumber * 100.0) / 100.0;
    }
    public int validateRoundPeriods(double periods) throws Exception {
        if (periods <= 0) {
            throw new Exception("Must enter 1 or more compounding periods");
        }
        return (int) Math.round(periods);
    }

}